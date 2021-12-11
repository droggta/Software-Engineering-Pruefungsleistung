public class KnobRoofCannon {

    private CannonSteps aCannonSteps;
    private ControlPanel aControlPanel;

    public KnobRoofCannon() {
        aCannonSteps = CannonSteps.fuenfhundert;
    }

    public void setaControlPanel(ControlPanel aControlPanel) {
        this.aControlPanel = aControlPanel;
    }

    public CannonSteps getaCannonSteps() {
        return aCannonSteps;
    }
}
