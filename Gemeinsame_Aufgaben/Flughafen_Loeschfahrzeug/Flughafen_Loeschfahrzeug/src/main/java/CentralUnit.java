import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class CentralUnit {

    private JoystickRoofCannon aJoystickRoofCannon;
    private JoystickFrontCannon aJoystickFrontCannon;
    private GasPedal aGasPedal;
    private BreakPedal aBreakPedal;
    private SterringWheel aSteeringWheel;
    private ControlPanel aControlPanel;
    private FLF aFLF;
    //Komplexaufgaben
    private int aCode = 6072;
    private String[] aPersonArray = new String[] {"FT-DUS-FLF-5-Red Adair-6072", "FT-DUS-FLF-5-Sam-6072"};          //2 because of Operator and Driver => 2 Persons
    private Cipher decryptCipher;
    private byte[] decodedKey = Base64.getDecoder().decode("1234");
    private SecretKey aKey = new SecretKeySpec(decodedKey, 0 , decodedKey.length, "DES");

    public void setaJoystickRoofCannon(JoystickRoofCannon aJoystickRoofCannon) {
        this.aJoystickRoofCannon = aJoystickRoofCannon;
    }

    public void setaJoystickFrontCannon(JoystickFrontCannon aJoystickFrontCannon) {
        this.aJoystickFrontCannon = aJoystickFrontCannon;
    }

    public void setaGasPedal(GasPedal aGasPedal) {
        this.aGasPedal = aGasPedal;
    }

    public void setaBreakPedal(BreakPedal aBreakPedal) {
        this.aBreakPedal = aBreakPedal;
    }

    public void setaSteeringWheel(SterringWheel aSteeringWheel) {
        this.aSteeringWheel = aSteeringWheel;
    }

    public void setaControlPanel(ControlPanel aControlPanel) {
        this.aControlPanel = aControlPanel;
    }

    public void setaFLF(FLF aFLF) {
        this.aFLF = aFLF;
    }

    public CentralUnit() throws Exception {
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

    public void adjustMixture() {
        aFLF.adjustMixture();
    }


    public void emitExtinguishingAgentFrontCannon() {
        int units = 0;          //units per iteration
        switch (aControlPanel.getFrontCannonStep()){
            case fuenfhundert:
                units = 500;
                break;
            case tausend:
                units = 1000;
                break;
            case tausendfuenfhundert:
                units = 1500;
                break;
            case zweitausend:
                units = 2000;
                break;
            case zweitausendfuenfhundert:
                units = 2500;
                break;
            case dreitausend:
                units = 3000;
                break;
            case dreitausendfuenfhundert:
                units = 3500;
                break;
        }

        aFLF.emitExtinguishingAgentCannon(units, "front");
    }

    public void emitExtinguishingAgentRoofCannon() {
        int units = 0;
        switch (aControlPanel.getRoofCannonMode()){
            case modeA:
                units = 500;
                break;
            case modeB:
                units = 1000;
                break;
            case modeC:
                units = 2500;
                break;
        }

        aFLF.emitExtinguishingAgentCannon(units, "roof");
    }

    public void useSwitch(SwitchType type, SwitchStatus sStatus){
        boolean status;
        switch (sStatus){
            case off:
                status = false;
                break;
            case on:
                status = true;
                break;
            default:
                status = false;
        }

        switch (type){
            case electricEngines:
                aFLF.activateElectricEngine(status);
                break;
            case warningLight:
                aFLF.activateWarningLight(status);
                break;
            case blueLight:
                aFLF.activateBlueLight(status);
                break;
            case headLamp:
                aFLF.activateHeadLights(status, 0, 1);
                break;
            case roofMountedLight:
                aFLF.activateHeadLights(status, 2, 3);
                break;
            case sideLamp:
                aFLF.activateHeadLights(status, 4, 9);
                break;
        }
    }

    public FoamRate getcurrentFoamRate() {
        return aFLF.getFoamRate();
    }

    public String decipherString(String aEncryptedString, SecretKey key) throws Exception{
        decryptCipher = Cipher.getInstance("DES");
        decryptCipher.init(Cipher.DECRYPT_MODE, key);
        byte[] dec = Base64.getEncoder().encode(aEncryptedString.getBytes(StandardCharsets.UTF_8));
        byte[] utf8 = decryptCipher.doFinal(dec);
        return new String(utf8, "UTF8");
    }

    public void receiveIDCardString(String getaEncryptedString) {
        boolean check = false;
        try {
            String temp = decipherString(getaEncryptedString, aKey);
            for(int i=0 ; i < aPersonArray.length; i++){
                if(aPersonArray[i] == temp){
                    check = true;
                }
            }
            if(check == true){
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
