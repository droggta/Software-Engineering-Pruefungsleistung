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

}
