package org.firstinspires.ftc.robotcontroller.TeleOp;

import static org.firstinspires.ftc.robotcore.external.BlocksOpModeCompanion.gamepad1;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareDevice;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class Robot {
    private DcMotor frontRight;
    private DcMotor backRight;
    private DcMotor frontLeft;
    private DcMotor backLeft;

    public void init(HardwareMap hwMap) {
        frontLeft = hwMap.dcMotor.get("front_left");
        frontLeft.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        frontRight = hwMap.dcMotor.get("front_right");
        frontRight.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        backLeft = hwMap.dcMotor.get("back_left");
        backLeft.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        backRight = hwMap.dcMotor.get("back_right");
        backRight.setMode(DcMotor.RunMode.RUN_USING_ENCODER);

        frontRight.setDirection(DcMotorSimple.Direction.REVERSE);
        backRight.setDirection(DcMotorSimple.Direction.REVERSE);
    }

    void mecDrive(double power_red, double power_blue) { //add shit here broski
        frontLeft.setPower(power_blue);
        frontRight.setPower(power_red);

        backLeft.setPower(power_red);
        backRight.setPower(power_blue);
    }
}
