public abstract class Tank {

    private TankSubstance content;
    private int aFillLevel[];        //Field in the array which is filled (true)  [LxHxB]
    private int[] divisor;


    /**
     * Goes through the volume array and returns the current fill level as a number
     * @return current fill level as a number in units
     */
    public int getVolume() {
        int calculatedVolume = 0;
        calculatedVolume += (aFillLevel[1]-1) * divisor[0] * divisor[2];
        calculatedVolume += (aFillLevel[2]-1) * divisor[0];
        calculatedVolume += aFillLevel[0];

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

    public void consumeVolume(int pVolume){
        int tempVolume = pVolume;
        int diffLength = 0;
        int diffHeight = 0;
        int diffWidth = 0;

        while(tempVolume >= (divisor[0]*divisor[2])){     //If consumed volume bigger than 1 layer Length*Width
            diffHeight = (int) Math.floor(tempVolume / (divisor[0]*divisor[2]));
            tempVolume -= diffHeight*(divisor[0]*divisor[2]);
        }
        while(tempVolume >= (divisor[0]) && (aFillLevel[2]-1 > 0)) {                //if volume is bigger as width
            diffWidth++;
            tempVolume-= divisor[0];
        }
        if(tempVolume == 0){
            aFillLevel[1]-= diffHeight;
            aFillLevel[2]-= diffWidth;
            return;
        }
        if((aFillLevel[0]-tempVolume) >= 0) {
            diffLength = tempVolume;

            aFillLevel[0]-= diffLength;
            aFillLevel[1]-= diffHeight;
            aFillLevel[2]-= diffWidth;
        }
        else{
            tempVolume -= aFillLevel[0];
            diffWidth++;
            diffLength = divisor[0] - tempVolume;

            //Pointer is updated
            aFillLevel[0] = diffLength;
            aFillLevel[1]-= diffHeight;
            aFillLevel[2]-= diffWidth;
        }
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
