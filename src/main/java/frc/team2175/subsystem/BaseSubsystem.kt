package main.java.frc.team2175.subsystem

import edu.wpi.first.wpilibj.command.Command
import edu.wpi.first.wpilibj.command.Subsystem
import main.java.frc.team2175.ServiceLocator

open class BaseSubsystem : Subsystem(){
	init {
		ServiceLocator.register(this)
	}
	
	override fun initDefaultCommand() {
	}
	
	override fun setDefaultCommand(command : Command) {
		super.setDefaultCommand(command);
	}
}