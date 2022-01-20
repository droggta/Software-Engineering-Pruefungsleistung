public abstract class Tank {

    protected boolean volume[][][];
    private TankSubstance content;
    private int aFillLevel[];        //Field in the array which is filled (true)  [LxHxB]
    private int[] divisor;


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
        int length = 0;
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
        for(length = tankLength-1;length <= 0; length++){
            if(volume[length][height][width]){
                calculatedVolume++;
            }
        }
        aFillLevel = new int[] {length, height, width};
        return calculatedVolume;
    }

    /**
     * Pointer of the current fill level (LxHxB)
     * @param a int array with length, height, width of the current fill level
     */
    protected void setaFillLevel(int[] a){
        aFillLevel = a;
    }

    protected void setaDivisor(int[] a){
        divisor = a;
    }


    public void consumeVolume(int pVolume) {        //!!!Function still needs an update due to the change from an int into an array
        int tempVolume = pVolume;
        int diffLength = 0;
        int diffHeight = 0;
        int diffWidth = 0;

        if(tempVolume >= (divisor[0]*divisor[2])){     //If consumed volume bigger than 1 layer Length*Width
            diffHeight = (int) Math.floor(tempVolume / (divisor[0]*divisor[2]));
            tempVolume -= diffHeight*(divisor[0]*divisor[2]);
        }
        if(tempVolume >= (divisor[0])) {                //if volume is bigger as width
            diffWidth = (int) Math.floor(tempVolume / divisor[0]);
            tempVolume-= diffWidth*divisor[0];
        }
        diffLength = tempVolume;

        


    }
}
