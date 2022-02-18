public class IntFire0 implements IntState{

    public IntFire0(IntJoystick pJoystick){
        while(pJoystick.aCentralUnit.getcurrentFoamRate() != FoamRate.zero){
            pJoystick.aCentralUnit.adjustMixture();
        }

        pJoystick.emit();
    }

    @Override
    public void pushButton(IntJoystick pJoystick) {
        pJoystick.setaState(new IntFire3(pJoystick));
    }

    @Override
    public void pushHoldButton(IntJoystick pJoystick) {
        // Feuert schon kann also nicht erneut positive Flanke auslösen
    }

    @Override
    public void releaseHoldButton(IntJoystick pJoystick) {
        pJoystick.setaState(new IntRate0(pJoystick));
    }

    @Override
    public void changeCannonPosition(IntJoystick pJoystick) {
        pJoystick.setCannonPosition(true);
    }
}
