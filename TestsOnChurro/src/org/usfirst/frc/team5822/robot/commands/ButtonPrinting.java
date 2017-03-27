package org.usfirst.frc.team5822.robot.commands;

import org.usfirst.frc.team5822.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class ButtonPrinting extends Command {

    public ButtonPrinting() 
    {
        requires(Robot.printer);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() 
    {
    	Robot.printer.print();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() 
    {
        if (!Robot.oi.joystick.getRawButton(8) && !Robot.oi.xboxCtr.getRawButton(1))
        {
        	System.out.println("BOTH FALSE!");
        	return true; 
        }        
    	return false;
    }

    // Called once after isFinished returns true
    protected void end() 
    {
    	System.out.println("ending command");
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
