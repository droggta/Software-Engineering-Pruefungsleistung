public class Segment1 {

    //Segment 1 can be arranged vertically (90 Degree)

    private double angle;       //angle 0=horizontal 90=vertical

    public Segment1(){
        angle = 0;           //initial value
    }

    public void changeSegmentAngle(int i){
        angle = i;
    }

    public double getAngle() {
        return angle;
    }
}
