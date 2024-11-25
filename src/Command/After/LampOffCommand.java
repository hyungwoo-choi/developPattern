package Command.After;

public class LampOffCommand implements Command{
    private Lamp theLamp;
    public void execute(){
        theLamp.turnOff();
    }
}
