import javax.naming.ldap.Control;

public class KnobFrontCannon {

    private CannonSteps aCannonStep;
    private ControlPanel aControlPanel;

    public KnobFrontCannon() {
        aCannonStep = CannonSteps.fuenfhundert;

    }


    public void setaControlPanel(ControlPanel aControlPanel) {
        this.aControlPanel = aControlPanel;
    }

    /**
     * returns current CannonStep
     * @return
     */
    public CannonSteps getaCannonStep() {
        return aCannonStep;
    }

    public void setaCannonStep(CannonSteps step){
        aCannonStep = step;
    }

}
