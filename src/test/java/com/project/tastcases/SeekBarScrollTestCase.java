package com.project.tastcases;

import com.project.mobileAppFunctions.MobileAppFunctions;
import com.project.utilities.BaseClass;
import org.testng.annotations.Test;

public class SeekBarScrollTestCase extends BaseClass {

    @Test
    public void seekBarScrollTestCase() throws InterruptedException {

        MobileAppFunctions mobileAppFunctions = new MobileAppFunctions(mobileDriver);
        mobileAppFunctions.seekBarScroll();

    }
}
