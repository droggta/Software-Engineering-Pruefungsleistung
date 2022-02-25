public class KnobFrontCannon {

    private CannonSteps aCannonStep;

    public KnobFrontCannon() {
        aCannonStep = CannonSteps.fuenfhundert;

    }


    public void setaControlPanel(ControlPanel aControlPanel) {
    }

    /**
     * returns current CannonStep
     */
    public CannonSteps getaCannonStep() {
        return aCannonStep;
    }

    public int getaCannonStepAsInt(){
        return switch (aCannonStep) {
            case fuenfhundert -> 500;
            case tausend -> 1000;
            case tausendfuenfhundert -> 1500;
            case zweitausend -> 2000;
            case zweitausendfuenfhundert -> 2500;
            case dreitausend -> 3000;
            case dreitausendfuenfhundert -> 3500;
            default -> 0;//error
        };
    }

    public void setaCannonStep(CannonSteps step){
        aCannonStep = step;
    }

}
