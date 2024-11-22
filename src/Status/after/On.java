package Status.after;

public class On implements State{
    private static On on = new On();
    private On(){}

    public static On getInstance(){
        return on;
    }
    public void on_button_pushed(Light light){
        System.out.println("sleeping mode!");
        light.setState(Sleeping.getInstance());
    }
    public void off_button_pushed(Light light){
        System.out.println("light off!");
        light.setState(Off.getInstance());
    }
}
