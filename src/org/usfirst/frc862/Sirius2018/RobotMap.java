// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc862.Sirius2018;

// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import com.ctre.CANTalon;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.VictorSP;

// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static SpeedController driveTrainLeft1;
    public static SpeedController driveTrainLeft2;
    public static SpeedController driveTrainRight1;
    public static SpeedController driveTrainRight2;
    public static CANTalon shooterFlyLeft;
    public static CANTalon shooterFlyRight;
    public static DoubleSolenoid shooterKicker;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        driveTrainLeft1 = new VictorSP(3);
        LiveWindow.addActuator("DriveTrain", "Left1", (VictorSP) driveTrainLeft1);
        driveTrainLeft1.setInverted(true);
        driveTrainLeft2 = new VictorSP(2);
        LiveWindow.addActuator("DriveTrain", "Left2", (VictorSP) driveTrainLeft2);
        driveTrainLeft2.setInverted(true);
        driveTrainRight1 = new VictorSP(0);
        LiveWindow.addActuator("DriveTrain", "Right1", (VictorSP) driveTrainRight1);
        driveTrainRight1.setInverted(false);
        driveTrainRight2 = new VictorSP(1);
        LiveWindow.addActuator("DriveTrain", "Right2", (VictorSP) driveTrainRight2);
        driveTrainRight2.setInverted(false);
        shooterFlyLeft = new CANTalon(5);
//        LiveWindow.addActuator("Shooter", "FlyLeft", shooterFlyLeft);
        
        shooterFlyRight = new CANTalon(4);
//        LiveWindow.addActuator("Shooter", "FlyRight", shooterFlyRight);
        
        shooterKicker = new DoubleSolenoid(11, 2, 3);
        LiveWindow.addActuator("Shooter", "Kicker", shooterKicker);
        

        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
}
