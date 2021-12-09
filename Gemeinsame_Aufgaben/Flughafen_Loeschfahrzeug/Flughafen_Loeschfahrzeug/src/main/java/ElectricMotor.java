public class ElectricMotor {

    SwitchStatus aStatus;

    public ElectricMotor() {
        aStatus = SwitchStatus.off;
    }

    public SwitchStatus getaStatus() {
        return aStatus;
    }

    public void setaStatus(SwitchStatus aStatus) {
        this.aStatus = aStatus;
    }

}
