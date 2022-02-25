public class HeadLamp extends Lights{

    public HeadLamp(LightSize pSize, Position pPosition) {
        aPosition = pPosition;
        aSize = pSize;
        aLightStatus = LightStatus.off;
    }
    //10 Headlamps: leftfront 3x | rightfront 3x | roof 4x
}
