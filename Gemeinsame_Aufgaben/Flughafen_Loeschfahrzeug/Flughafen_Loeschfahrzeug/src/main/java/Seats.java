public class Seats {

    private Operator aOperator;
    private Driver aDriver;

    public void setaPerson(Operator aOperator) {
        this.aOperator = aOperator;
    }

    public void setaPerson(Driver aDriver) {
        this.aDriver = aDriver;
    }

    public void setaGasMask(GasMask aGasMask) {
    }

    public String getPerson(){

        if(aOperator != null) {
            return "Operator";
        }
        else if(aDriver != null) {
            return "Driver";
        }
        else if(aDriver != null && aOperator != null){
            return "Error";
        }
        else{
            return null;
        }

    }

    public Seats() {

    }

}
