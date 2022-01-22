public class Driver {

    private JoystickFrontCannon aJoyStickFrontCannon;
    private GasPedal aGasPedal;
    private BreakPedal aBreakPedal;
    private SterringWheel aSterringWheel;

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



}
