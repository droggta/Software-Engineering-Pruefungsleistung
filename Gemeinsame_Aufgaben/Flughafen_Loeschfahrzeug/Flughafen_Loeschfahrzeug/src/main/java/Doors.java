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

    /**
     * Automatically changes the DoorStatus from open to closed and vice versa
     */
    public void changeDoorstatus(){
        if(aDoorStatus == DoorStatus.closed){
            aDoorStatus = DoorStatus.open;
        }
        else{
            aDoorStatus = DoorStatus.closed;
        }
    }

    public void changeLock(){
        if(aDoorStatus == DoorStatus.locked){
            aDoorStatus = DoorStatus.closed;
        }
        else{
            aDoorStatus = DoorStatus.locked;
        }
    }

    public void setReceiverModule(ReceiverModule module){
        aReceiverModule = module;
    }

    public DoorStatus getaDoorStatus() {
        return aDoorStatus;
    }

    public Doors() {
        aDoorStatus = DoorStatus.closed;
    }

}
