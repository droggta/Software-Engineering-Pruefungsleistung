public abstract class Lights {

    private LightSize size;
    private LightStatus status;
    private Position position;

    /**
     * sets the status of the light to on
     */
    public void turnOn(){
        status = LightStatus.on;
    }

    /**
     * sets the status of the light to off
     */
    public void turnOff(){
        status = LightStatus.off;
    }

}
