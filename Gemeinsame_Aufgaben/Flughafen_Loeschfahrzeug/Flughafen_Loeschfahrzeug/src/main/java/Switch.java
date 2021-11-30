public class Switch {

    private SwitchType aSwitchType;           //Type of the Switch defines its functionality
    private SwitchStatus aSwitchStatus;       //Status can be off or on

    public Switch() {

    }

    private void turnOn(){
        aSwitchStatus = SwitchStatus.on;
    }

    private void turnOff(){
        aSwitchStatus = SwitchStatus.off;
    }



}
