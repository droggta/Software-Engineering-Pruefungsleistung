public class IntButton {

    private IntJoystick aJoystick;

    public IntButton(IntJoystick pJoystick){aJoystick = pJoystick;};

    public void pressButton(){aJoystick.pushButton();}
}
