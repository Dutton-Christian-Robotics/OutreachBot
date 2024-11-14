package org.firstinspires.ftc.teamcode.dcs15815;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name = "GamepadDriving", group = "TeleOp")
public class GamepadDrivingOpMode extends LinearOpMode {

    ComplexDriveRobot bot;

    @Override
    public void runOpMode() {
        bot = new ComplexDriveRobot(hardwareMap);
        waitForStart();

        while (opModeIsActive()) {
            bot.drive(-1 * gamepad1.left_stick_y, (gamepad1.right_trigger - gamepad1.left_trigger), gamepad1.left_stick_x);
        }

    }
}