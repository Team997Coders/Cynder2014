/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.wpi.first.wpilibj.templates.commands;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 * @author 997robotics4
 */
class setHasPreppedCommand extends CommandBase {

    public setHasPreppedCommand() {
        requires(subShooter);
    }

    protected void initialize() {
      subShooter.isPrepped = true;
    }

    protected void execute() {
        
    }

    protected boolean isFinished() {
        return true;
    }

    protected void end() {
       
    }

    protected void interrupted() {
       
    }
    
}
