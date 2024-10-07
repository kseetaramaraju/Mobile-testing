package com.pages;


import com.baseclass.BasePage;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class RegisterPage extends BasePage {


    public RegisterPage()  {
        PageFactory.initElements(driver,this);
    }

    TouchAction touchAction;


    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View[1]/android.widget.ListView/android.view.View[5]/android.view.View")
    WebElement login;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[8]/android.widget.EditText[1]")
    WebElement email;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[8]/android.widget.EditText[2]")
    WebElement re_email;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[8]/android.widget.EditText[3]")
    WebElement password;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[8]/android.widget.Button")
    WebElement create_button;


    public void register_operation() throws InterruptedException {

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        Thread.sleep(5000);
        login.click();

        Thread.sleep(3000);
        scrollDown();

        email.click();
        email.sendKeys("kseetaramaraju@gmail.com");

        re_email.click();
        re_email.sendKeys("kseetaramaraju@gmail.com");

        password.click();
        password.sendKeys("Seeta@123");
        Thread.sleep(5000);
        create_button.click();

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
