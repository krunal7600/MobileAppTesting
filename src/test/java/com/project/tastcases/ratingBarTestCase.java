package com.project.tastcases;

import com.project.mobileAppFunctions.MobileAppFunctions;
import com.project.utilities.BaseClass;
import org.testng.annotations.Test;

public class ratingBarTestCase extends BaseClass {

    @Test
    public void ratingBarTestCase() throws InterruptedException {

        MobileAppFunctions mobileAppFunctions = new MobileAppFunctions(mobileDriver);
        mobileAppFunctions.ratingBarClick();

    }
}
