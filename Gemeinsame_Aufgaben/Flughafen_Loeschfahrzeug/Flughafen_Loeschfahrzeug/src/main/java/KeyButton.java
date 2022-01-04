public class KeyButton {

    private Joystick aJoystick;

    public KeyButton() {

    }

    public KeyButton(Joystick aJoystick) {
        this.aJoystick = aJoystick;
    }

    public void push(){
        aJoystick.pushKeyButton();
    }
}
