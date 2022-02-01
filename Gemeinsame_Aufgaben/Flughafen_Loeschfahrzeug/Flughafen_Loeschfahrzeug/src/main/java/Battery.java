public class Battery {

    protected boolean aCapacity[][][];
    private int aFillLevel[];        //Field in the array which is filled (true)  [LxHxB]
    private int[] divisor;
    private BatteryStatus aBatteryStatus;
    private int aSoC;        //Soc = State of Charge

    public Battery() {
        int length = 100;
        int height = 10;
        int width = 100;
        aCapacity = new boolean[length][height][width];     //12500 as inital value
        for(int i=0; i<aCapacity.length; i++){
            for(int j=0; j<aCapacity[i].length; j++){
                for(int k=0; k<aCapacity[i][j].length; k++){
                    aCapacity[i][j][k] = true;                 //true means filled
                }
            }
        }
        setaFillLevel(new int[]{length, height, width});        //because tank is initial filled the pointer is set to the highest field
        setaDivisor(new int[]{length, height, width});
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

    public int getaSoC() {
        int calculatedSoC = 0;
        int[] tempFillLevel = aFillLevel;
        int tankLength = aCapacity.length;             //length of the Tank
        int tankWidth = aCapacity[0][0].length;        //width of the Tank
        int tankHeight = aCapacity[0].length;          //height of the Tank

        int i;
        for(i=aFillLevel[1]; i > 0;i--){            //Height
            calculatedSoC+= (divisor[0]*divisor[2]); //process layer LxB (Height)
        }
        for(i=aFillLevel[2]; i > 0; i--){
            calculatedSoC+= (divisor[0]);            //process B (Width)
        }
        for(i=aFillLevel[0]; i >0; i--){
            calculatedSoC++;
        }

        return calculatedSoC;
    }

    /**
     * Moves the pointer to the new fill level
     * @param pVolume consumed volume in units
     */
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

        //Pointer is updated
        aFillLevel[0]-= diffLength;
        aFillLevel[1]-= diffHeight;
        aFillLevel[2]-= diffWidth;

    }

    /**
     * Moves the pointer to the new fill level
     * @param pVolume added volume in units
     */
    public void fillVolume(int pVolume){
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

        //Pointer is updated
        aFillLevel[0]+= diffLength;
        aFillLevel[1]+= diffHeight;
        aFillLevel[2]+= diffWidth;

    }
}
