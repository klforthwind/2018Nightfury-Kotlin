package main.java.frc.team2175.command.single

import edu.wpi.first.wpilibj.command.Command

import main.java.frc.team2175.control.*
import main.java.frc.team2175.subsystem.*
import main.java.frc.team2175.ServiceLocator

class ArcadeDriveWithJoysticksCommand : Command() {
	var drivetrainSubsystem : DrivetrainSubsystem
	var driverStation : DriverStation
	
	init {
		drivetrainSubsystem = ServiceLocator.get(DrivetrainSubsystem::class.java)
		driverStation = ServiceLocator.get(DriverStation::class.java)
		
		requires(drivetrainSubsystem)
	}
	
	override fun execute() {
		var moveVal = -driverStation.getMoveVal()
		var turnVal = driverStation.getTurnVal()
		
		drivetrainSubsystem.arcadeDrive(moveVal, turnVal)
	}
	
	override fun isFinished() : Boolean {
		return false
	}
	
	override fun end() {
		drivetrainSubsystem.stopAllMotors()
	}
}