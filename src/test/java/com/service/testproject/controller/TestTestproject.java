package com.service.testproject.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestTestproject {

        TestprojectDelegate testprojectDelegate = new TestprojectDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = testprojectDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}