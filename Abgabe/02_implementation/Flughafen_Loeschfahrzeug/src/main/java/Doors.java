public class Doors {

    private Position aPosition;
    private DoorStatus aDoorStatus;

    public void setaDoorButton(DoorButton[] aDoorButton) {
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
    }

    public DoorStatus getaDoorStatus() {
        return aDoorStatus;
    }

    public Doors() {
        aDoorStatus = DoorStatus.closed;
    }

}
