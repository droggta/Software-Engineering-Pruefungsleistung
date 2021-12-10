public abstract class PressButton {

    private Position aPosition;
    private ButtonStatus aButtonStatus = ButtonStatus.inactiv;  //inital value

    public void push(){



        if (aButtonStatus == ButtonStatus.active)
        {
            aButtonStatus = ButtonStatus.inactiv;
        }
        else
            {
                aButtonStatus = ButtonStatus.active;
            }

    }

}
