package frc.robot.Commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.Subsystem.Intake.Intake;

public class IntakeCommand extends Command {
  public IntakeCommand() {
    addRequirements(Intake.getInstance());
  }

  @Override
  public void initialize() {}

  @Override
  public void execute() {
    Intake.getInstance().setPower(12);
  }

  @Override
  public void end(boolean interrupted) {
    Intake.getInstance().setPower(0);
  }

  @Override
  public boolean isFinished() {
    return Intake.getInstance().getSensor();
  }
}
