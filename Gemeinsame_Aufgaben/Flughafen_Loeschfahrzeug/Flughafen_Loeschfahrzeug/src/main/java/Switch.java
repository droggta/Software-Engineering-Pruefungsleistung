public class Switch {

    private final SwitchType aSwitchType;
    private SwitchStatus aSwitchStatus;
    private ControlPanel aControlPanel;

    /**
     * Create a Switch
     * @param type defines the type of Switch.
     */
    public Switch(SwitchType type){
        aSwitchStatus = SwitchStatus.off;       //Initial value
        aSwitchType = type;
    }

    /**
     * Sets the reference to the controlPanel the switch belongs to
     * @param bControlPanel
     */
    public void setaControlPanel(ControlPanel bControlPanel) {
    }

    public SwitchType getaSwitchType() {
        return aSwitchType;
    }

    public SwitchStatus getaSwitchStatus() {
        return aSwitchStatus;
    }

    public void turnOn(){
        aSwitchStatus = SwitchStatus.on;
        aControlPanel.useSwitch(aSwitchType, aSwitchStatus);

    }

    public void turnOff(){
        aSwitchStatus = SwitchStatus.off;
        aControlPanel.useSwitch(aSwitchType, aSwitchStatus);
    }


}
