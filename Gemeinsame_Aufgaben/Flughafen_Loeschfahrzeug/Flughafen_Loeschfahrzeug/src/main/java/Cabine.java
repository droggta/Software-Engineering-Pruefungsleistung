public class Cabine {

    private Doors[] aDoors;
    private JoystickFrontCannon aJoystickFrontCannon;
    private JoystickRoofCannon aJoystickRoofCannon;
    private SpeedDisplay aSpeedDisplay;
    private EnergyDisplay aEnergyDisplay;
    private ControlPanel aControlPanel;
    private Seats[] aSeats;
    private GasPedal aGasPedal;
    private BreakPedal aBreakPedal;
    private SterringWheel aSterringWheel;
    private int velocity = 0;

    public void setaGasPedal(GasPedal aGasPedal) {
        this.aGasPedal = aGasPedal;
    }

    public void setaBreakPedal(BreakPedal aBreakPedal) {
        this.aBreakPedal = aBreakPedal;
    }

    public void setaSterringWheel(SterringWheel aSterringWheel) {
        this.aSterringWheel = aSterringWheel;
    }

    public void setaSeats(Seats[] aSeats) {
        this.aSeats = aSeats;
    }

    public void setaDoors(Doors[] aDoors) {
        this.aDoors = aDoors;
    }

    public void setaJoystickFrontCannon(JoystickFrontCannon aJoystickFrontCannon) {
        this.aJoystickFrontCannon = aJoystickFrontCannon;
    }

    public void setaJoystickRoofCannon(JoystickRoofCannon aJoystickRoofCannon) {
        this.aJoystickRoofCannon = aJoystickRoofCannon;
    }

    public void setaSpeedDisplay(SpeedDisplay aSpeedDisplay) {
        this.aSpeedDisplay = aSpeedDisplay;
    }

    public void setaEnergyDisplay(EnergyDisplay aEnergyDisplay) {
        this.aEnergyDisplay = aEnergyDisplay;
    }

    public void setaControlPanel(ControlPanel aControlPanel) {
        this.aControlPanel = aControlPanel;
    }

    public Cabine() {

    }

    /**
     * Sets the speed being displayed in the display
     * @param aVelocity speed in km/h
     */
    public void setaSpeedDisplayValue(int aVelocity) {
        aSpeedDisplay.setValue(aVelocity);
    }
}
