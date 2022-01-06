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

}
