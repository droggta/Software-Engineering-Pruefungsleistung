import java.util.Stack;

public class MemoryCard {

    private Stack<Picture> store = new Stack<Picture>();

    public MemoryCard()
    {

    }

    public Stack<Picture> getMemoryStack(){
        return store;
    }

    public void safePicture(Picture pPicture){
        store.add(pPicture);
    }

}
