package com.huawei.servicecomb.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestProject2hhw {

        Project2hhwDelegate project2hhwDelegate = new Project2hhwDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = project2hhwDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}