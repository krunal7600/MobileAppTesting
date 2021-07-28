package com.project.utilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.ServerSocket;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BaseClass {

    public static AndroidDriver<AndroidElement> mobileDriver;
    AppiumDriverLocalService appiumService;
    String appiumServiceUrl;

    @BeforeClass
    public void setup() throws MalformedURLException
    {

        File f = new File("Application_build");
        File fileName = new File(f, "ApiDemos-debug.apk");

        try
        {
            if (appiumService == null)
            {
                boolean flag = checkIfServerIsRunnning(4723);
                if (!flag)
                {
                    appiumService = AppiumDriverLocalService.buildDefaultService();
                    appiumService.start();
                }
            }
        }
        catch (NullPointerException e)
        {
            e.printStackTrace();
        }

        String appiumServiceUrl = appiumService.getUrl().toString();
        System.out.println("Appium Service Address : - "+ appiumServiceUrl);

        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus 4 API 24");
        cap.setCapability(MobileCapabilityType.APP, fileName.getAbsolutePath());
        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
        cap.setCapability("platformName", "Android");
        cap.setCapability("autoGrantPermissions", true);
        cap.setCapability("noResetValue","false");
        cap.setCapability(MobileCapabilityType.UDID, "emulator-5554");

        mobileDriver = new AndroidDriver<AndroidElement>(new URL(appiumServiceUrl), cap);
        mobileDriver.manage().timeouts().implicitlyWait(3, TimeUnit.MINUTES);
    }

    public static boolean checkIfServerIsRunnning(int port) {

        boolean isServerRunning = false;
        ServerSocket serverSocket;
        try
        {
            serverSocket = new ServerSocket(port);

            serverSocket.close();
        }
        catch (IOException e)
        {

            isServerRunning = true;
        }
        finally
        {
            serverSocket = null;
        }
        return isServerRunning;
    }
    @AfterClass
    public void mobileTearDown()
    {
        if (appiumService != null)
        {
            appiumService.stop();
        }
    }
}
