
package frc.robot;

import edu.wpi.first.wpilibj.PS5Controller;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import edu.wpi.first.wpilibj2.command.button.Trigger;


public class RobotContainer {
  public static final PS5Controller controller = new PS5Controller(0);

  public RobotContainer() {
    configureBindings();
  }

  private void configureBindings() {

  }

  public Command getAutonomousCommand() {
    return Commands.print("No autonomous command configured");
  }
}
