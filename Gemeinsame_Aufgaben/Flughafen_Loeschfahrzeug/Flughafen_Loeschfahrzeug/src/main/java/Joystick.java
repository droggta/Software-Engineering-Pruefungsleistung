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

    public static void setaLeftPressButton(LeftPressButton aLeftPressButton) {
        aLeftPressButton = aLeftPressButton;
    }

    public static void setaRightPressButton(RightPressButton aRightPressButton) {
        aRightPressButton = aRightPressButton;
    }

    public static void setaKeyButton(KeyButton aKeyButton) {
        aKeyButton = aKeyButton;
    }

    public static void setaCentralUnit(CentralUnit aCentralUnit) {
        aCentralUnit = aCentralUnit;
    }

    public abstract void pushPressButton(Position aPosition, ButtonStatus aButtonStatus);
}
