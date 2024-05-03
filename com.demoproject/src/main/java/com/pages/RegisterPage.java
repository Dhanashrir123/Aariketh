 package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {

    @FindBy(id = "username")
    private WebElement usernameField;

    @FindBy(id = "email")
    private WebElement emailField;

    @FindBy(id = "password")
    private WebElement passwordField;

    @FindBy(id = "confirmPassword")
    private WebElement confirmPasswordField;

    @FindBy(id = "registerButton")
    private WebElement registerButton;

    // Constructor to initialize the WebDriver and elements
    public RegisterPage(WebDriver driver) {
        // Initialize elements using PageFactory
        PageFactory.initElements(driver, this);
    }

    // Method to register a user
    public void register(String username, String email, String password) {
        // Implement registration logic
    }
}