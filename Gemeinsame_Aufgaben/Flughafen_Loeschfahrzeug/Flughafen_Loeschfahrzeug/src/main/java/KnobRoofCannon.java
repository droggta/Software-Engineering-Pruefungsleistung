public class KnobRoofCannon {

    private CannonModes aCannonMode;
    private ControlPanel aControlPanel;

    public KnobRoofCannon() {
        aCannonMode = CannonModes.modeA;
    }

    public void setaControlPanel(ControlPanel aControlPanel) {
        this.aControlPanel = aControlPanel;
    }

    public CannonModes getaCannonMode() {
        return aCannonMode;
    }
}
