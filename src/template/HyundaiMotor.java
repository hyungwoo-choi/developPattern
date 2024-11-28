package template;

import org.w3c.dom.ls.LSOutput;
import template.Enum.Direction;
import template.Enum.DoorStatus;
import template.Enum.MotorStatus;

public class HyundaiMotor {
    private Door door;
    private MotorStatus motorStatus;

    public HyundaiMotor(Door door) {
        this.door = door;
        motorStatus = MotorStatus.STOPPED;
    }

    private void moveHyudaiMotor(Direction direction){
        System.out.println("현대모터 구동");
    }

    public MotorStatus getMotorStatus(){
        return motorStatus;
    }

    private void setMotorStatus(MotorStatus motorStatus) {
        this.motorStatus = motorStatus;
    }

    public void move(Direction direction){
        MotorStatus motorStatus = getMotorStatus();
        if (motorStatus == MotorStatus.MOVING) {
            return;
        }

        DoorStatus doorStatus = door.getDoorStatus();
        if (doorStatus == DoorStatus.OPENED) {
            door.close();
        }

        moveHyudaiMotor(direction);
        setMotorStatus(MotorStatus.MOVING);
    }


}
