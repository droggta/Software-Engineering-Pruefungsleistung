public class FLF {

    public static void main(String... args){
        FLF Flughafen_Loeschfahrzeug = new FLF.Builder().build();
        System.out.println("Test2");
    }

    private FLF(Builder builder){

    }

    public static class Builder{

        public FLF build() {
            return new FLF(this);
        }
    }
}
