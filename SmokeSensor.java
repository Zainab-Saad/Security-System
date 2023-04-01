package com.SecuritySystem;
/** smoke sensor a type of sensor */
public class SmokeSensor extends Sensor{
    /// constructors ///
    SmokeSensor(){}
    SmokeSensor(int sensorNumber, String ON_OFF_state, boolean isWorkingCorrectly, String dateOfInstallation, String placeOfInstallation){
        super(sensorNumber, ON_OFF_state, isWorkingCorrectly, dateOfInstallation, placeOfInstallation);
    }
    /// overriding sense method of parent class
    @Override public void sense(){
        // smoke sensor senses the smoke
        System.out.println("ALERT: Smoke Sensed.....");
        // smoke sensor calls the fire brigade
        callFireBrigade();
        // sound the alarm and switch on lights only if sensor senses the smoke
        super.sensorHasSensed = true;
    }
    // unique functionality of smoke sensor to call fire brigade //
    public void callFireBrigade(){
        System.out.println("1234 Calling.... Smoke Sensed at " + getPlaceOfInstallation() + " HELP!!");
    }
}// end SmokeSensor class
