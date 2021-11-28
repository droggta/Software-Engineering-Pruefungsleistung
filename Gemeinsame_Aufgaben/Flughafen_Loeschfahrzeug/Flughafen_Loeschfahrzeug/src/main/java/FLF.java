public class FLF {

    private final PowerUnit aPowerUnit;
    private final GroundSprayNozzle aGroundSprayNoozle;
    private final FrontPivot aFrontPivot;
    private final BackPivot aBackPivot;

    public static void main(String... args){
        FLF Flughafen_Loeschfahrzeug = new FLF.Builder()
                .createPowerUnit()
                .createGroundSprayNozzle()
                .createFrontPivot()
                .createBackPivot()
                .build();
        System.out.println("Test2");
    }

    private FLF(Builder builder){
        aPowerUnit = builder.bPowerUnit;
        aGroundSprayNoozle = builder.bGroundSprayNoozle;
        aFrontPivot = builder.bFrontPivot;
        aBackPivot = builder.bBackPivot;
    }

    public static class Builder{

        private PowerUnit bPowerUnit;
        private GroundSprayNozzle bGroundSprayNoozle;
        private FrontPivot bFrontPivot;
        private BackPivot bBackPivot;


        public Builder createPowerUnit(){
            bPowerUnit = new PowerUnit();
            return this;
        }

        public Builder createGroundSprayNozzle(){
            bGroundSprayNoozle = new GroundSprayNozzle();
            return this;
        }

        public Builder createFrontPivot(){
            bFrontPivot = new FrontPivot();
            return this;
        }

        public Builder createBackPivot(){
            bBackPivot = new BackPivot();
            return this;
        }

        public FLF build() {
            return new FLF(this);
        }
    }
}
