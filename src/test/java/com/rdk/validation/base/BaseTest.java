package com.rdk.validation.base;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    // Proper constructor
    public BaseTest() {
        System.out.println("BaseTest constructor called");
    }

    @BeforeMethod
    public void setUp() {
        System.out.println("===== Test Setup =====");
        // Later: initialize simulator, load config, connect to device
    }

    @AfterMethod
    public void tearDown() {
        System.out.println("===== Test Teardown =====");
        // Later: cleanup, disconnect, reset state
    }
}
 
