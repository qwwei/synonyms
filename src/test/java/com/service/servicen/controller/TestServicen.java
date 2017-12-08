package com.service.servicen.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestServicen {

        ServicenDelegate servicenDelegate = new ServicenDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = servicenDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}