public class KnobRoofCannon {

    private CannonModes aCannonMode;

    public KnobRoofCannon() {
        aCannonMode = CannonModes.modeA;
    }

    public void setaControlPanel(ControlPanel aControlPanel) {
    }

    public CannonModes getaCannonMode() {
        return aCannonMode;
    }

    public int getaCannonModeAsInt(){
        return switch (aCannonMode) {
            case modeA -> 500;
            case modeB -> 1000;
            case modeC -> 2500;
            default -> 0;    //error
        };
    }

    public void setaCannonMode(CannonModes aCannonMode) {
        this.aCannonMode = aCannonMode;
        
    }
}
