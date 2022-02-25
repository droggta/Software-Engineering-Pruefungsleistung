public class IntRate5 implements IntState{

    public IntRate5(IntJoystick pJoystick){
        while(pJoystick.aCentralUnit.getcurrentFoamRate() != FoamRate.fuenf){
            pJoystick.aCentralUnit.adjustMixture();
        }
    }

    @Override
    public void pushButton(IntJoystick pJoystick) {
        pJoystick.setaState(new IntRate10(pJoystick));
    }

    @Override
    public void pushHoldButton(IntJoystick pJoystick) {
        pJoystick.setaState(new IntFire5(pJoystick));
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
