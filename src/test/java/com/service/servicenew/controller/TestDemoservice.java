package com.service.servicenew.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestDemoservice {

        DemoserviceDelegate demoserviceDelegate = new DemoserviceDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = demoserviceDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}