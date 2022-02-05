public class ControlPanel {

    private Switch[] aSwitch;
    private KnobFrontCannon aKnobFrontCannon;
    private KnobRoofCannon aKnobRoofCannon;
    private CentralUnit aCentralUnit;

    public void setaCentralUnit(CentralUnit aCentralUnit) {
        this.aCentralUnit = aCentralUnit;
    }

    public void setaKnobFrontCannon(KnobFrontCannon aKnobFrontCannon) {
        this.aKnobFrontCannon = aKnobFrontCannon;
    }

    public void setaKnobRoofCannon(KnobRoofCannon aKnobRoofCannon) {
        this.aKnobRoofCannon = aKnobRoofCannon;
    }

    public void setaSwitch(Switch[] aSwitch) {
        this.aSwitch = aSwitch;
    }



    public ControlPanel() {

    }

    /**
     * returns current CannonStep being set by the KnobFrontCannon
     * @return
     */
    public CannonSteps getFrontCannonStep() {
        return aKnobFrontCannon.getaCannonStep();
    }

    public CannonModes getRoofCannonMode() {
        return aKnobRoofCannon.getaCannonMode();
    }

    /**
     * Use one of the six switches
     * @param type Type of switch e.g. for electric motors
     * @param status the status the switch is set to
     */
    public void useSwitch(SwitchType type, SwitchStatus status){
        aCentralUnit.useSwitch(type, status);
    }

    public void useKnobRoofCannon(){
        aCentralUnit.adjustMixture();
    }

    /**
     * Sends the command of closing and opening FLF doors to the CentralUnit
     * @param position indoor or outdoor Button
     * @param doorIndex 0 = left door   1 = right door
     */
    public void useDoorButton(Position position, int doorIndex) {
        aCentralUnit.useDoorButton(position, doorIndex);
    }
}
