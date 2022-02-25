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
     */
    public void adjustFoamRate(FoamRate fRate){
        aFoamRate = fRate;
    }

    /**
     * Function automatically increases the FoamRate by one step
     */
    public void adjustFoamRate(){
        switch (aFoamRate) {
            case zero -> aFoamRate = FoamRate.drei;
            case drei -> aFoamRate = FoamRate.fuenf;
            case fuenf -> aFoamRate = FoamRate.zehn;
            case zehn -> aFoamRate = FoamRate.zero;
            default -> System.out.println("Warning: Problem with adjusting the FoamRate");
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
        return switch (aFoamRate) {
            case zero -> 0;
            case drei -> 3;
            case fuenf -> 5;
            case zehn -> 10;
            default -> -1;
        };
    }

    public void consumeFoam(int foamVolume) {
            aFoamTank.consumeVolume(foamVolume);
    }

    public void consumeWater(int waterVolume) {
        aWaterTank.consumeVolume(waterVolume);
    }
}
