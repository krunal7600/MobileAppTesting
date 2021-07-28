package com.project.tastcases;

import com.project.mobileAppFunctions.MobileAppFunctions;
import com.project.utilities.BaseClass;
import org.testng.annotations.Test;

public class InvokeTestCase extends BaseClass {
    @Test
    public void invokeTestCase() throws InterruptedException {

        MobileAppFunctions mobileAppFunctions = new MobileAppFunctions(mobileDriver);
        mobileAppFunctions.animationClick();

    }
}
