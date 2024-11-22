package Status.after;

public class Sleeping implements State{
    private static Sleeping sleeping = new Sleeping();

    private Sleeping() {}

    public static Sleeping getInstance(){
        return sleeping;
    }
    public void on_button_pushed(Light light){
        System.out.println("light on!");
        light.setState(On.getInstance());
    }
    public void off_button_pushed(Light light){
        System.out.println("light off");
        light.setState(Off.getInstance());
    }
}
