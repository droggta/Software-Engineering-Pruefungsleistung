public class Seats {

    private GasMask aGasMask;
    private Operator aOperator;
    private Driver aDriver;

    public void setaOperator(Operator aOperator) {
        this.aOperator = aOperator;
    }

    public void setaDriver(Driver aDriver) {
        this.aDriver = aDriver;
    }

    public void setaGasMask(GasMask aGasMask) {
        this.aGasMask = aGasMask;
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
