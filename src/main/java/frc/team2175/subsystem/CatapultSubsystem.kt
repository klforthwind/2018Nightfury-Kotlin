package main.java.frc.team2175.subsystem

import edu.wpi.first.wpilibj.Solenoid

class CatapultSubsystem : BaseSubsystem() {
	
	var rightSolenoid : Solenoid
	var leftSolenoid : Solenoid
	
	init {
		rightSolenoid = Solenoid(3)
		leftSolenoid = Solenoid(2)
	}
	
	fun setCatapultPos(isUp : Boolean) {
		rightSolenoid.set(isUp)
		leftSolenoid.set(isUp)
	}
}