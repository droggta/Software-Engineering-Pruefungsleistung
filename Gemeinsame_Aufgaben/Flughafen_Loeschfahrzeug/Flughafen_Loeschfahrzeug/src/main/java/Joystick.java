public abstract class Joystick {

    private CentralUnit aCentralUnit;
    private LeftPressButton aLeftPressButton;
    private RightPressButton aRightPressButton;
    private KeyButton aKeyButton;

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

}
