package org.usfirst.frc.team5822.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class AutoShoot10 extends CommandGroup {

    public AutoShoot10() 
    {
    	addSequential(new Shoot()); //need to fix this code, only in here for the SC
    	addParallel(new IntakeAfter10());
    }
}
