public class DirectionIndicator extends Lights{

    public DirectionIndicator(LightSize pSize, Position pPosition) {
        aPosition = pPosition;
        aSize = pSize;
        aLightStatus = LightStatus.off;
    }

}
