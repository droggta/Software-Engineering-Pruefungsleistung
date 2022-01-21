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

    public int getaCannonStepAsInt(){
        switch (aCannonStep){
            case fuenfhundert:
                return 500;
            case tausend:
                return 1000;
            case tausendfuenfhundert:
                return 1500;
            case zweitausend:
                return 2000;
            case zweitausendfuenfhundert:
                return 2500;
            case dreitausend:
                return 3000;
            case dreitausendfuenfhundert:
                return 3500;
        }
    }

    public void setaCannonStep(CannonSteps step){
        aCannonStep = step;
    }

}
