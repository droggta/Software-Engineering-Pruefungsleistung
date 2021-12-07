public class GasPedal implements Pedal{

    private CentralUnit aCentralUnit;

    public void setaCentralUnit(CentralUnit aCentralUnit) {
        this.aCentralUnit = aCentralUnit;
    }

    public GasPedal() {

    }

    /**
     * changes the current speed +4km/h
     */
    public void changeSpeedStep(){
        aCentralUnit.changeSpeedStep(1);
    }

}
