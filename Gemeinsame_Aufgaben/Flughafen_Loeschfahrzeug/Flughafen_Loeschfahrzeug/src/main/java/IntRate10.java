public class IntRate10 implements IntState{

    public IntRate10(IntJoystick pJoystick){
        while(pJoystick.aCentralUnit.getcurrentFoamRate() != FoamRate.zehn){
            pJoystick.aCentralUnit.adjustMixture();
        }
    }

    @Override
    public void pushButton(IntJoystick pJoystick) {
        pJoystick.setaState(new IntRate0(pJoystick));
    }

    @Override
    public void pushHoldButton(IntJoystick pJoystick) {
        pJoystick.setaState(new IntFire10(pJoystick));
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
