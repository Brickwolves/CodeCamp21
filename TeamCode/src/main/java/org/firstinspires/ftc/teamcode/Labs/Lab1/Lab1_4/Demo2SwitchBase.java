package org.firstinspires.ftc.teamcode.Labs.Lab1.Lab1_4;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;


@TeleOp(name="LAB 1.4: Switch Demo 1", group="Iterative Opmode")
public class Demo2SwitchBase extends OpMode {
	
	int demoInt = 0;
	
	//String demoString = "1";
	
	@Override
	public void init() {
	
	}
	
	
	@Override
	public void loop() {
		
		switch (demoInt){
			
			case 1:
				telemetry.addData("case", 1);
				break;
			
			case 2:
				telemetry.addData("case", 2);
				break;
			
			case 3:
				telemetry.addData("case", 3);
				break;
			
			
		}
		
		/*switch (demoString){
			
			case "1":
				telemetry.addData("case", 1);
				break;
			
			case "2":
				telemetry.addData("case", 2);
				break;
			
			case "3":
				telemetry.addData("case", 3);
				break;
			
			
		}*/
		
	}
}