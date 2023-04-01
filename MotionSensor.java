package com.SecuritySystem;
/** motion sensor a type of sensor */
public class MotionSensor extends Sensor{
    /// constructor ///
    MotionSensor(){}
    MotionSensor(int sensorNumber, String ON_OFF_state, boolean isWorkingCorrectly, String dateOfInstallation, String placeOfInstallation){
        super(sensorNumber, ON_OFF_state, isWorkingCorrectly, dateOfInstallation, placeOfInstallation);
    }
    /// overriding sense method ///
    @Override public void sense(){
        // motion sensor senses irregular motion
        System.out.println("ALERT: Motion Sensed.....");
        // sensor locks the doors after sensing the motion and intelligently locks the doors.
        lockDoors();
        /** set following attribute to true, so that alarm can be sounded and emergency green light can be switched on
         to indicate emergency */
        super.sensorHasSensed = true;
    }
    // unique functionality to lock doors //
    public void lockDoors(){
        System.out.println("DANGER ALERT!!!! Locking the doors.....");
    }
}// end MotionSensor class
