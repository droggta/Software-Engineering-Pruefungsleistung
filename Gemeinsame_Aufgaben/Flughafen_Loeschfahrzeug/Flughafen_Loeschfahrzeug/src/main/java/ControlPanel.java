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
}
