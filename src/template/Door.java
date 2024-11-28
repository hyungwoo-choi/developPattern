package template;

import template.Enum.DoorStatus;

public class Door {
    private DoorStatus doorStauts;

    public Door() {
        doorStauts = DoorStatus.CLOSED;
    }

    public DoorStatus getDoorStatus(){
        return doorStauts;
    }

    public void close(){
        doorStauts = DoorStatus.CLOSED;
    }
    public void open(){
        doorStauts = DoorStatus.OPENED;
    }
}
