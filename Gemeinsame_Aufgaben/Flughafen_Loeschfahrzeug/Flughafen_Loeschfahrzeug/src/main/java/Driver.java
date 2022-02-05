public class Driver {

    private JoystickFrontCannon aJoyStickFrontCannon;
    private GasPedal aGasPedal;
    private BreakPedal aBreakPedal;
    private SterringWheel aSterringWheel;
    private DoorButton[][] aDoorButtons;

    public void setaSterringWheel(SterringWheel aSterringWheel) {
        this.aSterringWheel = aSterringWheel;
    }

    public void setaJoyStickFrontCannon(JoystickFrontCannon aJoyStickFrontCannon) {
        this.aJoyStickFrontCannon = aJoyStickFrontCannon;
    }

    public void setaGasPedal(GasPedal aGasPedal) {
        this.aGasPedal = aGasPedal;
    }

    public void setaBreakPedal(BreakPedal aBreakPedal) {
        this.aBreakPedal = aBreakPedal;
    }

    public void setbDoorButtons(DoorButton[][] bDoorButtons) {
        this.aDoorButtons = bDoorButtons;
    }

    public Driver() {

    }

    public void accelerate(){
        aGasPedal.changeSpeedStep();
    }

    public void slowDown(){
        aBreakPedal.changeSpeedStep();
    }

    /**
     * Driver uses the steeringWheel in order to change the steering angle
     * @param steeringAngle is the procendual change of the angle in % (minus=left, positiv=right)
     */
    public void steer(int steeringAngle){
        aSterringWheel.steerFLF(steeringAngle);
    }

    /**
     * Driver uses one of the PressButtons of the Joystick for the FrontCannon
     * @param p wheter left or right Button is pressed. Left=de/activate Right=adjust Mixture
     */
    public void useJoystickPressButton(Position p){
        aJoyStickFrontCannon.pushPressButton(p);
    }




    /**
     * emits the extinguishing agent with the set parameters (FoamRate, Units)
     */
    public void useJoystickKeyButton(){
        aJoyStickFrontCannon.pushKeyButton();
    }

    /**
     * Use the door Button to close and open Doors of FLF
     * @param position indoor or outdoor Button
     * @param doorIndex 0 = left door   1 = right door
     */
    public void useDoorButton(Position position, int doorIndex) {
        int iPosition;
        switch (position) {
            case indoor:
                iPosition = 0;
                break;
            case outdoor:
                iPosition = 1;
                break;
            default:
                iPosition = 0;
                break;
        }
        aDoorButtons[doorIndex][iPosition].pushButton();
    }

}
