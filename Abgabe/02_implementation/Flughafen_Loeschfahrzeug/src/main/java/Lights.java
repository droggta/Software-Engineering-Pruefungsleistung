public abstract class Lights {

    protected LightSize aSize;
    protected LightStatus aLightStatus;
    protected Position aPosition;

    /**
     * sets the status of the light to on
     */
    public void turnOn(){
        aLightStatus = LightStatus.on;
    }

    /**
     * sets the status of the light to off
     */
    public void turnOff(){
        aLightStatus = LightStatus.off;
    }

    public LightStatus getaLightStatus() {
        return aLightStatus;
    }

    public Position getaPosition() {
        return aPosition;
    }

    public void setaLightStatus(LightStatus aLightStatus) {
        this.aLightStatus = aLightStatus;
    }

}
