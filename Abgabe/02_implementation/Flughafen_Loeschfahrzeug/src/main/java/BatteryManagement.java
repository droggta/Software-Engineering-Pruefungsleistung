public enum BatteryManagement {
    instance;

    private static BatteryBox aBatteryBox;
    private static BatteryStatus aBatteryStatus;

    public static void setaBatteryBox(BatteryBox pBatteryBox){
        aBatteryBox = pBatteryBox;
        aBatteryStatus = BatteryStatus.idle;
    }

    public void takeOut(int unit){
        aBatteryStatus = BatteryStatus.use;
        aBatteryBox.takeOut(unit);
    }

    public void load(int unit){
        aBatteryStatus = BatteryStatus.load;
        aBatteryBox.load(unit);
    }

    public int getSoC(){
        return aBatteryBox.getallSoC();
    }

}
