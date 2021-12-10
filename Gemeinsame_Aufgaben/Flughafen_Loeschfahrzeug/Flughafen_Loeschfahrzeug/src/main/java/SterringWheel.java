public class SterringWheel {

    private CentralUnit aCentralUnit;
    private int aSteeringAngle = 0;

    public void setaCentralUnit(CentralUnit aCentralUnit) {
        this.aCentralUnit = aCentralUnit;
    }

    public SterringWheel() {

    }

    /**
     * This method is used by the driver to steer the FLF
     * @param sterringAngle is the procendual change of the angle in % (minus=left, positiv=right)
     */
    public void steerFLF(int sterringAngle)
    {
        aSteeringAngle+=sterringAngle;
        aCentralUnit.steerFLF(aSteeringAngle);
    }

}
