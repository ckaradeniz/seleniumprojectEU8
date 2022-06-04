package com.cydeo.tests.day8_properties_config_reader;

import org.testng.annotations.Test;

public class LearningProperties {

    @Test
    public void java_properties_reading_test(){
        //key = value
        //os.name = Linux
        //user.name = xmsn
        System.out.println("System.getProperty(\"os.name\") = " + System.getProperty("os.name"));//System.getProperty("os.name") = Linux
        System.out.println("System.getProperty(\"user.name\") = " + System.getProperty("user.name"));//System.getProperty("user.name") = xmsn

    }

}
