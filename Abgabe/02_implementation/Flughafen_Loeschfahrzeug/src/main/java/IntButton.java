public class IntButton {

    private final IntJoystick aJoystick;

    public IntButton(IntJoystick pJoystick){aJoystick = pJoystick;}

    public void pressButton(){aJoystick.pushButton();}
}
