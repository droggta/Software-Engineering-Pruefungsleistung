public class FrontCannon {

    private MixingUnit aMixingUnit;
    private int angle;          //angle can be between 0 and 180

    private CannonStatus aCannonStatus;

    public void setaMixingUnit(MixingUnit aMixingUnit) {
        this.aMixingUnit = aMixingUnit;
    }

    public void setaCannonStatus(CannonStatus aCannonStatus) {
        this.aCannonStatus = aCannonStatus;
    }

    public CannonStatus getaCannonStatus() {
        return aCannonStatus;
    }

    public FrontCannon() {

    }

    public void setFrontCannonAngle(int i) {
        if(i <= 180){
            angle = i;
        }
    }

    public void emit(int units) {
    }
}
