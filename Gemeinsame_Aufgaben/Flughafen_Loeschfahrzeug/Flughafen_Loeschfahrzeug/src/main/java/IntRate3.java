public class IntRate3 implements IntState{

    public IntRate3(IntJoystick pJoystick){
        while(pJoystick.aCentralUnit.getcurrentFoamRate() != FoamRate.drei){
            pJoystick.aCentralUnit.adjustMixture();
        }
    }

    @Override
    public void pushButton(IntJoystick pJoystick) {
        pJoystick.setaState(new IntRate5(pJoystick));
    }

    @Override
    public void pushHoldButton(IntJoystick pJoystick) {
        pJoystick.setaState(new IntFire3(pJoystick));
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
