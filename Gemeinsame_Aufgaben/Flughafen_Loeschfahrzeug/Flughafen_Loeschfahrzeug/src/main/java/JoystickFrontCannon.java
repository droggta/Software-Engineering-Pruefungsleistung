public class JoystickFrontCannon extends Joystick{

    public JoystickFrontCannon(CentralUnit c) {
        super(c);
    }

    /**
     * Is used to actived/deactived front cannon or changing the mixture. Depends if position right or left
     * @param aPosition defines if the left or right button is pressed. Only Position.left or Position.right are valid parameters
     * @param aButtonStatus
     */
    @Override
    public void pushPressButton(Position aPosition, ButtonStatus aButtonStatus) {

        switch (aPosition) {
            case left:
                if(aButtonStatus == ButtonStatus.active) {
                    aCentralUnit.activateRoofCannon(true);
                }
                if(aButtonStatus == ButtonStatus.inactiv){
                    aCentralUnit.activateRoofCannon(false);
                }
                break;
            case right: 

        }

    }
}
