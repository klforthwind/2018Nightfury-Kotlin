package main.java.frc.team2175.subsystem

import com.ctre.CANTalon

class IntakeSubsystem : BaseSubsystem() {
	
	var intake : CANTalon
	
	init {
		
		intake = CANTalon(8)
	}
	
	fun runIn() {
		intake.set(0.8)
	}
	
	fun stop() {
		intake.set(0.0)
	}
}