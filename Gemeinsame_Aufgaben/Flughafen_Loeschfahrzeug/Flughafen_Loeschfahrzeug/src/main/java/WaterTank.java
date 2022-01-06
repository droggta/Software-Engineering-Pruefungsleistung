public class WaterTank extends Tank{

    public WaterTank() {
        volume = 12500;     //12500 as inital value
    }

    @Override
    public void consumeVolume(int pVolume) {
        super.consumeVolume(pVolume);
    }
}
