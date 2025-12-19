package com.rdk.validation.features.smoke;

import com.rdk.validation.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PowerSmokeTest extends BaseTest {

    @Test(groups = "smoke")
    public void powerOnSmokeTest() {
        TV.powerOn();
        Assert.assertEquals(TV.getPowerState(), "ON");
    }
}

