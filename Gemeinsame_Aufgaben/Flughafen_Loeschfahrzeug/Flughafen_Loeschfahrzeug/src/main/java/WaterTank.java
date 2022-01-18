public class WaterTank extends Tank{

    public WaterTank() {
        volume = new boolean[50][25][10];     //12500 as inital value
        for(int i=0; i<volume.length; i++){
            for(int j=0; j<volume[i].length; j++){
                for(int k=0; k<volume[i][j].length; k++){
                    volume[i][j][k] = true;                 //true means filled
                }
            }
        }
    }



    @Override
    public void consumeVolume(int pVolume) {
        super.consumeVolume(pVolume);
    }


}
