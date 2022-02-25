public class IntFire10 implements IntState{

    public IntFire10(IntJoystick pJoystick){
        while(pJoystick.aCentralUnit.getcurrentFoamRate() != FoamRate.zehn){
            pJoystick.aCentralUnit.adjustMixture();
        }
        pJoystick.emit();
    }

    @Override
    public void pushButton(IntJoystick pJoystick) {
        pJoystick.setaState(new IntFire0(pJoystick));
    }

    @Override
    public void pushHoldButton(IntJoystick pJoystick) {
        // Feuert schon kann also nicht erneut positive Flanke auslösen
    }

    @Override
    public void releaseHoldButton(IntJoystick pJoystick) {
        pJoystick.setaState(new IntRate10(pJoystick));
    }

    @Override
    public void changeCannonPosition(IntJoystick pJoystick) {
        pJoystick.setCannonPosition(true);
    }
}
