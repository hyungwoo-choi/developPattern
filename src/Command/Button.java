package Command;

public class Button {
    private Mode theMode;
    private Alarm theAlarm = new Alarm();
    private Lamp theLamp = new Lamp();
    public void Button(Lamp theLamp, Alarm theAlarm){
        this.theLamp = theLamp;
        this.theAlarm = theAlarm;
    }
    public void setMode(Mode mode){
        this.theMode = mode;
    }

    public void pressed(){
        switch(theMode){
            case LAMP:
                theLamp.turnOn();
                break;
            case ALARM:
                theAlarm.turnOn();
                break;
        }
    }
}
