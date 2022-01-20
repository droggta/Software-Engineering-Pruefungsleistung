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
        int calculatedVolume = 0;
        int[] tempFillLevel = aFillLevel;
        int tankLength = volume.length;             //length of the Tank
        int tankWidth = volume[0][0].length;        //width of the Tank
        int tankHeight = volume[0].length;          //height of the Tank

        int i;
        for(i=aFillLevel[1]; i > 0;i--){            //Height
            calculatedVolume+= (divisor[0]*divisor[2]); //process layer LxB (Height)
        }
        for(i=aFillLevel[2]; i > 0; i--){
            calculatedVolume+= (divisor[0]);            //process B (Width)
        }
        for(i=aFillLevel[0]; i >0; i--){
            calculatedVolume++;
        }

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
}
