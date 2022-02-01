public class BatteryBox {

    private Battery[] aBattery;

    public void setaBattery(Battery[] aBattery) {
        this.aBattery = aBattery;
    }

    public BatteryBox() {
    }

    public void load(int unit) {
        unit = (int) Math.floor(unit / aBattery.length);
        for(int i = 0; i < aBattery.length; i++){
            aBattery[i].fillVolume(unit);
        }
    }

    public void takeOut(int unit) {
        unit = (int) Math.floor(unit / aBattery.length);
        for(int i = 0; i < aBattery.length; i++){
            aBattery[i].consumeVolume(unit);
        }
    }

    public int getallSoC(){
        int content = 0;
        for (int i = 0; i < 4; i++){            //4 because of 4 batteries
            content += aBattery[i].getaSoC();
        }
        return content;
    }
}
