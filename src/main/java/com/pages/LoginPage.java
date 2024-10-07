package com.pages;

import com.baseclass.BasePage;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {
    TouchAction touchAction;
    public LoginPage()
    {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View[1]/android.widget.ListView/android.view.View[5]/android.view.View")
    WebElement login;


    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[3]/android.view.View[2]")
    WebElement loginhere;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[8]/android.widget.EditText[1]")
    WebElement email;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[8]/android.widget.EditText[2]")
    WebElement password;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[8]/android.widget.Button")
    WebElement loginbutton;


    public void login_operation() throws InterruptedException {
     Thread.sleep(2000);
     login.click();

        Thread.sleep(3000);
        loginhere.click();

        Thread.sleep(6000);
        scrollDown();

        Thread.sleep(3000);
        email.click();
        email.sendKeys("kseetaramaraju1@gmail.com");

        Thread.sleep(3000);
        password.click();
        password.sendKeys("Seeta@123");

        Thread.sleep(3000);
        loginbutton.click();
    }

    public void scrollDown()
    {
        Dimension size=driver.manage().window().getSize();
        int startx=size.getWidth()/2;
        int endx=size.getWidth()/2;

        int starty=(int)(size.getHeight()*0.50);
        int endy=(int)(size.getHeight()*0.10);

        touchAction=new TouchAction(driver).press(PointOption.point(startx,starty)).waitAction()
                .moveTo(PointOption.point(endx,endy)).release().perform();
    }

}
