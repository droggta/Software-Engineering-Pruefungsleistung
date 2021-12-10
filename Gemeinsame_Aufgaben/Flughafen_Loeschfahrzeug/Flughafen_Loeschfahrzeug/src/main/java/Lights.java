public abstract class Lights {

    private LightSize size;
    private LightStatus aLightStatus;
    private Position position;

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
}
