package org.usfirst.frc.team5822.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

import org.usfirst.frc.team5822.robot.commands.*;


public class OI 
{
	Joystick joystick = new Joystick(0);
	Joystick xboxCtr = new Joystick(1);
	
	Button j8 = new JoystickButton(joystick, 8);
	Button buttonA = new JoystickButton(xboxCtr, 1); 
	
	public OI()
	{
		buttonA.whenActive(new ButtonPrinting()); 		
		buttonA.whenInactive(new XboxButtonPrint());
		
		j8.whenActive(new ButtonPrinting());
		j8.whenInactive(new XboxButtonPrint());
	}
}
