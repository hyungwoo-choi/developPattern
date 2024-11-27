package Decorator;

public class RoadDisplayWithLane extends RoadDispaly{
    public void darw(){
        super.darw();
        drawLane();
    }
    private void drawLane(){
        System.out.println("차선 표시");
    }
}
