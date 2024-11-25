package Command.After;

public class LampOnCommand implements Command {
    private Lamp theLamp;
    public void execute(){
        theLamp.turnOn();
    }
}
