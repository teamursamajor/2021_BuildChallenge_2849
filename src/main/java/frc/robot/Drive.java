package frc.robot;

import edu.wpi.first.wpilibj.Spark;

class Drive implements UrsaRobot {
    private Spark driverSpark0, driverSpark1, driverSpark2, driverSpark3;

    public Drive() {
        driverSpark0 = new Spark(UrsaRobot.DRIVER_PORT_0);
        driverSpark1 = new Spark(UrsaRobot.DRIVER_PORT_1);
        driverSpark2 = new Spark(UrsaRobot.DRIVER_PORT_2);
        driverSpark3 = new Spark(UrsaRobot.DRIVER_PORT_3);
    }

    @Override
    public void readControls() {
        
    }
}