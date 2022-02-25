public abstract class Joystick {

    protected CentralUnit aCentralUnit;
    private LeftPressButton aLeftPressButton;
    private RightPressButton aRightPressButton;
    private KeyButton aKeyButton;


    public Joystick(CentralUnit aCentralUnit) {
        this.aCentralUnit = aCentralUnit;
    }

    public Joystick() {

    }

    public void setaLeftPressButton(LeftPressButton pLeftPressButton) {
        aLeftPressButton = pLeftPressButton;
    }

    public void setaRightPressButton(RightPressButton pRightPressButton) {
        aRightPressButton = pRightPressButton;
    }

    protected void setaKeyButton(KeyButton pKeyButton) {
        aKeyButton = pKeyButton;
    }

    public void setaCentralUnit(CentralUnit pCentralUnit) {
        aCentralUnit = pCentralUnit;
    }

    public abstract void pushPressButton(Position aPosition);

    public abstract void pushKeyButton();
}
