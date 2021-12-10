public class ElectricMotor {

    SwitchStatus aStatus;
    MotorStatus aMotorStatus;

    public ElectricMotor() {
        aStatus = SwitchStatus.off;
    }

    public SwitchStatus getaStatus() {
        return aStatus;
    }

    public void setaStatus(SwitchStatus aStatus) {
        this.aStatus = aStatus;
    }

    public MotorStatus getaMotorStatus() {
        return aMotorStatus;
    }
}
