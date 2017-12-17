package main.java.frc.team2175.subsystem

import com.ctre.CANTalon
import edu.wpi.first.wpilibj.RobotDrive

class DrivetrainSubsystem : BaseSubsystem() {
	var leftMaster : CANTalon
	var leftSlaveOne : CANTalon
	var leftSlaveTwo : CANTalon
	var rightMaster : CANTalon
	var rightSlaveOne : CANTalon
	var rightSlaveTwo : CANTalon
	
	var robotDrive : RobotDrive
	
	init {
		 leftMaster = CANTalon(1)
		 leftSlaveOne= CANTalon(2)
		 leftSlaveTwo  = CANTalon(3)
		 rightMaster = CANTalon(4)
		 rightSlaveOne = CANTalon(5)
		 rightSlaveTwo  = CANTalon(6)
		
		setSlave(leftSlaveOne, leftMaster)	
		setSlave(leftSlaveTwo, leftMaster)	
		setSlave(rightSlaveOne, rightMaster)	
		setSlave(rightSlaveTwo, rightMaster)
		
		robotDrive = RobotDrive(leftMaster, rightMaster)
	}
	
	fun setSlave(slave : CANTalon, master : CANTalon) {
		slave.changeControlMode(CANTalon.TalonControlMode.Follower)
		slave.set(master.getDeviceID().toDouble())
	}
	
	fun arcadeDrive(moveVal : Double, turnVal : Double) {
		robotDrive.arcadeDrive(-moveVal, turnVal)
	}
	
	fun stopAllMotors() {
		leftMaster.set(0.0)
		rightMaster.set(0.0)
	}
}