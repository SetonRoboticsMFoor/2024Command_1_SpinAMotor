// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.RelativeEncoder;
import com.revrobotics.CANSparkLowLevel.MotorType;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class MotorSubsystem extends SubsystemBase {

  private CANSparkMax mainMotor;
  private RelativeEncoder mainMotorEncoder;
  
  public MotorSubsystem() {
    mainMotor = new CANSparkMax(Constants.MotorConstants.kMainMotorPort, MotorType.kBrushless);
    mainMotorEncoder = mainMotor.getEncoder();
  }

  public void spinFwd() {
mainMotor.set(Constants.SpeedConstants.kMainMotorFwdSpeed);
  }

  public void spinRev() {
mainMotor.set(Constants.SpeedConstants.kMainMotorRevSpeed);
  }

  public void stop() {
mainMotor.set(Constants.SpeedConstants.kStopSpeed);
  }

  
  @Override
  public void periodic() {
    SmartDashboard.putNumber("Main Motor Encoder Value: ", mainMotorEncoder.getPosition());
  }

}
