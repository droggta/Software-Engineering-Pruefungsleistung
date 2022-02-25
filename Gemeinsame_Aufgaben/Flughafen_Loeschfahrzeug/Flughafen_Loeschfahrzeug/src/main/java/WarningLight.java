public class WarningLight extends Lights {

    public WarningLight(LightSize pSize, Position pPosition) {

        LED aLED = new LED();
        aPosition = pPosition;
        aSize = pSize;
        aLightStatus = LightStatus.off;
    }

}
