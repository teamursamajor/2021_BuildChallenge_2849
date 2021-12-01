package frc.robot;

import edu.wpi.first.wpilibj.Spark;

class Shooter implements UrsaRobot {
    private Spark shooterSpark;

    public Shooter() {
        shooterSpark = new Spark(UrsaRobot.SHOOTER_PORT);
    }
}