package Decorator;

public class Client {

    public static void main(String[] args) {
        RoadDispaly road = new RoadDispaly();
        road.darw();

        RoadDispaly roadWithLane = new RoadDisplayWithLane();
        roadWithLane.darw();
    }
}
