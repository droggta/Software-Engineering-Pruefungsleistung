public enum BatteryManagement {
    instance;

    private BatteryBox aBatteryBox;

    public void setaBatteryBox(BatteryBox pBatteryBox){
        aBatteryBox = pBatteryBox;
    }

    public void takeOut(){
        aBatteryBox.takeOut();
    }

    public void load(){
        aBatteryBox.load();
    }

}
