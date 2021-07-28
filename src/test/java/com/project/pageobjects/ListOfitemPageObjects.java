package com.project.pageobjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class ListOfitemPageObjects {

    public ListOfitemPageObjects(AppiumDriver mobileDriver)
    {
        PageFactory.initElements(new AppiumFieldDecorator(mobileDriver), this);
    }

    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc='Views']")
    WebElement ViewClick;

    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc='Radio Group']")
    WebElement RadiaoGroupClick;

    @AndroidFindBy(xpath = "//android.widget.RadioButton[@content-desc='All of them']")
    WebElement SelectRadiButton;

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc='Clear']")
    WebElement ClearButton;

    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc='Rating Bar']")
    WebElement RatingBarClick;

    @AndroidFindBy(xpath = "//android.widget.SeekBar[@index='0']")
    WebElement seekBarScroll;

    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc='Seek Bar']")
    WebElement SeekBarClick;

    public WebElement getViewClick() {return ViewClick; }

    public WebElement getRadiaoGroupClick()
    {
        return RadiaoGroupClick;
    }

    public WebElement getSelectRadiButton()
    {
        return SelectRadiButton;
    }

    public WebElement getClearButton()
    {
        return ClearButton;
    }

    public WebElement getRatingBarClick()
    {
        return RatingBarClick;
    }

    public WebElement getSeekBarScroll() { return seekBarScroll; }

    public WebElement getSeekBarClick() { return SeekBarClick;  }
}
