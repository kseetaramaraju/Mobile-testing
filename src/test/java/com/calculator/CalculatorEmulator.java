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
import java.time.Duration;

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

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement two =driver.findElement(By.id("com.android.calculator2:id/digit_2"));
        two.click();

        WebElement plus =driver.findElement(By.id("com.android.calculator2:id/op_add"));
        plus.click();

        WebElement five =driver.findElement(By.id("com.android.calculator2:id/digit_5"));
        five.click();


        WebElement equals =driver.findElement(By.id("com.android.calculator2:id/eq"));
        equals.click();

    }

    @Test
    public void subtraction() throws InterruptedException {

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement eight =driver.findElement(By.id("com.android.calculator2:id/digit_8"));
        eight.click();

        WebElement minus =driver.findElement(By.id("com.android.calculator2:id/op_sub"));
        minus.click();

        WebElement five =driver.findElement(By.id("com.android.calculator2:id/digit_5"));
        five.click();

        WebElement equals =driver.findElement(By.id("com.android.calculator2:id/eq"));
        equals.click();
    }


    @Test
    public void multiplication() throws InterruptedException {

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement three =driver.findElement(By.id("com.android.calculator2:id/digit_3"));
        three.click();

        WebElement mul =driver.findElement(By.id("com.android.calculator2:id/op_mul"));
        mul.click();

        WebElement five =driver.findElement(By.id("com.android.calculator2:id/digit_5"));
        five.click();

        WebElement equals =driver.findElement(By.id("com.android.calculator2:id/eq"));
        equals.click();

    }


    @Test
    public void division() throws InterruptedException {

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement eight =driver.findElement(By.id("com.android.calculator2:id/digit_8"));
        eight.click();

        WebElement div =driver.findElement(By.id("com.android.calculator2:id/op_div"));
        div.click();

        WebElement two =driver.findElement(By.id("com.android.calculator2:id/digit_2"));
        two.click();

        WebElement equals =driver.findElement(By.id("com.android.calculator2:id/eq"));
        equals.click();
    }


}
