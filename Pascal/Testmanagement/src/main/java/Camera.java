import java.io.*;
import java.io.FileReader;

public class Camera implements ICamera {

    private String serialNumber;
    private boolean isOn;
    Chip[] chips;
    MemoryCard SSD;
    IRLed[] Leds;

    public Camera(String pserialNumber, Chip[] pchips, MemoryCard pSSD, IRLed[] pLeds)
    {
        isOn = false;
        serialNumber = pserialNumber;

        chips = pchips;
        SSD = pSSD;
        Leds = pLeds;
    }

    public void on(){
        isOn = true;
    }

    public void off(){
        isOn = false;
    }

    public char[][] getRawFacePicture(int faceID){

        String dataname = String.valueOf(faceID);

        if (faceID < 10)
        {
            dataname = "0"+faceID;
        }

        try {
            BufferedReader br = new BufferedReader(new FileReader("face"+ dataname +".txt"));
            char[][] FacePicture = new char[21][14];

            int zeile = 0;
            FacePicture[zeile] = br.readLine().toCharArray();

            while( FacePicture[zeile] != null && zeile < 21)
            {
                zeile++;
                FacePicture[zeile] = br.readLine().toCharArray();
            }

            br.close();
            return FacePicture;

        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public int[] getFaceArea(char[][] face){

        int[] Koordinaten = {-1, -1, -1, -1};
        int pos = 0;
        String sface = face.toString();

        pos = sface.indexOf("+");

        Koordinaten[0] = pos%21;
        Koordinaten[1] = pos%14;

        pos = sface.lastIndexOf("+");

        Koordinaten[2] = pos%21;
        Koordinaten[3] = pos%14;

        return Koordinaten;
    }

    public Picture extractFace(int id, char[][] face, int[] area){
        Picture Bild = new Picture();
        return Bild;
    }

    public Chip[] getChips(){ return chips;}

    public MemoryCard getSSD() { return SSD;}

    public IRLed[] getLeds(){ return Leds;}

    public boolean getIsOn(){return isOn;}

    public static class Builder
    {
        private final Core[] kerne = new Core[2];
        private final Chip[] chips = new Chip[2];
        private final MemoryCard SSD = new MemoryCard();

        private final IRLed[] Leds = new IRLed[24];

        public Builder()
        {
            chips[0] = new Chip(kerne, "1");
            chips[1] = new Chip(kerne, "2");

            for (int i = 0; i < 24; i++)
            {
                Leds[i] = new IRLed();
            }

            camera = new Camera("1234567890", chips, SSD, Leds);
        }

        public void build()
        {

        }

    }

}