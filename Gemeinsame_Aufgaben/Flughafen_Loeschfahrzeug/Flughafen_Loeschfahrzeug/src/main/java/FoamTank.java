public class FoamTank extends Tank {

    public FoamTank() {
        volume = new boolean[25][10][10];    //2500 as inital value
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
