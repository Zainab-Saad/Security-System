package com.SecuritySystem;
/** red light can be considered as an emergency light turned on in case of sound detected */
class RedLight extends Light{
    /// constructor ///
    RedLight(){}
    /// overriding method of the base class ///
    @Override public void lightFunctionality(){
        System.out.println("Red Lights Switched ON due to sound sensed !!!!");
    }
}// end RedLight class
