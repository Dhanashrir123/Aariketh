package com.tests;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.base.BaseClass;
import com.pages.RegisterPage;

public class RegisterTest extends BaseClass {

    RegisterPage registerPage;

    @BeforeSuite
    public void setup() throws Exception {
        initialization();
        reportInit();
        registerPage = new RegisterPage(driver);
    }

    @Test
    public void testRegistration() {
        // Provide test data for registration
        String username = "testuser";
        String email = "testemail@example.com";
        String password = "password";

        // Perform registration
        registerPage.register(username, email, password);

        // Add assertions to ve                   rify successful registration
        // For example, check for confirmation message or redirect to dashboard
        // Assert.assertTrue(...);
    }

    // Add more test methods to cover other scenarios related to registration
}