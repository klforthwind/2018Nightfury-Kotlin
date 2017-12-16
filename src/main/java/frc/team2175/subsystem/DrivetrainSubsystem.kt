package main.java.frc.team2175.subsystem

import com.ctre.CANTalon

class DrivetrainSubsystem : BaseSubsystem() {
	lateinit var leftMaster : CANTalon;
	lateinit var leftSlaveOne : CANTalon;
	lateinit var leftSlaveTwo : CANTalon;
	lateinit var rightMaster : CANTalon;
	lateinit var rightSlaveOne : CANTalon;
	lateinit var rightSlaveTwo : CANTalon;
	
	init {
		 leftMaster = CANTalon(1);
		 leftSlaveOne= CANTalon(2);
		 leftSlaveTwo  = CANTalon(3);
		 rightMaster = CANTalon(4);
		 rightSlaveOne = CANTalon(5);
		 rightSlaveTwo  = CANTalon(6);	
	}
	
	
}