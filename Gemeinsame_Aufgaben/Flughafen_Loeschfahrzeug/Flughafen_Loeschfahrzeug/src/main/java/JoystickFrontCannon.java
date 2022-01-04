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
            case left:      //left button is used for activating and deactivating
                if(aButtonStatus == ButtonStatus.active) {
                    aCentralUnit.setaRoofCannonStatus(CannonStatus.activated);  //activate RoofCannon
                    aCentralUnit.setRoofCannonAngle(90);                        //Change angle of segment1 to 90 degrees (extend arm)
                }
                if(aButtonStatus == ButtonStatus.inactiv){
                    aCentralUnit.setaRoofCannonStatus(CannonStatus.deactivated);
                    aCentralUnit.setRoofCannonAngle(0);                         //Change angle of segment1 to 0 degrees (rectract arm)
                }
                break;
            case right:     //right button is used for adjusting the mixture
                if(aButtonStatus == ButtonStatus.active){
                    aCentralUnit.adjustMixture();
                }
        }

    }
}
