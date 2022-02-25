public class JoystickRoofCannon extends Joystick{

    /**
     * Creates a JoystickFrontCannon. This Joystick ist used by the driver of the FLF
     */
    public JoystickRoofCannon(CentralUnit c) {
        super(c);

    }

    /**
     * Is used to activate and deactivate the roof cannon and adjusting the mixture
     * @param aPosition defines if the left or right button is pressed. Left=de/activating Right=adjust Mixture
     */
    @Override
    public void pushPressButton(Position aPosition) {
        switch (aPosition) {
            case left ->      //left button is used for activating and deactivating
                    aCentralUnit.activateRoofCannon();
            case right ->     //right button is used for adjusting the mixture
                    aCentralUnit.adjustMixture(this);
        }

    }

    @Override
    public void pushKeyButton() {
        aCentralUnit.emitExtinguishingAgentRoofCannon();

    }

}
