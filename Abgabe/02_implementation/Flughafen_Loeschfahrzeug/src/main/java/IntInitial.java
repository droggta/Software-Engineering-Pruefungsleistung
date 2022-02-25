public class IntInitial implements IntState{
    @Override
    public void pushButton(IntJoystick pJoystick) {
        pJoystick.setaState(new IntRate0(pJoystick));
        pJoystick.setCannonPosition(false);
    }

    @Override
    public void pushHoldButton(IntJoystick pJoystick) {
        // nicht weil initial eingefahren
    }

    @Override
    public void releaseHoldButton(IntJoystick pJoystick) {
        // nicht weil initial eingefahren
    }

    @Override
    public void changeCannonPosition(IntJoystick pJoystick) {
        // nicht weil initial eingefahren
    }
}
