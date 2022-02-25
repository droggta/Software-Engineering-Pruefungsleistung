public class BlueLight extends Lights{

    public BlueLight(LightSize pSize, Position pPosition){
        LED aLED = new LED();
        aPosition = pPosition;
        aSize = pSize;
        aLightStatus = LightStatus.off;
    }

}
