package com.rdk.validation.base;

import com.rdk.validation.simulator.TVsimulator;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
	
    protected TVsimulator TV;

    @BeforeClass(alwaysRun = true)
    public void setUpClass() {
        System.out.println("===== BeforeClass: Initialize TV Simulator =====");
        TV = new TVsimulator();
	TV.powerOn();
	TV.connectWifi();
    }

    @AfterClass(alwaysRun = true)
    public void tearDownClass() {
        System.out.println("===== AfterClass: Cleanup TV Simulator =====");
        TV.powerOff();
    }
}
 
