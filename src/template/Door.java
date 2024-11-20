package template;

public class Door {

    private DoorStatus doorStatus;
    public Door(){
        doorStatus = DoorStatus.CLOSED;
    }
    public DoorStatus getDoorStatus(){
        return doorStatus;
    }

    public void open(){
        doorStatus = DoorStatus.CLOSED;
    }
    public void close(){
        doorStatus = DoorStatus.OPEN;
    }
}
