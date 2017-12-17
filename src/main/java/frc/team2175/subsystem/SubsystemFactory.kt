package main.java.frc.team2175.subsystem

class SubsystemFactory() {
	
	 fun makeAll() {
		DrivetrainSubsystem()
		CatapultSubsystem()
		IntakeSubsystem()
	}
}