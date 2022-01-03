public abstract class PressButton {

    private Position aPosition;
    private ButtonStatus aButtonStatus = ButtonStatus.inactiv;  //inital value
    private Joystick bJoystick;

    public void push(){
        if (aButtonStatus == ButtonStatus.active)
        {
            aButtonStatus = ButtonStatus.inactiv;
        }
        else
            {
                aButtonStatus = ButtonStatus.active;
            }

        bJoystick.pushPressButton(aPosition, aButtonStatus);

    }

    public PressButton(Joystick bJoystick) {
        this.bJoystick = bJoystick;
    }

    public PressButton(){

    }

    public void setaPosition(Position aPosition) {
        this.aPosition = aPosition;
    }
}
