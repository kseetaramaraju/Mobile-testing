package com.calculator;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class Redmi_Mobile_Calculator {

    AndroidDriver driver;

    @BeforeTest
    public void setup() throws MalformedURLException {
        DesiredCapabilities capabilities=new DesiredCapabilities();
        capabilities.setCapability("deviceName","104e6a93");
        capabilities.setCapability("appPackage","com.miui.calculator");
        capabilities.setCapability("appActivity","com.miui.calculator.cal.CalculatorActivity");
        capabilities.setCapability("platformVersion","9 PKQ1.180904.001");
        capabilities.setCapability("platformName","Android");



        driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);


        System.out.println("Start Automation");
    }

    @Test
    public void addition() throws InterruptedException {

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement button =driver.findElement(By.id("android:id/button1"));
        button.click();

        WebElement two =driver.findElement(By.id("com.miui.calculator:id/btn_2_s"));
        two.click();

        WebElement plus =driver.findElement(By.id("com.miui.calculator:id/btn_plus_s"));
        plus.click();

        WebElement five =driver.findElement(By.id("com.miui.calculator:id/btn_5_s"));
        five.click();

        WebElement equals =driver.findElement(By.id("com.miui.calculator:id/btn_equal_s"));
        equals.click();

    }

    @Test
    public void subtraction() throws InterruptedException {

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement button =driver.findElement(By.id("android:id/button1"));
        button.click();

        WebElement eight =driver.findElement(By.id("com.miui.calculator:id/btn_8_s"));
        eight.click();


        WebElement minus =driver.findElement(By.id("com.miui.calculator:id/btn_minus_s"));
        minus.click();


        WebElement five =driver.findElement(By.id("com.miui.calculator:id/btn_5_s"));
        five.click();

        WebElement equals =driver.findElement(By.id("com.miui.calculator:id/btn_equal_s"));
        equals.click();

    }


    @Test
    public void multiplication() throws InterruptedException {

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement button =driver.findElement(By.id("android:id/button1"));
        button.click();

        WebElement three =driver.findElement(By.id("com.miui.calculator:id/btn_3_s"));
        three.click();


        WebElement mul =driver.findElement(By.id("com.miui.calculator:id/btn_mul_s"));
        mul.click();


        WebElement five =driver.findElement(By.id("com.miui.calculator:id/btn_5_s"));
        five.click();

        WebElement equals =driver.findElement(By.id("com.miui.calculator:id/btn_equal_s"));
        equals.click();

    }


    @Test
    public void division() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement button =driver.findElement(By.id("android:id/button1"));
        button.click();

        WebElement eight =driver.findElement(By.id("com.miui.calculator:id/btn_8_s"));
        eight.click();


        WebElement div =driver.findElement(By.id("com.miui.calculator:id/btn_div_s"));
        div.click();


        WebElement two =driver.findElement(By.id("com.miui.calculator:id/btn_2_s"));
        two.click();

        WebElement equals =driver.findElement(By.id("com.miui.calculator:id/btn_equal_s"));
        equals.click();

    }



}
