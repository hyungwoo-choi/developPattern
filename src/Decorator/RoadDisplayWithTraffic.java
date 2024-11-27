package Decorator;

public class RoadDisplayWithTraffic extends RoadDispaly {
    public void draw(){
        super.darw();
        drawTraffic();
    }

    private void drawTraffic(){
        System.out.println("교통량 표시");
    }
}
