public enum BatteryManagement {
    instance;

    private static BatteryBox aBatteryBox;

    public static void setaBatteryBox(BatteryBox pBatteryBox){
        aBatteryBox = pBatteryBox;
    }

    public void takeOut(){
        aBatteryBox.takeOut();
    }

    public void load(){
        aBatteryBox.load();
    }

}
