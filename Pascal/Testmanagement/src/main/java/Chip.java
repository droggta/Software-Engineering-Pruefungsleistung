public class Chip {

    private String uuid;
    private Core[] kerne;

    public Chip(Core[] pKerne, String puuid)
    {
        kerne = pKerne;
        uuid = puuid;
    }

    public Core[] getCores() { return kerne;}
}
