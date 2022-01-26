public class Battery {

    private int aCapacity;
    private BatteryStatus aBatteryStatus;
    private int aSoC;        //Soc = State of Charge

    public Battery() {
        aCapacity = 100000;
        aSoC = 100000;
    }

    public int getaSoC() {
        return aSoC;
    }
}
