/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.templates.RobotMap;

/**
 *
 * @author 997robotics4
 */
public class SpitBall extends CommandGroup {
    
    public SpitBall() {
   
      
        
        addSequential(new extendGathererOnly());
        addSequential(new GathererWheelsOut());
       
    }
}
