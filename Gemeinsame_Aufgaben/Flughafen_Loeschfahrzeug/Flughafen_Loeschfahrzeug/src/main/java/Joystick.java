public abstract class Joystick {

    private CentralUnit aCentralUnit;
    private LeftPressButton aLeftPressButton;
    private RightPressButton aRightPressButton;
    private KeyButton aKeyButton;

    public void setaLeftPressButton(LeftPressButton aLeftPressButton) {
        this.aLeftPressButton = aLeftPressButton;
    }

    public void setaRightPressButton(RightPressButton aRightPressButton) {
        this.aRightPressButton = aRightPressButton;
    }

    public void setaKeyButton(KeyButton aKeyButton) {
        this.aKeyButton = aKeyButton;
    }

    public void setaCentralUnit(CentralUnit aCentralUnit) {
        this.aCentralUnit = aCentralUnit;
    }

}
