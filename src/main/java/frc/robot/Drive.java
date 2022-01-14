


package frc.robot;

import edu.wpi.first.wpilibj.Spark;

class Drive implements UrsaRobot {
    private Spark frontLeft, backLeft, frontRight, backRight;

    public Drive() {
        System.out.println("Drive is made");
        frontLeft = new Spark(UrsaRobot.FRONT_LEFT);
        backLeft = new Spark(UrsaRobot.BACK_LEFT);
        frontRight = new Spark(UrsaRobot.FRONT_RIGHT);
        backRight = new Spark(UrsaRobot.BACK_RIGHT);
    }

    @Override
    public void readControls() {
        sticksBox();
    }
    
    private void sticksBox() {
		// System.out.println(getHeading() + " " + getRawHeading());
		double leftSpeed, rightSpeed, leftStickY, rightStickX;
        
            leftStickY = controller.getAxis(XboxController.AXIS_LEFTSTICK_Y);
            rightStickX = -controller.getAxis(XboxController.AXIS_RIGHTSTICK_X);

            leftSpeed = leftStickY + rightStickX;
            rightSpeed = leftStickY - rightStickX;

            double max = Math.max(leftSpeed, rightSpeed); // the greater of the two values
            double min = Math.min(leftSpeed, rightSpeed); // the lesser of the two values

            if (max > 1) {
                leftSpeed /= max;
                rightSpeed /= max;
            } else if (min < -1) {
                leftSpeed /= -min;
                rightSpeed /= -min;
            }
        
		setLeftPower(leftSpeed);
        setRightPower(rightSpeed);
    }
    
    public void setLeftPower(double power) {
		frontLeft.set(-power);
        backLeft.set(-power);
        System.out.println("left speed: " + power);
    }
    
    public void setRightPower(double power) {
		frontRight.set(power);
        backRight.set(power);
        System.out.println("right speed: " + power);
        
	}
}