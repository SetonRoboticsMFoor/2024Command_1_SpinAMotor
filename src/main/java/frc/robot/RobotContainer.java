// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import frc.robot.commands.SpinMotorCommand;
import frc.robot.subsystems.MotorSubsystem;

public class RobotContainer {

  private final MotorSubsystem m_motorSubsystem;
  private final SpinMotorCommand m_spinMotorCom;

  public RobotContainer() {
    m_motorSubsystem = new MotorSubsystem();
    m_spinMotorCom = new SpinMotorCommand(m_motorSubsystem);

    m_motorSubsystem.setDefaultCommand(new SpinMotorCommand(m_motorSubsystem));

    m_motorSubsystem.setDefaultCommand(m_spinMotorCom);

    configureBindings();
  }

  private void configureBindings() {

  }
}
