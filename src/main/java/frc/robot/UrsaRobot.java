package frc.robot;

public interface UrsaRobot {

    //Spark Ports
    final int SHOOTER_PORT = 2;
    final int FRONT_LEFT= 9,
              FRONT_RIGHT = 1, 
              BACK_LEFT = 8, 
              BACK_RIGHT = 0; 

    //Xbox Controller
    XboxController controller = new XboxController(0);

    public void readControls();
}