public class DoorButton {

    private final Doors aDoor;
    private final Position aPosition;             //indoor or outdoor

    /**
     * Creates a new DoorButton
     * @param position where the DoorButton is sitting (indoor/outdoow)
     * @param door to which door the button belongs to
     */
    public DoorButton(Position position, Doors door) {
        aPosition = position;
        aDoor = door;
    }

    public void pushButton(){
        aDoor.changeDoorstatus();
    }

    public Position getaPosition() {
        return aPosition;
    }
}
