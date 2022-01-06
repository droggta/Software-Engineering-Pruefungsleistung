public abstract class Tank {

    protected int volume;
    private TankSubstance content;

    public int getVolume() {
        return volume;
    }

    public void consumeVolume(int pVolume) {
        volume = volume - pVolume;
    }
}
