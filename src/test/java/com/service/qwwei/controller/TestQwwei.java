package com.service.qwwei.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestQwwei {

        QwweiDelegate qwweiDelegate = new QwweiDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = qwweiDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}