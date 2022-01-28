public class BatteryBox {

    private Battery[] aBattery;

    public void setaBattery(Battery[] aBattery) {
        this.aBattery = aBattery;
    }

    public BatteryBox() {
    }

    public void load() {

    }

    public void takeOut() {

    }

    public int getallSoC(){
        int content = 0;
        for (int i = 0; i < 4; i++){
            content += aBattery[i].getaSoC();
        }
        return content;
    }
}
