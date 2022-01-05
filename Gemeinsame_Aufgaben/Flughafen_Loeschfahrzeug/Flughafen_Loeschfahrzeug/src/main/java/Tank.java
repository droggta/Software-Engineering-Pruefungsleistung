public abstract class Tank {

    private int volume;
    private TankSubstance content;

    public int getVolume() {
        return volume;
    }

    public void consumeVolume(int pVolume) {
        volume = volume - pVolume;
    }
}
