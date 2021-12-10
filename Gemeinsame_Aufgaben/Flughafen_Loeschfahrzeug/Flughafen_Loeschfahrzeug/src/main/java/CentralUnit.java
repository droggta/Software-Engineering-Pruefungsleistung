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
}
