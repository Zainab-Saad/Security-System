**BRIEF EXPLANATION:**
The concepts of inheritance, association, and polymorphism are used to design a security system consisting of sensors,
lights and alarm.

**COMMENTS:**
- Since sensor, alarm and light are the components of a security system or in other words, Security System HAS these 3
components. So a HAS-A relation (association) is established between SecuritySystem and (Sensor, Alarm, Light classes).
- There are 3 types of sensor: smoke sensor, sound sensor and motion sensor. So established a IS-A relation (inheritance)
between Sensor class and SmokeSensor class, Sensor class and SoundSensor class, Sensor class and MotionSensor class.
- There are 3 types of lights as per this design, all three inherit Light class. Thus, IS-A relation (inheritance)
is established between Light and NormalLight, Light and RedLight, Light and GreenLight.
- Runtime polymorphism also used in the TestSecuritySystem class that instantiates the desired class as per the input
entered
