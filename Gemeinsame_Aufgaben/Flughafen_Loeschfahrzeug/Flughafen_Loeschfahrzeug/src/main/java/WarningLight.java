public class WarningLight extends Lights {

    private LED aLED;

    public WarningLight(LightSize pSize, Position pPosition) {

        aLED = new LED();
        aPosition = pPosition;
        aSize = pSize;
        aLightStatus = LightStatus.off;
    }

}
