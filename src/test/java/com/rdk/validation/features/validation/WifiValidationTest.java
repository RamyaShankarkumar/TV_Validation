package com.rdk.validation.features.validation;

import com.rdk.validation.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WifiValidationTest extends BaseTest {

    @Test(groups = "validation")
    public void wifiConnectTest() {
        TV.connectWifi();
        Assert.assertTrue(TV.isWifiConnected());
    }
}

