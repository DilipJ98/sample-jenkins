package com.sample;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Alerts {

    @Test
    public void alertTest() {
        FirstTest test = new FirstTest();
        Assert.assertEquals(test.alertsHandleMethod(), "This is a JavaScript Alert!");
        test.closeBrowser();
    }
}
