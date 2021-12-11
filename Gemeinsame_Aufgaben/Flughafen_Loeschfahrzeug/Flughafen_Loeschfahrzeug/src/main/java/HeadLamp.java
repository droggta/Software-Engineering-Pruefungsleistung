public class HeadLamp extends Lights{

    public HeadLamp(LightSize pSize, Position pPosition) {
        aPosition = pPosition;
        aSize = pSize;
        aLightStatus = LightStatus.off;
    }

}
