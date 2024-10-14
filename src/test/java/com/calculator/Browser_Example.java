package com.calculator;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class Browser_Example {

    AndroidDriver driver;

    @Test
    public void setup() throws MalformedURLException, InterruptedException {
        DesiredCapabilities capabilities=new DesiredCapabilities();
        capabilities.setCapability("deviceName","emulator-5554");
        capabilities.setCapability("appPackage","com.android.chrome");
        capabilities.setCapability("appActivity","com.google.android.apps.chrome.Main");
        capabilities.setCapability("platformVersion","9.0");
        capabilities.setCapability("platformName","Android");

        driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement acceptAndContinue=driver.findElement(By.id("com.android.chrome:id/terms_accept"));
        acceptAndContinue.click();

        WebElement nothanks=driver.findElement(By.id("com.android.chrome:id/negative_button"));
        nothanks.click();

        WebElement enter=driver.findElement(By.id("com.android.chrome:id/search_box_text"));
        enter.sendKeys("www.amazon.com");

        WebElement searchAndClick=driver.findElement(By.xpath("\t\n" +
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.TextView[2]"));
        searchAndClick.click();

        WebElement asearch=driver.findElement(By.id("nav-search-keywords"));
        asearch.click();
        asearch.sendKeys("iphone");

        WebElement item=driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[1]/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View[2]/android.view.View/android.view.View[1]/android.widget.Button"));
        item.click();

        System.out.println("Start Automation");
    }

}
