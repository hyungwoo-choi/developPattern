package template;

public class HyundaiMotor extends Motor{
    public HyundaiMotor(Door door){
        super(door);
    }
    protected void moveMotor(Direction direction){
        System.out.println("현대 모터");
    }
}
