package main.java.frc.team2175.command.group

import edu.wpi.first.wpilibj.command.CommandGroup
import main.java.frc.team2175.command.single.*

class FireCatapultCommandGroup : CommandGroup() {
	init {
		addSequential(ExtendCatapultCommand(), .75)
		addSequential(RetractCatapultCommand(), .1)
	}
}