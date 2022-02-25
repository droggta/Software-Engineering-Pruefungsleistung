public class Cabine {

    private Doors[] aDoors;
    private SpeedDisplay aSpeedDisplay;
    private SterringWheel aSterringWheel;
    private GasPedal aGasPedal;
    private BreakPedal aBreakPedal;
    private Seats[] aSeats;
    private JoystickFrontCannon aJoystickFrontCannon;
    private JoystickRoofCannon aJoystickRoofCannon;
    private EnergyDisplay aEnergyDisplay;
    private ControlPanel aControlPanel;


    public void setaSterringWheel(SterringWheel aSterringWheel) {
        this.aSterringWheel = aSterringWheel;
    }

    public void setaGasPedal(GasPedal aGasPedal){
        this.aGasPedal = aGasPedal;
    }

    public void setaBreakPedal(BreakPedal aBreakPedal){
        this.aBreakPedal = aBreakPedal;
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

    /**
     * Changes the door status of the doors. Index starts at 0
     * @param doorIndex left door 0, right door 1
     * @param newDoorStatus status the door should be set to
     */
    public void changeDoorStatus(int doorIndex, DoorStatus newDoorStatus){
        if(doorIndex < aDoors.length){
            aDoors[doorIndex].setaDoorStatus(newDoorStatus);
        }
    }

    public void changeDoorStatus(int doorIndex){
        if(doorIndex < aDoors.length){
            if(aDoors[doorIndex].getaDoorStatus() == DoorStatus.closed || aDoors[doorIndex].getaDoorStatus() == DoorStatus.open){
                aDoors[doorIndex].setaDoorStatus(DoorStatus.locked);
            }
            else{
                aDoors[doorIndex].setaDoorStatus(DoorStatus.closed);
            }
        }
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
