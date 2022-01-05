public class MixingUnit {

    private FoamTank aFoamTank;
    private WaterTank aWaterTank;
    private FoamRate aFoamRate;

    public void setaFoamTank(FoamTank aFoamTank) {
        this.aFoamTank = aFoamTank;
    }

    public void setaWaterTank(WaterTank aWaterTank) {
        this.aWaterTank = aWaterTank;
    }

    public MixingUnit() {
        aFoamRate = FoamRate.zero;      //initial value
    }


    /**
     * changes to the given FoamRate
     * @param fRate
     */
    public void adjustFoamRate(FoamRate fRate){
        aFoamRate = fRate;
    }

    /**
     * Function automatically increases the FoamRate by one step
     */
    public void adjustFoamRate(){
        switch (aFoamRate){
            case zero:
                aFoamRate = FoamRate.drei;
                break;
            case drei:
                aFoamRate = FoamRate.fuenf;
                break;
            case fuenf:
                aFoamRate = FoamRate.zehn;
                break;
            case zehn:
                aFoamRate = FoamRate.zero;
                break;
            default:
                System.out.println("Warning: Problem with adjusting the FoamRate");
                break;
        }
    }

    public FoamRate getaFoamRate(){
        return aFoamRate;
    }

    /**
     * returns FoamRate.
     * E.g. 5% means: 5% foam and 95% water
     * @return FoamRate in percentage
     */
    public int getaFoamRateAsInt(){
        switch (aFoamRate){
            case zero:
                return 0;
            case drei:
                return 3;
            case fuenf:
                return 5;
            case zehn:
                return 10;
            default:
                return -1;
        }
    }

    public void consumeFoam(int foamVolume) {
            aFoamTank.consumeVolume(foamVolume);
    }

    public void consumeWater(int waterVolume) {
        aWaterTank.consumeVolume(waterVolume);
    }
}
