package org.firstinspires.ftc.robotcontroller.TeleOp;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;
import java.lang.Math.*;

@TeleOp(name = "exampleTeleOp", group = "Interactive OpMode")

public class testTeleOp extends OpMode {

    public Robot robot = new Robot();

    @Override
    public void init() {
        robot.init(hardwareMap);
    }

    @Override
    public void loop() {
        double x = gamepad1.left_stick_x;
        double y = gamepad1.left_stick_y;
        double angle = Math.tan(y/x);
        double magnitude = Math.abs(Math.sqrt((x * x) + (y * y)));

        double direction_red = Math.sin(angle - (1/4) * Math.PI) * magnitude;
        double direction_blue = Math.sin(angle + (1/4) * Math.PI) * magnitude;

        robot.mecDrive(direction_red, direction_blue);

    }
}