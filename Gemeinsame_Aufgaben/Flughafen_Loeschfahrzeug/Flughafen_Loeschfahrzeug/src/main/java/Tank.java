public abstract class Tank {

    protected boolean volume[][][];
    private TankSubstance content;


    /**
     * Goes through the volume array and returns the current fill level as a number
     * @return current fill level as a number in units
     */
    public int getVolume() {
        int tankLength = volume.length;             //length of the Tank
        int tankWidth = volume[0][0].length;        //width of the Tank
        int tankHeight = volume[0].length;          //height of the Tank

        int calculatedVolume = 0;
        int height = 0;
        int width = tankWidth-1;
        while (height < tankHeight && volume[0][height][0] == true) {     //As long as i is smaller than length of array in order to prevent an IndexOutOfRange, search the height of array by checking if the "rightest" field in the back is true
            height++;
            calculatedVolume+= tankLength*tankWidth;        //One horizontal layer is added to the volume
        }
        while (width >= 0 && volume[0][height][width]){
            width++;
            calculatedVolume+= tankWidth;
        }
        if(width == 0)
        {
            return calculatedVolume;
        }
        for(int i=0; i < tankLength; i++){
            if(volume[i][height][width]){
                calculatedVolume++;
            }
        }
        return calculatedVolume;
    }


    public void consumeVolume(int pVolume) {        //!!!Function needs an update due to the change from an int into an array
        volume = volume - pVolume;
    }
}
