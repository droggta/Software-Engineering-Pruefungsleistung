public class JoystickFrontCannon extends Joystick{

    /**
     * Creates a JoystickFrontCannon. This Joystick ist used by the driver of the FLF
     * @param c
     */
    public JoystickFrontCannon(CentralUnit c) {
        super(c);
    }

    /**
     * Is used to actived/deactived front cannon or changing the mixture. Depends if position right or left
     * @param aPosition defines if the left or right button is pressed. Left=de/activating Right=adjust Mixture
     */
    @Override
    public void pushPressButton(Position aPosition) {

        switch (aPosition) {
            case left:      //left button is used for activating and deactivating
                    aCentralUnit.activateFrontCannon();
                    break;

            case right:     //right button is used for adjusting the mixture
                    aCentralUnit.adjustMixture();
                    break;
        }

    }

    /**
     * Returns the current FoamRate the MixingUnit is set to
     * @return
     */
    public FoamRate getcurrentFoamRate(){
        return aCentralUnit.getcurrentFoamRate();
    }

    /**
     * emits the extinguishing agent
     */
    @Override
    public void pushKeyButton() {
        aCentralUnit.emitExtinguishingAgentFrontCannon();
    }
}
