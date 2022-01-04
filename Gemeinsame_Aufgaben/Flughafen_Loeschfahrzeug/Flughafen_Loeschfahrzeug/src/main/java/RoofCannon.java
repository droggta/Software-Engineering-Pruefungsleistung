public class RoofCannon {

    private MixingUnit aMixingUnit;
    private Segment1 aSegment1;
    private Segment2 aSegment2;
    private CannonStatus aCannonStatus;

    public void setaSegment1(Segment1 aSegment1) {
        this.aSegment1 = aSegment1;
    }

    public void setaSegment2(Segment2 aSegment2) {
        this.aSegment2 = aSegment2;
    }

    public void setaMixingUnit(MixingUnit aMixingUnit) {
        this.aMixingUnit = aMixingUnit;
    }

    public void setaCannonStatus(CannonStatus aCannonStatus) {
        this.aCannonStatus = aCannonStatus;
    }

    public CannonStatus getaCannonStatus() {
        return aCannonStatus;
    }

    public RoofCannon() {

    }

    public void setRoofCannonAngle(int angle) {
        aSegment1.changeSegmentAngle(angle);
    }

    public void adjustMixture() {
        if(aCannonStatus == CannonStatus.activated) {       //only if the cannon is activated the foam rate can be adjusted
            aMixingUnit.adjustFoamRate();
        }
    }

    public void emit(int units) {
    }
}
