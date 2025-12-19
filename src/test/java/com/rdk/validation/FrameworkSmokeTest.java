package com.rdk.validation;

import com.rdk.validation.base.BaseTest;
import org.testng.annotations.Test;
import org.testng.Assert;

public class FrameworkSmokeTest extends BaseTest {

    @Test
    public void frameworkShouldRun() {
        System.out.println("TestNG framework is running successfully");
        Assert.assertTrue(true);
    }
}
 
