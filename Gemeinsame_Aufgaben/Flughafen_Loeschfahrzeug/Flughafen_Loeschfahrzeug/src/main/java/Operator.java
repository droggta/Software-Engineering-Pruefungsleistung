public class Operator {

    private ControlPanel aControlPanel;
    private JoystickRoofCannon aJoystickRoofCannon;
    private KnobFrontCannon bKnobFrontCannon;
    private KnobRoofCannon bKnobRoofCannon;
    private DoorButton[][] aDoorButtons;

    public void setbKnobFrontCannon(KnobFrontCannon bKnobFrontCannon) {
        this.bKnobFrontCannon = bKnobFrontCannon;
    }

    public void setbKnobRoofCannon(KnobRoofCannon bKnobRoofCannon) {
        this.bKnobRoofCannon = bKnobRoofCannon;
    }

    public void setaControlPanel(ControlPanel aControlPanel) {
        this.aControlPanel = aControlPanel;
    }

    public void setbDoorButtons(DoorButton[][] bDoorButtons) {
        this.aDoorButtons = bDoorButtons;
    }

    public void setaJoystickRoofCannon(JoystickRoofCannon ajoystickRoofCannon) {
        this.aJoystickRoofCannon = ajoystickRoofCannon;
    }

    public Operator() {

    }

    /**
     * Operator uses the Knob to change the CannonMode of the RoofCannon
     * @param cannonMode
     */
    public void useKnobJoystickRoofCannon(CannonModes cannonMode){
        bKnobRoofCannon.setaCannonMode(cannonMode);
    }

    public void useKnobJoystickFrontCannon(CannonSteps cannonSteps){
        bKnobFrontCannon.setaCannonStep(cannonSteps);
    }

    public void useJoystickPressButton(Position p) {
        aJoystickRoofCannon.pushPressButton(p);
    }

    /**
     * Use the door Button to close and open Doors of FLF
     * @param position indoor or outdoor Button
     * @param doorIndex 0 = left door   1 = right door
     */
    public void useDoorButton(Position position, int doorIndex){
        int iPosition;
        switch (position){
            case indoor:
                iPosition = 0;
                break;
            case outdoor:
                iPosition = 1;
                break;
            default:
                iPosition = 0;
                break;
        }
        aDoorButtons[doorIndex][iPosition].pushButton();
    }

}
