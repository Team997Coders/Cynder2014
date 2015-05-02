/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.commands;

/**
 *
 * @author 997robotics4
 */
public class WinchToSetpoint extends CommandBase {
    private double setpoint;
    public WinchToSetpoint(double setpoint) {
    this.setpoint = setpoint;    
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        requires(subShooter);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    subShooter.resetEncoder();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        subShooter.extendWinch();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return subShooter.getEncoder()>setpoint;
    }

    // Called once after isFinished returns true
    protected void end() {
        
        subShooter.stopWinch();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
        
        subShooter.stopWinch();
    }
}
