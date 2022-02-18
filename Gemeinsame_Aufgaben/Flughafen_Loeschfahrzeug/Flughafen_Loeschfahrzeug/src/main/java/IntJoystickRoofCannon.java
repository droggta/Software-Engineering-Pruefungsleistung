public class IntJoystickRoofCannon extends IntJoystick{

    public IntJoystickRoofCannon(CentralUnit pCentralUnit) {
        super(pCentralUnit);
    }

    @Override
    public void setCannonPosition(boolean pactiv) {
        // Cannonwinkel anpassen
        if (!pactiv){
            aCentralUnit.activateRoofCannon();
        } else {
            aCentralUnit.setAngleRoofCannon(aAngle);
        }
    }

    public void emit(){aCentralUnit.emitExtinguishingAgentRoofCannon();}

}
