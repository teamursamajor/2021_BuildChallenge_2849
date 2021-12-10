package frc.robot;

public interface UrsaRobot {

    //Spark Ports
    final int SHOOTER_PORT = 1;
    final int DRIVER_PORT_0 = 2,
              DRIVER_PORT_1 = 3,
              DRIVER_PORT_2 = 4,
              DRIVER_PORT_3 = 5;

    //Xbox Controller
    XboxController controller = new XboxController(0);

    public void readControls();
}