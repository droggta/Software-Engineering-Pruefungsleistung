public class Doors {

    private DoorButton[] aDoorButton;
    private Position aPosition;
    private DoorStatus aDoorStatus;
    private ReceiverModule aReceiverModule;

    public void setaDoorButton(DoorButton[] aDoorButton) {
        this.aDoorButton = aDoorButton;
    }

    public void setaDoorStatus(DoorStatus doorStatus){
        aDoorStatus = doorStatus;
    }

    public void setReceiverModule(ReceiverModule module){
        aReceiverModule = module;
    }

    public DoorStatus getaDoorStatus() {
        return aDoorStatus;
    }

    public Doors() {

    }

}
