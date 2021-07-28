package com.project.mobileAppFunctions;

import com.project.pageobjects.ListOfitemPageObjects;
import com.project.utilities.BaseClass;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class MobileAppFunctions extends BaseClass {

    AndroidDriver mobileDriver;

    public MobileAppFunctions(AndroidDriver remoteDriver)
    {
        mobileDriver = remoteDriver;
    }

    public void animationClick() throws InterruptedException
    {
        ListOfitemPageObjects listOfitemPageObjects = new ListOfitemPageObjects(mobileDriver);
        String VisibleText1 = "Views";
        mobileDriver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"" + VisibleText1 + "\").instance(0))");
        Thread.sleep(3000);
        listOfitemPageObjects.getViewClick().click();
        Thread.sleep(3000);
        String VisibleText = "Radio Group";
        mobileDriver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"" + VisibleText + "\").instance(0))");
        listOfitemPageObjects.getRadiaoGroupClick().click();
        Thread.sleep(3000);
        listOfitemPageObjects.getSelectRadiButton().click();
        listOfitemPageObjects.getClearButton().click();


    }

    public void ratingBarClick() throws InterruptedException {
        ListOfitemPageObjects listOfitemPageObjects = new ListOfitemPageObjects(mobileDriver);

        String VisibleText1 = "Views";
        mobileDriver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"" + VisibleText1 + "\").instance(0))");
        Thread.sleep(3000);
        listOfitemPageObjects.getViewClick().click();
        String VisibleText2 = "Rating Bar";
        mobileDriver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"" + VisibleText2 + "\").instance(0))");
        Thread.sleep(3000);
        listOfitemPageObjects.getRatingBarClick().click();

        //X Axes and Y Axes navigate for elements on smart phone and perfome actions
        TouchAction touchAction = new TouchAction(mobileDriver);
        touchAction.tap(PointOption.point(451, 325)).perform();

    }

    public void seekBarScroll() throws InterruptedException {
        ListOfitemPageObjects listOfitemPageObjects = new ListOfitemPageObjects(mobileDriver);

        String VisibleText1 = "Views";
        mobileDriver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"" + VisibleText1 + "\").instance(0))");
        Thread.sleep(3000);
        listOfitemPageObjects.getViewClick().click();
        String VisibleText3 = "Seek Bar";
        mobileDriver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"" + VisibleText3 + "\").instance(0))");
        listOfitemPageObjects.getSeekBarClick().click();
        Thread.sleep(3000);
        WebElement seek_bar= listOfitemPageObjects.getSeekBarScroll();
        int start=seek_bar.getLocation().getX();
        int end=seek_bar.getSize().getWidth();
        int y=seek_bar.getLocation().getY();

        TouchAction action=new TouchAction(mobileDriver);

        int moveTo=(int)(end);
        action.press(PointOption.point(start,y)).moveTo(PointOption.point(moveTo,y)).release().perform();
    }
}
