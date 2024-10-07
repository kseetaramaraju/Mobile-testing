package com.calculator;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class CalculatorEmulator
{

    AndroidDriver driver;

    @BeforeTest
    public void setup() throws MalformedURLException {
        DesiredCapabilities capabilities=new DesiredCapabilities();
        capabilities.setCapability("deviceName","emulator-5554");
        capabilities.setCapability("appPackage","com.android.calculator2");
        capabilities.setCapability("appActivity","com.android.calculator2.Calculator");
        capabilities.setCapability("platformVersion","9.0");
        capabilities.setCapability("platformName","Android");



        driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);


        System.out.println("Start Automation");
    }

    @Test
    public void addition() throws InterruptedException {

        Thread.sleep(2000);
        WebElement two =driver.findElement(By.id("com.android.calculator2:id/digit_2"));
        two.click();

        Thread.sleep(2000);

        WebElement plus =driver.findElement(By.id("com.android.calculator2:id/op_add"));
        plus.click();

        Thread.sleep(2000);

        WebElement five =driver.findElement(By.id("com.android.calculator2:id/digit_5"));
        five.click();

        Thread.sleep(2000);

        WebElement equals =driver.findElement(By.id("com.android.calculator2:id/eq"));
        equals.click();

        Thread.sleep(2000);
    }

    @Test
    public void subtraction() throws InterruptedException {

        Thread.sleep(2000);
        WebElement eight =driver.findElement(By.id("com.android.calculator2:id/digit_8"));
        eight.click();

        Thread.sleep(2000);

        WebElement minus =driver.findElement(By.id("com.android.calculator2:id/op_sub"));
        minus.click();

        Thread.sleep(2000);

        WebElement five =driver.findElement(By.id("com.android.calculator2:id/digit_5"));
        five.click();

        Thread.sleep(2000);

        WebElement equals =driver.findElement(By.id("com.android.calculator2:id/eq"));
        equals.click();

        Thread.sleep(2000);
    }


    @Test
    public void multiplication() throws InterruptedException {

        Thread.sleep(2000);
        WebElement three =driver.findElement(By.id("com.android.calculator2:id/digit_3"));
        three.click();

        Thread.sleep(2000);

        WebElement mul =driver.findElement(By.id("com.android.calculator2:id/op_mul"));
        mul.click();

        Thread.sleep(2000);

        WebElement five =driver.findElement(By.id("com.android.calculator2:id/digit_5"));
        five.click();

        Thread.sleep(2000);

        WebElement equals =driver.findElement(By.id("com.android.calculator2:id/eq"));
        equals.click();

        Thread.sleep(2000);
    }


    @Test
    public void division() throws InterruptedException {

        Thread.sleep(2000);
        WebElement eight =driver.findElement(By.id("com.android.calculator2:id/digit_8"));
        eight.click();

        Thread.sleep(2000);

        WebElement div =driver.findElement(By.id("com.android.calculator2:id/op_div"));
        div.click();

        Thread.sleep(2000);

        WebElement two =driver.findElement(By.id("com.android.calculator2:id/digit_2"));
        two.click();

        Thread.sleep(2000);

        WebElement equals =driver.findElement(By.id("com.android.calculator2:id/eq"));
        equals.click();

        Thread.sleep(2000);
    }


}
