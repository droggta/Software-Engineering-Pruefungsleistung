public class FoamTank extends Tank {

    public FoamTank() {
        int length = 25;
        int height = 10;
        int width = 10;

        setaFillLevel(new int[]{length, height, width});     //because tank is initial filled the pointer is set to the highest field
        setaDivisor(new int[]{length, height, width});
    }

}
