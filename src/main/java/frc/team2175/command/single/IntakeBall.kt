package main.java.frc.team2175.command.single

import edu.wpi.first.wpilibj.command.Command
import main.java.frc.team2175.ServiceLocator
import main.java.frc.team2175.subsystem.*

class IntakeBall : Command() {
	var intake : IntakeSubsystem
	
	init {
		intake = ServiceLocator.get(IntakeSubsystem::class.java)
		
		requires(intake)
	}
	
	override fun execute() {
		intake.runIn()
	}
	
	override fun isFinished() : Boolean {
		return false
	}
	
	override fun end() {
		intake.stop()
	}
}