public abstract class IntJoystick{

    protected CentralUnit aCentralUnit;
    protected IntState aState;
    protected int aAngle;

    public IntJoystick(CentralUnit aCentralUnit) {
        this.aCentralUnit = aCentralUnit;
        this.aState = new IntInitial();
        this.aAngle = 0;
    }

    public IntJoystick() {}

    public void pushButton() {
        aState.pushButton(this);
    }

    public void pushHoldButton() {
        aState.pushHoldButton(this);
    }

    public void releaseHoldButton(){
        aState.releaseHoldButton(this);
    }

    public void setaState(IntState newState){
        this.aState = newState;
    }

    public abstract void emit();

    public void moveJoystick(int pangle){
        this.aAngle = pangle;
        aState.changeCannonPosition(this);
    }

    public abstract void setCannonPosition(boolean pactiv);
}
