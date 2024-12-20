package template;

import template.Enum.Direction;
import template.Enum.DoorStatus;
import template.Enum.MotorStatus;

public class LGMotor {
    private Door door;
    private MotorStatus motorStatus;

    public LGMotor(Door door){
        this.door = door;
        motorStatus = MotorStatus.STOPPED;
    }

    private void moveLGMotor(Direction direction){
        System.out.println("LG모터 구동");
    }

    public MotorStatus getMotorStatus(){
        return motorStatus;
    }

    private void setMotorStatus(MotorStatus motorStatus){
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
        moveLGMotor(direction);
        setMotorStatus(MotorStatus.MOVING);
    }
}
