public class ControlPanel {

    private Switch[] aSwitch;
    private CentralUnit aCentralUnit;
    private Driver aDriver;

    public void setaSwitch(Switch[] aSwitch) {
        this.aSwitch = aSwitch;
    }

    public Switch[] getaSwitch() {
        return aSwitch;
    }

    public void setaCentralUnit(CentralUnit aCentralUnit) {
        this.aCentralUnit = aCentralUnit;
    }

    public Driver getaDriver() {
        return aDriver;
    }

    public void setaDriver(Driver aDriver) {
        this.aDriver = aDriver;
    }

    public CentralUnit getaCentralUnit() {
        return aCentralUnit;
    }

    public ControlPanel() {

    }

}
