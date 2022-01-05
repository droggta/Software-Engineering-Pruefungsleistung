public class JoystickRoofCannon extends Joystick{

    public JoystickRoofCannon(CentralUnit c) {
        super(c);

    }

    /**
     * Is used to activate and deactivate the roof cannon and adjusting the mixture
     * @param aPosition defines if the left or right button is pressed. Only Position.left or Position.right are valid parameters
     * @param aButtonStatus
     */
    @Override
    public void pushPressButton(Position aPosition, ButtonStatus aButtonStatus) {
        switch (aPosition) {
            case left:      //left button is used for activating and deactivating
                aCentralUnit.activateRoofCannon();
                break;

            case right:     //right button is used for adjusting the mixture
                aCentralUnit.adjustMixture();
                break;
        }

    }

    @Override
    public void pushKeyButton() {
        aCentralUnit.emitExtinguishingAgentRoofCannon();

    }
}
