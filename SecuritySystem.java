package com.SecuritySystem;

/** security system has sensors, alarms and lights as its parts, thus establishing HAS-A relationship for
 sensor, alarm and light */
public class SecuritySystem {
    private Sensor sensorActivated;
    /// constructor ///
    SecuritySystem(){}
    /// methods ///
    // method to activate the sensor ---
    public void activateSensor(){
        // create a HAS-A relation between SecuritySystem and Sensor
        // Security System has a sensor, activating the sensor
        sensorActivated = new Sensor();
        // switch on the sensor
        sensorActivated.setON_OFF_state("ON");
        sensorActivated.switchingOn();
    }
    // method to sound the alarm ---
    public void soundAlarm(){
        // create HAS-A relation between SecuritySystem and Alarm
        // sound the alarm once sensor senses something
        Alarm alarm = new Alarm();
        alarm.soundAlarm();
    }
    // method to switch on lights depending upon the information received
    public void switchOnOffLights(int sensorNumber){
        Light light;    // instantiating the Light class
        /**following conditions check which sensor sensed and accordingly switches on/ off different lights
         lightFunctionality method of parent Light class is overridden in each subclass, calling that method*/
        if (sensorNumber == 1){
            light = new NormalLight();
            light.lightFunctionality();
        } else if (sensorNumber == 2){
            light = new RedLight();
            light.lightFunctionality();
        }else if (sensorNumber == 3){
            light = new GreenLight();
            light.lightFunctionality();
        }
    }
    // method to end the process of sensing, sounding the alarm and switching on/ off lights
    // switches off the sensor to avoid wearing out of sensors and the resets it if it has to sense again.
    public void endProcess(){
        sensorActivated.switchingOFF();
        sensorActivated.resetting();
    }
}// end Security System class
