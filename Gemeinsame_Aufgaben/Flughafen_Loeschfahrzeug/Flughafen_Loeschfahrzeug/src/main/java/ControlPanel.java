public class ControlPanel {

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
    }



    public ControlPanel() {

    }

    /**
     * returns current CannonStep being set by the KnobFrontCannon
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

}
