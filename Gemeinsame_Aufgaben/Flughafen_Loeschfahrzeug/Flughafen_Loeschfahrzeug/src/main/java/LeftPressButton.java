public class LeftPressButton extends PressButton{

    public LeftPressButton() {
        this.setaPosition(Position.left);
    }

    public LeftPressButton(Joystick j){
        super(j);
        this.setaPosition(Position.left);
    }

}
