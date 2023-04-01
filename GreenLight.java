package com.SecuritySystem;
/** green light can be considered as an emergency light turned on in case motion detected */
class GreenLight extends Light{
    /// constructor ///
    GreenLight(){}
    /// overriding method of the base class ///
    @Override public void lightFunctionality(){
        System.out.println("Green Lights Switched ON due to motion sensed !!!!");
    }
}// end GreenLight class
