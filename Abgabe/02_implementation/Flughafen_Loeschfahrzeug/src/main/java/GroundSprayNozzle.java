public class GroundSprayNozzle {

    private WaterTank aWaterTank;

    public void setaWaterTank(WaterTank aWaterTank) {
        this.aWaterTank = aWaterTank;
    }

    public GroundSprayNozzle() {

    }

    public void sprayWater(){
        aWaterTank.consumeVolume(100);
    }

}
