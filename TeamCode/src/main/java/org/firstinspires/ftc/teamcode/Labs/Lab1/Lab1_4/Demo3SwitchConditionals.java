package org.firstinspires.ftc.teamcode.Labs.Lab1.Lab1_4;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.Hardware.Controls.Controller;


@TeleOp(name="LAB 1.4: Switch Demo 2", group="Iterative Opmode")
public class Demo3SwitchConditionals extends OpMode {
	
	int demoInt = 0;
	
	Controller controller1;
	
	@Override
	public void init() {
		
		controller1 = new Controller(gamepad1);
		
	}
	
	
	@Override
	public void loop() {
		
		switch (demoInt){
			
			case 1:
				telemetry.addData("case", 1);
				
				if(controller1.circle.press()) demoInt = 2;
				
				break;
			
				
			case 2:
				telemetry.addData("case", 2);
				
				if(controller1.circle.press()) demoInt = 3;
				
				break;
			
				
			case 3:
				telemetry.addData("case", 3);
				
				if(controller1.circle.press()) demoInt = 1;
				
				break;
			
			
		}
		
	}
}