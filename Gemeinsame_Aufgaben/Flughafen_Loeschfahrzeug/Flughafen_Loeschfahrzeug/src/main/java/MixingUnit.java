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

}
