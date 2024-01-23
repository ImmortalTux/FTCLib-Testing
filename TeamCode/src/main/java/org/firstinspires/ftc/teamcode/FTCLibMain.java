package main.java.org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;

import com.qualcomm.hardware.

import com.arcrobotics.ftclib.drivebase;
import com.arcrobotics.ftclib.hardware.motors.Motor;

@TeleOp(name = "Test - FTCLib")
public class FTCLibMain extends OpMode {
	MecanumDrive driveBase = null;
	BHI260AP imu = null;
	
	public void init() {
		driveBase = new MecanumDrive(
			new Motor(hardwareMap, "DriveBase-FrontLeftWheel", Motor.GoBILDA.RPM_1620),
			new Motor(hardwareMap, "DriveBase-FrontRightWheel", Motor.GoBILDA.RPM_1620),
			new Motor(hardwareMap, "DriveBase-BackLeftWheel", Motor.GoBILDA.RPM_1620),
			new Motor(hardwareMap, "DriveBase-BackRightWheel", Motor.GoBILDA.RPM_1620)
		);

		imu = new BHI260AP(BHI260AP.class, "imu");
		imu.initialize();
	}

	public void loop() {
		
	}
}