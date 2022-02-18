public class IntFire3 implements IntState{

    public IntFire3(IntJoystick pJoystick){
        while(pJoystick.aCentralUnit.getcurrentFoamRate() != FoamRate.drei){
            pJoystick.aCentralUnit.adjustMixture();
        }
        pJoystick.emit();
    }

    @Override
    public void pushButton(IntJoystick pJoystick) {
        pJoystick.setaState(new IntFire5(pJoystick));
    }

    @Override
    public void pushHoldButton(IntJoystick pJoystick) {
        // Feuert schon kann also nicht erneut positive Flanke auslösen
    }

    @Override
    public void releaseHoldButton(IntJoystick pJoystick) {
        pJoystick.setaState(new IntRate3(pJoystick));
    }

    @Override
    public void changeCannonPosition(IntJoystick pJoystick) {
        pJoystick.setCannonPosition(true);
    }
}
