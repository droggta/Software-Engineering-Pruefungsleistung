public class IntJoystickFrontCannon extends IntJoystick{

    public IntJoystickFrontCannon(CentralUnit pCentralUnit) {
        super(pCentralUnit);
    }

    @Override
    public void setCannonPosition(boolean pactiv) {
        if (!pactiv){
            aCentralUnit.activateFrontCannon();
        } else {
            aCentralUnit.setAngleFrontCannon(aAngle);
        }
        // Cannonwinkel anpassen
    }

    public void emit(){
        aCentralUnit.emitExtinguishingAgentFrontCannon();
    }

}
