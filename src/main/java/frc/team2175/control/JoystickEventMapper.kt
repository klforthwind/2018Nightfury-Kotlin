package main.java.frc.team2175.control

import main.java.frc.team2175.ServiceLocator
import main.java.frc.team2175.command.single.*
import main.java.frc.team2175.command.group.*

class JoystickEventMapper {
	
	init {
		var driverStation : DriverStation =
				ServiceLocator.get(DriverStation::class.java)
		
		driverStation.getCatapultButton()
				.whenPressed(FireCatapultCommandGroup())
		driverStation.getIntakeButton()
				.whileHeld(IntakeBall())
	}
}