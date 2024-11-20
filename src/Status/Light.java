package Status;

public class Light {
    private static int ON = 0;
    private static int OFF = 1;
    private static int SLEEPING = 2;
    private int state;

    public Light() {
        state = OFF; //형광등 초기 상태는 꺼져있는 상태임
    }

    public void on_button_pushed(){
        if(state == ON){
            System.out.println("반응없음");
        }
        else if (state == SLEEPING) {
            System.out.println("Light On");
            state = ON;
        }
        else{
            System.out.println("Light On");
            state = ON;
        }
    }

    public void off_button_pushed(){
        if(state == OFF){
            System.out.println("반응 없음");
        } else if (state == SLEEPING) {
            System.out.println("Light Off");
            state = OFF;

        } else{
            System.out.println("Light Off");
            state = OFF;
        }
    }
}
