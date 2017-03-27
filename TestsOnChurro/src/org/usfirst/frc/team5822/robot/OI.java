package org.usfirst.frc.team5822.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

import org.usfirst.frc.team5822.robot.commands.*;


public class OI 
{
	Boolean blublu = false;
	Boolean blibli = false;
	public Joystick joystick = new Joystick(0);
	public Joystick xboxCtr = new Joystick(1);
	
	public Button j8 = new JoystickButton(joystick, 8);
	public Button buttonA = new JoystickButton(xboxCtr, 1); 
	
	public OI()
	{		
		buttonA.whenActive(new ButtonPrinting()); 
		j8.whenActive(new ButtonPrinting());
		
		if (!joystick.getRawButton(8) && !xboxCtr.getRawButton(1))
		{
			System.out.println("CANCELING THIS COMMAND");
			new XboxButtonPrint(); 
		}
		//buttonA.whenInactive(new XboxButtonPrint());
		
		
		//j8.whenReleased(new XboxButtonPrint());
	}
}
