package com.screenerTestCases;

import com.pages.RegisterPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class RegisterTest extends RegisterPage {

    public RegisterPage registerPage;

    @BeforeMethod
    public void setUp() throws  MalformedURLException {
        setup();
        registerPage = new RegisterPage();
    }


    @Test
    public void registerPage_test() throws InterruptedException {
       registerPage.register_operation();
    }

}
