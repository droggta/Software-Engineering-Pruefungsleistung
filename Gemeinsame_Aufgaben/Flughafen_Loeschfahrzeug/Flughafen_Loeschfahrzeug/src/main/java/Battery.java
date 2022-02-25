public class Battery {

    private int aFillLevel[];        //Field in the array which is filled (true)  [LxHxB]
    private int[] divisor;
    private BatteryStatus aBatteryStatus;
    private int aSoC;        //Soc = State of Charge

    public Battery() {
        int length = 100;
        int height = 10;
        int width = 100;

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

    public int getaSoC(){
        int calculatedSoC = 0;
        calculatedSoC += (aFillLevel[1]-1) * divisor[0] * divisor[2];
        calculatedSoC += (aFillLevel[2]-1) * divisor[0];
        calculatedSoC += aFillLevel[0];

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

    private int[] checkArea(int tempVolume, int diffLength, int diffHeight, int diffWidth, int forceStep){
        int areaUnit = divisor[0]*divisor[2];
        if(forceStep == 0){
            if(tempVolume >= areaUnit){                 //check if tempVolume is even as big or bigger as areaUnit
                if((aFillLevel[1] - (int) Math.floor(tempVolume/areaUnit)) > 0){              //check if height -1 would be grater that zero
                    diffHeight += (int) Math.floor(tempVolume/areaUnit);
                    tempVolume -= diffHeight*areaUnit;
                }
            }
        }
        else{
            if((aFillLevel[1]-1) > 0) {
                diffHeight++;
                tempVolume -= diffHeight * areaUnit;
            }
        }
        int[] diffKoord = checkRow(tempVolume, diffLength, diffHeight, diffWidth, forceStep);
        return diffKoord;
    }

    private int[] checkRow(int tempVolume, int diffLength, int diffHeight, int diffWidth, int forceStep){
        int rowUnit = divisor[0];
        if(forceStep == 0){
            if(tempVolume > rowUnit){
                if((aFillLevel[2]-1) > 0){
                    diffWidth += (int) Math.floor(tempVolume/rowUnit);
                    tempVolume -= diffWidth*rowUnit;
                }
            }
        }
        return new int[]{1,2};
    }

    private int[] checkRemaining(){
        return new int[]{1,2};
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
