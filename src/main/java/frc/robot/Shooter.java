package frc.robot;

import edu.wpi.first.wpilibj.Spark;

class Shooter implements UrsaRobot {
    private Spark shooterSpark;

    public Shooter() {
        shooterSpark = new Spark(UrsaRobot.SHOOTER_PORT);
        
    }

    @Override
    public void readControls() {
        if (controller.getRawButtonPressed(XboxController.BUTTON_A)) {
            shooterSpark.set(0.25);
        }
        else if (controller.getRawButtonPressed(XboxController.BUTTON_B)) {
            shooterSpark.set(0.0);
        }
    }
}