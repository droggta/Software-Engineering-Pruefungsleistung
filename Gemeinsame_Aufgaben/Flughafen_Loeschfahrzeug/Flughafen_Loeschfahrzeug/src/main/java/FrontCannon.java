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
        int waterVolume;        //Volume of water being used in one iteration
        int foamVolume;         //Volume of foam being used in one iteration

        foamVolume = (int) (units * (aMixingUnit.getaFoamRateAsInt()*0.01));
        waterVolume = (int) (units * (1 - (aMixingUnit.getaFoamRateAsInt()*0.01)));

        aMixingUnit.consumeWater(waterVolume);
        aMixingUnit.consumeFoam(foamVolume);
    }
}
