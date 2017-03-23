package org.usfirst.frc.team5822.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Printer extends Subsystem {

   public void print()
   {
	   System.out.println("running command");
   }

   public void stopPrint()
   {
	   System.out.println("stopping print");
   }
   
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

