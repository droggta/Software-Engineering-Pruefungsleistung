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

    public int getaCannonModeAsInt(){
        switch (aCannonMode){
            case modeA:
                return 500;
            case modeB:
                return 1000;
            case modeC:
                return 2500;
            default:
                return 0;    //error
        }
    }

    public void setaCannonMode(CannonModes aCannonMode) {
        this.aCannonMode = aCannonMode;
        
    }
}
