public class BreakingLight extends Lights{

    public BreakingLight(LightSize pSize, Position pPosition) {
        aPosition = pPosition;
        aSize = pSize;
        aLightStatus = LightStatus.off;
    }

}
