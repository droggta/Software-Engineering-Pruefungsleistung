import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class CentralUnit {

    private ControlPanel aControlPanel;
    private FLF aFLF;
    //Komplexaufgaben
    private final int aCode = 6072;
    private final String[] aPersonArray = new String[] {"FT-DUS-FLF-5-Red Adair-6072", "FT-DUS-FLF-5-Sam-6072"};          //2 because of Operator and Driver => 2 Persons
    private final byte[] decodedKey = Base64.getDecoder().decode("1234");
    private final SecretKey aKey = new SecretKeySpec(decodedKey, 0 , decodedKey.length, "DES");

    public void setaJoystickRoofCannon(JoystickRoofCannon aJoystickRoofCannon) {
    }

    public void setaJoystickFrontCannon(JoystickFrontCannon aJoystickFrontCannon) {
    }

    public void setaGasPedal(GasPedal aGasPedal) {
    }

    public void setaBreakPedal(BreakPedal aBreakPedal) {
    }

    public void setaSteeringWheel(SterringWheel aSteeringWheel) {
    }

    public void setaControlPanel(ControlPanel aControlPanel) {
        this.aControlPanel = aControlPanel;
    }

    public void setaFLF(FLF aFLF) {
        this.aFLF = aFLF;
    }

    public CentralUnit() {
    }

    /**
     * changes the speed of the FLF by i km/h
     * @param i speed change in km/h
     */
    public void changeSpeedStep(int i) {
        aFLF.updateaVelocity(i);
    }

    /**
     * Sends the updated steeringangle to the FLF
     * @param aSteeringAngle Parameter given in % (minus=left, positiv=right)
     */
    public void steerFLF(int aSteeringAngle) {
        aFLF.steerFLF(aSteeringAngle);
    }


    public void activateFrontCannon() {
        aFLF.activateFrontCannon();
    }

    public void activateRoofCannon() {
        aFLF.activateRoofCannon();
    }

    public void setAngleFrontCannon(int pangle){ aFLF.setFrontCannonAngle(pangle);}

    public void setAngleRoofCannon(int pangle){ aFLF.setRoofCannonAngle(pangle);}

    public void adjustMixture(Joystick pJoystick) {

        if(aFLF.getCannonState(pJoystick) == CannonStatus.activated){
            aFLF.adjustMixture();
        }
    }

    public void adjustMixture() {
        aFLF.adjustMixture();
    }

    public void emitExtinguishingAgentFrontCannon() {
        int units = switch (aControlPanel.getFrontCannonStep()) {
            case fuenfhundert -> 500;
            case tausend -> 1000;
            case tausendfuenfhundert -> 1500;
            case zweitausend -> 2000;
            case zweitausendfuenfhundert -> 2500;
            case dreitausend -> 3000;
            case dreitausendfuenfhundert -> 3500;
        };          //units per iteration

        aFLF.emitExtinguishingAgentCannon(units, "front");
    }

    public void emitExtinguishingAgentRoofCannon() {
        int units = switch (aControlPanel.getRoofCannonMode()) {
            case modeA -> 500;
            case modeB -> 1000;
            case modeC -> 2500;
        };

        aFLF.emitExtinguishingAgentCannon(units, "roof");
    }

    public void useSwitch(SwitchType type, SwitchStatus sStatus){
        boolean status = switch (sStatus) {
            case off -> false;
            case on -> true;
            default -> false;
        };

        switch (type) {
            case electricEngines -> aFLF.activateElectricEngine(status);
            case warningLight -> aFLF.activateWarningLight(status);
            case blueLight -> aFLF.activateBlueLight(status);
            case headLamp -> aFLF.activateHeadLights(status, 0, 1);
            case roofMountedLight -> aFLF.activateHeadLights(status, 2, 3);
            case sideLamp -> aFLF.activateHeadLights(status, 4, 9);
        }
    }

    public FoamRate getcurrentFoamRate() {
        return aFLF.getFoamRate();
    }

    public String decipherString(String aEncryptedString, SecretKey key) throws Exception{
        Cipher decryptCipher = Cipher.getInstance("DES");
        decryptCipher.init(Cipher.DECRYPT_MODE, key);
        byte[] dec = Base64.getEncoder().encode(aEncryptedString.getBytes(StandardCharsets.UTF_8));
        byte[] utf8 = decryptCipher.doFinal(dec);
        return new String(utf8, StandardCharsets.UTF_8);
    }

    public void receiveIDCardString(String getaEncryptedString) {
        boolean check = false;
        try {
            String temp = decipherString(getaEncryptedString, aKey);
            for (String s : aPersonArray) {
                if (s.equals(temp)) {
                    check = true;
                }
            }
            if(check){
                aFLF.changeDoorStatus(1);
                aFLF.changeDoorStatus(0);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    public SecretKey getaKey(){
        return aKey;
    }

    //Komplexaufgaben
}
