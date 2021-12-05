import java.io.*;
import java.io.FileReader;
import java.util.Stack;

public class Camera implements ICamera {

    private String aserialNumber;
    private boolean aIsOn;
    private Chip[] aChips;
    private MemoryCard aSSD;
    private IRLed[] aLeds;
    private Picture aPicture;

    public static Camera Camerainit(){
        Camera camera = new Camera.Builder()
                .init()
                .build();
        return camera;
    }

    public void on(){
        aIsOn = true;
    }

    public void off(){
        aIsOn = false;
    }

    public char[][] getRawFacePicture(int faceID){

        String dataname = String.valueOf(faceID);

        if (faceID < 10)
        {
            dataname = "0"+faceID;
        }

        try {
            BufferedReader br = new BufferedReader(new FileReader("src/main/resources/face"+ dataname +".txt"));
            char[][] FacePicture = new char[21][14];

            int zeile = 0;
            FacePicture[zeile] = br.readLine().toCharArray();

            while( FacePicture[zeile] != null && zeile < 20)
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
        String sface = "";

        for (int i = 0; i < 21; i++){
            for(int j = 0; j < 14; j++){
                sface = sface + face[i][j];
            }
        }

        pos = sface.indexOf('+');

        Koordinaten[0] = pos/14;
        Koordinaten[1] = pos%14;

        pos = sface.lastIndexOf("+");

        Koordinaten[2] = pos/14;
        Koordinaten[3] = pos%14;

        return Koordinaten;
    }

    public Picture extractFace(int pid, char[][] pface, int[] parea){
        Picture Bild = new Picture();
        Boolean loading = true;
        Boolean safe = false;
        char[] buffer = new char[pface.length*14];

        for (int i = 0; i < 21; i++){
            for (int j = 0; j <  14; j++){
                buffer[i * 14 + j] = pface[i][j];
            }
        }

        int pos = parea[0] * 14 + parea[1];
        int x = 0;
        int y = 0;

        for (int i = pos ; i < parea[2] * 14 + parea[3]; i++){

            if(safe && buffer[i] != '+')
            {
                if(y <= 9)
                {
                    Bild.setContent(buffer[i], x, y);
                    y++;
                }
                else
                {
                    y = 0;
                    x++;
                    Bild.setContent(buffer[i], x, y);
                }
            }

            if(buffer[i] == '+'){
                safe = !safe;
            }
        }

        Boolean hasb = false;
        Boolean isvalid = true;
        char checkchar;

        for (int i = 0; i < 10; i++){
            for (int j = 0; j < 10; j++){
                checkchar = Bild.getContent(i, j);

                if (checkchar == 'b'){
                    hasb = true;
                }
                if(checkchar == ' ' || (checkchar != 'a' && checkchar != 'b' && checkchar != 'c' && checkchar != 'd' && checkchar != 'e' && checkchar != 'f')){
                    isvalid = false;
                }
            }

            if (!hasb || !isvalid){
                return null;
            }
            else
            {
                hasb = false;
            }
        }

        aSSD.safePicture(Bild);
        return Bild;
    }

    public Chip[] getChips(){ return aChips;}

    public MemoryCard getSSD() { return aSSD;}

    public IRLed[] getLeds(){ return aLeds;}

    public Core[] getCores(int pChip){return aChips[pChip].getCores();}

    public Stack<Picture> getMemoryStack(){
        return aSSD.getMemoryStack();
    }

    public boolean getIsOn(){return aIsOn;}

    private Camera(Builder builder)
    {
        aIsOn = false;
        aserialNumber = "123456789";
        aChips = builder.chips;
        aSSD = builder.SSD;
        aLeds = builder.Leds;
    }

    public static class Builder
    {
        private Core[] kerne;
        private Chip[] chips;
        private MemoryCard SSD;
        private IRLed[] Leds;

        public Builder init()
        {
            SSD = new MemoryCard();

            chips = new Chip[2];
            kerne = new Core[]{new Core(), new Core()};
            chips[0] = new Chip(kerne, "1");
            kerne = new Core[]{new Core(), new Core()};
            chips[1] = new Chip(kerne, "2");

            Leds = new IRLed[24];

            for (int i = 0; i < 24; i++)
            {
                Leds[i] = new IRLed();
            }

            return this;
        }

        public Camera build()
        {
            return new Camera(this);
        }

    }

}