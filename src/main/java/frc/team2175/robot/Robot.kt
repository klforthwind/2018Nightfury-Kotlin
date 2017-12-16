package main.java.frc.team2175.robot

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Scheduler

class Robot : IterativeRobot() {
	
	override fun robotInit() {
		
	}
	
	override fun teleopPeriodic() {
		Scheduler.getInstance().run()
	}
}