package org.firstinspires.ftc.teamcode.Labs.Lab3;

import android.os.Build;

import androidx.annotation.RequiresApi;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.util.ElapsedTime;

import org.firstinspires.ftc.teamcode.Hardware.Mecanum;

import static org.firstinspires.ftc.teamcode.Utilities.OpModeUtils.multTelemetry;
import static org.firstinspires.ftc.teamcode.Utilities.OpModeUtils.setOpMode;

@Disabled
@Autonomous(name="LAB 3: Auto", group="Autonomous Linear Opmode")
public class LinearAuto extends LinearOpMode
{
    private ElapsedTime runtime = new ElapsedTime();
    private Mecanum robot;

    public void initialize(){
        setOpMode(this);

        robot = new Mecanum();

        multTelemetry.addData("Status", "Initalized");
        multTelemetry.update();
    }

    public void BREAKPOINT(){

        while (true){
            break;
        }

        multTelemetry.addData("Status", "BREAK");
        multTelemetry.update();
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    public void runOpMode()
    {

        initialize();

        multTelemetry.addLine("Waiting for start");
        multTelemetry.update();
        waitForStart();


        if (opModeIsActive()){

            /*
                    Y O U R   C O D E   H E R E
                                                   */

        }
   }
}
