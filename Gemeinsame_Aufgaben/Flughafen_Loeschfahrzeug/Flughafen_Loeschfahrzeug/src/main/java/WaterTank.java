public class WaterTank extends Tank{

    public WaterTank() {
        int length = 50;
        int height = 25;
        int width = 10;
        volume = new boolean[length][height][width];     //12500 as inital value
        for(int i=0; i<volume.length; i++){
            for(int j=0; j<volume[i].length; j++){
                for(int k=0; k<volume[i][j].length; k++){
                    volume[i][j][k] = true;                 //true means filled
                }
            }
        }
        setaFillLevel(new int[]{length, height, width});        //because tank is initial filled the pointer is set to the highest field
        setaDivisor(new int[]{length, height, width});
    }



    @Override
    public void consumeVolume(int pVolume) {
        super.consumeVolume(pVolume);
    }


}
