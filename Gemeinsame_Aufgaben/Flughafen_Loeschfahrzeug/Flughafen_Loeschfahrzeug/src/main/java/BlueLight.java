public class BlueLight extends Lights{

    private LED aLED;

    public BlueLight(LightSize pSize, Position pPosition){
        aLED = new LED();
        aPosition = pPosition;
        aSize = pSize;
        aLightStatus = LightStatus.off;
    }

}
