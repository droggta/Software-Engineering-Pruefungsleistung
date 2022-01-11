public class ElectricMotor {

    MotorStatus aMotorStatus;

    public ElectricMotor() {
        aMotorStatus = MotorStatus.off;         //initial value
    }

    public MotorStatus getaStatus() {
        return aMotorStatus;
    }

    public void setaMotorStatus(MotorStatus aStatus) {
        this.aMotorStatus = aStatus;
    }

    public MotorStatus getaMotorStatus() {
        return aMotorStatus;
    }
}
