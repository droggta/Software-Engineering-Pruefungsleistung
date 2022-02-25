public class WaterTank extends Tank{

    public WaterTank() {
        int length = 50;
        int height = 25;
        int width = 10;

        setaFillLevel(new int[]{length, height, width});        //because tank is initial filled the pointer is set to the highest field
        setaDivisor(new int[]{length, height, width});
    }
}
