package Status.after;

public class Off implements State{
    private static Off off = new Off();
    private Off(){}
    public static Off getInstance(){
        return off;
    }
    public void on_button_pushed(Light light){
        light.setState(On.getInstance());
        System.out.println("light on");
    }
    public void off_button_pushed(Light light){
        System.out.println("변화 없음");
    }
}
