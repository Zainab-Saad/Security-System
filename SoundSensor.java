package com.SecuritySystem;
/** sound sensor a type of sensor*/
public class SoundSensor extends Sensor {
    /// constructors ///
    SoundSensor() {}
    SoundSensor(int sensorNumber, String ON_OFF_state, boolean isWorkingCorrectly, String dateOfInstallation, String placeOfInstallation) {
        super(sensorNumber, ON_OFF_state, isWorkingCorrectly, dateOfInstallation, placeOfInstallation);
    }
    /// overriding sense method ///
    @Override
    public void sense() {
        // sound sensor senses the sound
        System.out.println("ALERT: Sound Sensed.....");
        // sound sensor calls police on sensing irrelevant sound
        callPolice();
        /** set following attribute to true, so that alarm can be sounded and emergency red light can be switched on
         to indicate emergency */
        super.sensorHasSensed = true;
    }
    // unique functionality of sound sensor to call police //
    public void callPolice() {
        System.out.println("7768 Calling.... Sound Sensed at " + getPlaceOfInstallation() + " HELP!");
    }
}// end SoundSensor class
