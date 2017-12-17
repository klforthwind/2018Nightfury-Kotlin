package main.java.frc.team2175.robot

import edu.wpi.first.wpilibj.IterativeRobot
import edu.wpi.first.wpilibj.command.Scheduler
import edu.wpi.first.wpilibj.command.Subsystem
import main.java.frc.team2175.subsystem.SubsystemFactory

class Robot : IterativeRobot() {
	
	override fun robotInit() {
		SubsystemFactory().makeAll()
	}
	
	override fun teleopPeriodic() {
		Scheduler.getInstance().run()
	}
	
	fun dank() {
		println()
	}
}