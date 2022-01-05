public class Segment2 {

    //Segment 2 consists of 3 segments

    private PieceSegment[] aPiecesegment;
    private int angle;      //angle 0=vertical 90=horizontal

    public Segment2(){

    }

    public void setaPiecesegment(PieceSegment[] aPiecesegment) {
        this.aPiecesegment = aPiecesegment;
    }

    public int getAngle() {
        return angle;
    }

    public void setAngle(int angle) {
        this.angle = angle;
    }
}
