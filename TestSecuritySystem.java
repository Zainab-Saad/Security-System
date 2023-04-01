package com.SecuritySystem;
import java.util.Scanner;   // import Scanner class from java.util package
// Test class for the security system
public class TestSecuritySystem {
    // make static fields that can be used in both static methods main() and processStart()
    private static Scanner sc; private static SecuritySystem ss;
    // main method with proper signature that begins the execution of java program
    public static void main(String ... args){
        sc = new Scanner(System.in);    // instantiating Scanner class
        System.out.println("\n*** WELCOME TO SECURITY SYSTEM'S AGENCY! ***\n******* YOU CAN TEST SECURITY SYSTEM *******\n");
        // activate the security system which activates the sensor, alarm and lighting system to be used anytime
        // if y prompted
        System.out.println("Do you wish to start, press y to start and n to exit: ");
        // start the testing process if user wishes to start else end the program
        String startTheProgram = sc.next();     // input the user's choice
        if(startTheProgram.equals("y") || startTheProgram.equals("Y")) {    // if by-chance capital Y is entered
            ss = new SecuritySystem(); ss.activateSensor();
            processStart();
        }if(startTheProgram.equals("n") || startTheProgram.equals("N")){    // program caters entry of n or N
            System.out.println("Program Ended....");
        }
    }// end main method
    // method that starts the process that security system performs
    public static void processStart(){
        System.out.println("To check the security system, press any of the following keys on keyboard:\n" +
                "                     ____________\n" +
                "                     |1. smoke  | \n" +
                "                     |2. sound  | \n" +
                "                     |3. motion | \n" +
                "                     ____________" );
        // prompt the user for input, give options to enter the number 1, 2, 3 for the smoke, sound and motion triggers
        // instantiate classes accordingly to sense smoke, sound and motion, ring the alarm and switch ON/OFF lights
        int keyPress = sc.nextInt();    // prompt the user to enter the specified key
        // if invalid key is entered
        if(keyPress < 1 || keyPress > 3){
            System.out.println("Valid key not pressed");
        }else {
            // use run-time polymorphism to activate the respective sensor on key press
            Sensor sensorToBeActivated;
            if (keyPress == 1) {
                sensorToBeActivated = new SmokeSensor(1, "ON", true,
                        "12.08.18", "Giga Mall Ground Floor");
                // sensorToBeActivated can access overridden methods only
                sensorToBeActivated.sense();    // sensor senses the trigger and outputs what is sensed
                // all the methods that belong to SensorClass can now be accessed
                SmokeSensor smokeSensor = (SmokeSensor)sensorToBeActivated;
                // if sensor has sensed the trigger, then sound alarm and switch off lights to avoid hazards
                if (smokeSensor.sensorHasSensed) {
                    ss.soundAlarm();
                    ss.switchOnOffLights(1);
                }
            }else if (keyPress == 2) {
                sensorToBeActivated = new SoundSensor(2, "ON", true,
                        "12.08.18", "Giga Mall Ground Floor");
                sensorToBeActivated.sense();
                SoundSensor soundSensor = (SoundSensor)sensorToBeActivated;
                // if sensor has sensed the trigger, then sound alarm and switch on emergency red light as warning
                if (soundSensor.sensorHasSensed) {
                    ss.soundAlarm();
                    ss.switchOnOffLights(2);
                }
            }else {
                sensorToBeActivated = new MotionSensor(3, "ON", true,
                        "12.08.18", "Giga Mall Ground Floor");
                sensorToBeActivated.sense();
                MotionSensor motionSensor = (MotionSensor)sensorToBeActivated;
                // if sensor has sensed the trigger, then sound the alarm and switch on emergency green light as warning
                if (motionSensor.sensorHasSensed) {
                    ss.soundAlarm();
                    ss.switchOnOffLights(3);
                }
            }
            System.out.println();
            /**end the process by resetting and switching OFF the sensor, to avoid wearing out due to being switched ON
            for long time */
            ss.endProcess();
        }// end else block of code
    }// end processStart method
}// end Test class
