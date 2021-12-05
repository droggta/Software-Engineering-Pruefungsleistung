public class Picture {

    private int faceID;
    private char[][] content = new char[10][10];
    private long nanoTimeStamp;

    public int getFaceID() {
        return faceID;
    }

    public void setFaceID(int faceID) {
        this.faceID = faceID;
    }

    public char getContent(int pposx, int pposy) {
        return content[pposx][pposy];
    }

    public char[][] getContent() {
        return content;
    }

    public void setContent(char pcontent, int pposx, int pposy) {
        this.content[pposx][pposy] = pcontent;
    }

    public long getNanoTimeStamp() {
        return nanoTimeStamp;
    }

    public void setNanoTimeStamp(long nanoTimeStamp) {
        this.nanoTimeStamp = nanoTimeStamp;
    }

}
