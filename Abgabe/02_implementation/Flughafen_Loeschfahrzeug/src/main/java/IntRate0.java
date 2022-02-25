public class IntRate0 implements IntState{

    public IntRate0(IntJoystick pJoystick){
        while(pJoystick.aCentralUnit.getcurrentFoamRate() != FoamRate.zero){
            pJoystick.aCentralUnit.adjustMixture();
        }
    }

    @Override
    public void pushButton(IntJoystick pJoystick) {
        pJoystick.setaState(new IntRate3(pJoystick));
    }

    @Override
    public void pushHoldButton(IntJoystick pJoystick) {
        pJoystick.setaState(new IntFire0(pJoystick));
    }

    @Override
    public void releaseHoldButton(IntJoystick pJoystick) {
        //Kann nicht released werden wenn nicht gedrückt
    }

    @Override
    public void changeCannonPosition(IntJoystick pJoystick) {
        pJoystick.setCannonPosition(true);
    }
}
