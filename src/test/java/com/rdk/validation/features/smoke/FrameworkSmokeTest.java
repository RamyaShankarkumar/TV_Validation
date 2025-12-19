package com.rdk.validation;

import com.rdk.validation.base.BaseTest;
import org.testng.annotations.Test;
import org.testng.Assert;
import com.rdk.validation.simulator.TVsimulator;

public class FrameworkSmokeTest extends BaseTest {

    @Test
    public void frameworkShouldRun() {
        System.out.println("TestNG framework is running successfully");
        Assert.assertTrue(true);
    }

    @Test
    public void smokeSimulatorTest() {
        TVsimulator tv = new TVsimulator();

        tv.powerOn();
        Assert.assertTrue(tv.isOn());

        tv.connectWifi();
        Assert.assertTrue(tv.isWifiConnected());

        tv.launchApp("Netflix");
        Assert.assertEquals(tv.getCurrentApp(), "Netflix");

        tv.powerOff();
        Assert.assertFalse(tv.isOn());
    }
}
 
