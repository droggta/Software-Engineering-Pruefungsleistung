public class Switch {

    private SwitchType aSwitchType;           //Type of the Switch defines its functionality
    private SwitchStatus aSwitchStatus;       //Status can be off or on

    //Constructor
    public Switch() {

    }

    //Getters & Setters
    public SwitchType getaSwitchType() {
        return aSwitchType;
    }

    public void setaSwitchType(SwitchType aSwitchType) {
        this.aSwitchType = aSwitchType;
    }

    public SwitchStatus getaSwitchStatus() {
        return aSwitchStatus;
    }

    public void setaSwitchStatus(SwitchStatus aSwitchStatus) {
        this.aSwitchStatus = aSwitchStatus;
    }

    //Functions
    private void turnOn(){
        aSwitchStatus = SwitchStatus.on;
    }

    private void turnOff(){
        aSwitchStatus = SwitchStatus.off;
    }



}
