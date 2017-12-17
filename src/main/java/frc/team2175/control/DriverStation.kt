package main.java.frc.team2175.control

import edu.wpi.first.wpilibj.Joystick
import edu.wpi.first.wpilibj.buttons.Button
import edu.wpi.first.wpilibj.buttons.JoystickButton
import main.java.frc.team2175.ServiceLocator

class DriverStation {
	var leftJoystick : Joystick
	var rightJoystick : Joystick
	
	var fireButton : JoystickButton
	var intakeButton : JoystickButton
	
	init {
		leftJoystick = Joystick(0)
		rightJoystick = Joystick(1)
		
		fireButton = JoystickButton(leftJoystick, 1)
		intakeButton = JoystickButton(rightJoystick, 1)
		
		ServiceLocator.register(this)
	}
	
	fun getMoveVal() : Double {
		return leftJoystick.getY()
	}
	
	fun getTurnVal() : Double {
		return rightJoystick.getX()
	}
	
	fun getCatapultButton() : JoystickButton {
		return fireButton
	}
	
	fun getIntakeButton() : JoystickButton {
		return intakeButton
	}
}