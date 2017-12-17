package main.java.frc.team2175.command.single

import edu.wpi.first.wpilibj.command.Command
import main.java.frc.team2175.ServiceLocator
import main.java.frc.team2175.subsystem.CatapultSubsystem

class RetractCatapultCommand : Command() {
	var catapultSubsystem : CatapultSubsystem
	
	init {
		catapultSubsystem =
				ServiceLocator.get(CatapultSubsystem::class.java)
		
		requires(catapultSubsystem)
	}
	
	override fun initialize() {
		catapultSubsystem.setCatapultPos(false)
	}
	
	override fun isFinished() : Boolean {
		return false
	}
}