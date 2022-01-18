public class Operator {

    private ControlPanel aControlPanel;
    private JoystickRoofCannon aJoystickRoofCannon;
    private KnobFrontCannon bKnobFrontCannon;
    private KnobRoofCannon bKnobRoofCannon;

    public void setbKnobFrontCannon(KnobFrontCannon bKnobFrontCannon) {
        this.bKnobFrontCannon = bKnobFrontCannon;
    }

    public void setbKnobRoofCannon(KnobRoofCannon bKnobRoofCannon) {
        this.bKnobRoofCannon = bKnobRoofCannon;
    }

    public void setaControlPanel(ControlPanel aControlPanel) {
        this.aControlPanel = aControlPanel;
    }

    public void setaJoystickRoofCannon(JoystickRoofCannon ajoystickRoofCannon) {
        this.aJoystickRoofCannon = ajoystickRoofCannon;
    }

    public Operator() {

    }

    /**
     * Operator usese the Knob to change the CannonMode of the RoofCannon
     * @param cannonMode
     */
    public void useKnobJoystickRoofCannon(CannonModes cannonMode){
        bKnobRoofCannon.setaCannonMode(cannonMode);
    }

    /**
     * Operator usese the Knob to change the CannonStep of the FrontCannon
     * @param cannonStep
     */
    public void useKnobJoystickFrontCannon(CannonSteps cannonStep){
        bKnobFrontCannon.setaCannonStep(cannonStep);
    }

}
