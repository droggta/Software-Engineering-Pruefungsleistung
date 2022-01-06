public class FrontPivot extends Pivot{

    private int steerAngle = 0;

    public FrontPivot() {

    }

    /**
     * Updates the steering angle by saving it inside of the front pivot
     * @param aSteeringAngle Paramter given in % (minus=left, positiv=right)
     */
    public void updateaSteerAngle(int aSteeringAngle) {
        steerAngle = aSteeringAngle;
    }


    /**
     * returns the current steering angle of the front pivot
     * @return angle given in % (minus=left, positiv=right)
     */
    public int getSteerAngle() {
        return steerAngle;
    }
}
