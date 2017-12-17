package main.java.frc.team2175.command

import main.java.frc.team2175.subsystem.*
import main.java.frc.team2175.ServiceLocator
import main.java.frc.team2175.command.single.*

class DefaultCommandFactory {
	
	fun makeAll() {
		var drivetrainSubsystem : DrivetrainSubsystem =
				ServiceLocator.get(DrivetrainSubsystem::class.java)
	
		drivetrainSubsystem
				.setDefaultCommand(ArcadeDriveWithJoysticksCommand())
	}
} 