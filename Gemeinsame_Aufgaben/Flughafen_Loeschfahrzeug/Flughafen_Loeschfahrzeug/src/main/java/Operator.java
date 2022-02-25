public class Operator {

    private JoystickRoofCannon aJoystickRoofCannon;
    private KnobFrontCannon aKnobFrontCannon;
    private KnobRoofCannon aKnobRoofCannon;
    private DoorButton[][] aDoorButtons;

    public void setaKnobFrontCannon(KnobFrontCannon aKnobFrontCannon) {
        this.aKnobFrontCannon = aKnobFrontCannon;
    }

    public void setaKnobRoofCannon(KnobRoofCannon aKnobRoofCannon) {
        this.aKnobRoofCannon = aKnobRoofCannon;
    }

    public void setaControlPanel(ControlPanel aControlPanel) {
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
     */
    public void useKnobJoystickRoofCannon(CannonModes cannonMode){
        aKnobRoofCannon.setaCannonMode(cannonMode);
    }

    public void useKnobJoystickFrontCannon(CannonSteps cannonSteps){
        aKnobFrontCannon.setaCannonStep(cannonSteps);
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
        int iPosition = switch (position) {
            case indoor -> 0;
            case outdoor -> 1;
            default -> 0;
        };
        aDoorButtons[doorIndex][iPosition].pushButton();
    }

}
