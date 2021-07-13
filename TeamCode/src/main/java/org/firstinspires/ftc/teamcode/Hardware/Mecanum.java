package org.firstinspires.ftc.teamcode.Hardware;

import com.qualcomm.robotcore.util.ElapsedTime;

import org.firstinspires.ftc.teamcode.Hardware.Sensors.IMU;

import static org.firstinspires.ftc.teamcode.Utilities.OpModeUtils.multTelemetry;


public class Mecanum {

   public IMU imu;

   public static ElapsedTime time = new ElapsedTime();

   public Mecanum(){
      initRobot();
   }

   public void initRobot() {

      /*
            I N I T   M O T O R S
       */

      imu      = new IMU("imu");

      multTelemetry.addData("Status", "Initialized");
      multTelemetry.update();
   }

   /**
    * @param power
    */
   public void setAllPower(double power){
        /*

                Y O U R   C O D E   H E R E

         */
   }

   /**
    * @param power
    */
   public void setDrivePower(double power){
        /*

                Y O U R   C O D E   H E R E

         */
   }


   /**
    * IMPLEMENT ME
    * @param ticks
    */
   public void strafe(double ticks){
        /*

                Y O U R   C O D E   H E R E

         */
   }

   /**
    * IMPLEMENT ME
    * @param degrees
    * @param moe
    */
   public void turn(double degrees, double moe){
        /*

                Y O U R   C O D E   H E R E

         */
   }


   /**
    * @param position
    * @param distance
    * @param acceleration
    * @return the coefficient [0, 1] of our power
    */
   public static double powerRamp(double position, double distance, double acceleration){
        /*

                Y O U R   C O D E   H E R E

         */
      return 0;
   }
}