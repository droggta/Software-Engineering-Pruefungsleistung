public class CentralUnit {

    private JoystickRoofCannon aJoystickRoofCannon;
    private JoystickFrontCannon aJoystickFrontCannon;
    private GasPedal aGasPedal;
    private BreakPedal aBreakPedal;
    private SterringWheel aSteeringWheel;
    private ControlPanel aControlPanel;
    private FLF aFLF;

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
}
