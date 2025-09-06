package org.firstinspires.ftc.teamcode.SubSystems;

import com.rowanmcalpin.nextftc.core.Subsystem;
import com.rowanmcalpin.nextftc.core.command.Command;
import com.rowanmcalpin.nextftc.ftc.hardware.controllables.MotorEx;
import com.rowanmcalpin.nextftc.ftc.hardware.controllables.SetPower;

public class Intake extends Subsystem {

    public static final Intake INSTANCE = new Intake();
    private Intake(){ }

    public MotorEx intake;
    public String intakeName = "intake_motor";

    public Command colet(){
        return new SetPower(intake, 1, this);
    }
    public Command disable(){
        return new SetPower(intake, 0, this);
    }

    @Override
    public void initialize(){
        intake = new MotorEx(intakeName);
    }

}
