package com.SecuritySystem;

/**
 Each sensor has some things in common like sensor number, it's on/off state, is it working correctly,
 its date of installation, where it is installed, etc.
 common functionality of sensors may include switching on and off, resetting, etc. /// common methods, don't override in
 subclasses
 Each sensor has to ‘detect’ or ‘sense’ something but they all will do it differently /// methods will be overridden in
 subclasses
 */

public class Sensor {
    /// attributes ///
    private int sensorNumber;
    private String ON_OFF_state;
    private boolean isWorkingCorrectly = true;
    private String dateOfInstallation = "12.04.2018";
    private String placeOfInstallation = "Giga Mall Ground Floor";
    protected boolean sensorHasSensed = false; // boolean variable that changes its value once the sensor senses smoke, sound, motion
    /// constructors ///
    Sensor(){}
    // call setters inside the constructor
    Sensor(int sensorNumber, String ON_OFF_state, boolean isWorkingCorrectly, String dateOfInstallation, String placeOfInstallation){
        setSensorNumber(sensorNumber);
        setON_OFF_state(ON_OFF_state);
        setWorkingCorrectly(isWorkingCorrectly);
        setDateOfInstallation(dateOfInstallation);
        setPlaceOfInstallation(placeOfInstallation);
    }
    /// SETTERS ///
    public void setSensorNumber(int sensorNumber){if(sensorNumber >=1 || sensorNumber <=3)this.sensorNumber = sensorNumber;}
    public void setON_OFF_state(String ON_OFF_state){
        if(ON_OFF_state.equals("ON") || ON_OFF_state.equals("OFF"))
            this.ON_OFF_state = ON_OFF_state;}
    public void setWorkingCorrectly(boolean isWorkingCorrectly){this.isWorkingCorrectly = isWorkingCorrectly;}
    public void setDateOfInstallation(String dateOfInstallation){this.dateOfInstallation = dateOfInstallation;}
    public void setPlaceOfInstallation(String placeOfInstallation){this.placeOfInstallation = placeOfInstallation;}
    /// GETTERS ///
    public int getSensorNumber(){return sensorNumber;}
    public String getON_OFF_state(){return ON_OFF_state;}
    public boolean getWorkingCorrectly(){return isWorkingCorrectly;}
    public String getDateOfInstallation(){return dateOfInstallation;}
    public String getPlaceOfInstallation(){return placeOfInstallation;}

    /// overriding toString method ///
    @Override public String toString(){
        return "Sensor Information: \nSensor Number: " + getSensorNumber() + "\nON/OFF: " + getON_OFF_state() +
                "\nIs Working correctly: " + getWorkingCorrectly() + "\nDate of Installation: " + getDateOfInstallation()
                + "\nPlace Of Installation: " + getPlaceOfInstallation();
    }
    // common methods for all sensors  ---- do not override in the subclasses
    public void switchingOn(){
        System.out.println("Switching ON the sensors....");
    }
    public void switchingOFF(){
        System.out.println("Switching OFF the sensors....");
    }
    public void resetting(){
        System.out.println("Resetting the sensor....");
    }
    // type specific methods for sensors ---- can be overidden
    public void sense(){
        System.out.println("Sensing....");
    }
}// end Sensor class
