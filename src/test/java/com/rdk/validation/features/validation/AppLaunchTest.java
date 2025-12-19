package com.rdk.validation.features;

import com.rdk.validation.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AppLaunchTest extends BaseTest {

    @Test
    public void shouldLaunchNetflix() {
        TV.launchApp("Netflix");
        Assert.assertEquals(TV.getCurrentApp(), "Netflix");
    }
}

