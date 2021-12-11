import javax.naming.ldap.Control;

public class KnobFrontCannon {

    private CannonModes aCannonModes;
    private ControlPanel aControlPanel;

    public KnobFrontCannon() {
        aCannonModes = CannonModes.modeA;

    }


    public void setaControlPanel(ControlPanel aControlPanel) {
        this.aControlPanel = aControlPanel;
    }

    public CannonModes getaCannonModes() {
        return aCannonModes;
    }
}
