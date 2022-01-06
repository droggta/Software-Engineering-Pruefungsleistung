public class FoamTank extends Tank {

    public FoamTank() {
        volume = 2500;      //2500 as initaal value
    }

    @Override
    public void consumeVolume(int pVolume) {
        super.consumeVolume(pVolume);
    }
}
