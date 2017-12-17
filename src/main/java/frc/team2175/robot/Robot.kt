package main.java.frc.team2175.robot

import edu.wpi.first.wpilibj.IterativeRobot
import edu.wpi.first.wpilibj.command.Scheduler
import edu.wpi.first.wpilibj.command.Subsystem
import main.java.frc.team2175.subsystem.*
import main.java.frc.team2175.control.*
import main.java.frc.team2175.command.DefaultCommandFactory

class Robot : IterativeRobot() {
	
	override fun robotInit() {
		SubsystemFactory().makeAll()
		DriverStation()
		DefaultCommandFactory().makeAll()
		
		JoystickEventMapper()
	}
	
	override fun teleopPeriodic() {
		Scheduler.getInstance().run()
	}
}