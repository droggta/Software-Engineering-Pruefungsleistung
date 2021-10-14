public class Builder {

    private Camera camera;

    public Builder()
    {

    }

    public void init()
    {

        Core[] kerne = new Core[2];
        Chip[] chips = new Chip[2];
        chips[0] = new Chip(kerne, "1");
        chips[1] = new Chip(kerne, "2");

        MemoryCard SSD = new MemoryCard();

        IRLed[] Leds = new IRLed[24];

        for (int i = 0; i < 24; i++)
        {
            Leds[i] = new IRLed();
        }

        camera = new Camera("1234567890", chips, SSD, Leds);

    }

    public Camera getCamera()
    {
        return camera;
    }

}
