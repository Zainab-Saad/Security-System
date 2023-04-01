package com.SecuritySystem;
/** normal building lights switched off due to smoke detected to avoid short-circuiting and fire*/
class NormalLight extends Light{
    /// constructor ///
    NormalLight(){}
    /// overriding method of the base class ///
    @Override public void lightFunctionality(){
        System.out.println("Fire expected; Lights Switched Off !!!!");
    }
}// end NormalLight class
