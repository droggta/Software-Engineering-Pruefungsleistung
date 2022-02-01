public class PowerUnit {

    private ElectricMotor[] aElectricMotor;
    private BatteryManagement aBatteryManagement;

    public void setaElectricMotor(ElectricMotor[] aElectricMotor) {
        this.aElectricMotor = aElectricMotor;
    }

    public PowerUnit() {
        //*****************************************************************************
        //* Beispielzugriff auf BatteryManagement: BatteryManagement.instance.load(); *
        //*****************************************************************************
    }

    /**
     * Changes the state of all electricMotors to on or off
     * @param status true=on  false=0ff
     */
    public void activateElectricMotor(boolean status) {
        MotorStatus mStatus = MotorStatus.off;
        if(status){
            mStatus = MotorStatus.on;
        }

        for(int i = 0; i < aElectricMotor.length; i++){
            aElectricMotor[i].setaMotorStatus(mStatus);
        }
    }

    public void provide(int velocity){
        int neededUnits = velocity * 25;            //25untis per 1km/h consumption
        if(aBatteryManagement.getSoC() >= neededUnits){
            aBatteryManagement.takeOut(velocity*25);
        }
        else
        {
            System.out.println("not enough energy. SoC too low! Charge the vehicle");
        }
    }
}
