public class IntHoldButton {

    private final IntJoystick aJoystick;

    public IntHoldButton(IntJoystick pJoystick){aJoystick = pJoystick;}

    public void pressHoldButton(){aJoystick.pushHoldButton();}

    public void releaseHoldButton(){aJoystick.releaseHoldButton();}

}
