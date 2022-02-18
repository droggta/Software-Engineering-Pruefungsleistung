public class IntFire5 implements IntState{

    public IntFire5(IntJoystick pJoystick){
        while(pJoystick.aCentralUnit.getcurrentFoamRate() != FoamRate.fuenf){
            pJoystick.aCentralUnit.adjustMixture();
        }
        pJoystick.emit();
    }

    @Override
    public void pushButton(IntJoystick pJoystick) {
        pJoystick.setaState(new IntFire10(pJoystick));
    }

    @Override
    public void pushHoldButton(IntJoystick pJoystick) {
        // Feuert schon kann also nicht erneut positive Flanke auslösen
    }

    @Override
    public void releaseHoldButton(IntJoystick pJoystick) {
        pJoystick.setaState(new IntRate5(pJoystick));
    }

    @Override
    public void changeCannonPosition(IntJoystick pJoystick) {
        pJoystick.setCannonPosition(true);
    }
}
