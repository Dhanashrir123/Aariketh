
	package com.pages;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	import com.base.BaseClass;

	public class AddToCartPage extends BaseClass {
	  

	    @FindBy(id = "addToCartButton")
	    private WebElement addToCartButton;

	    @FindBy(id = "productQuantity")
	    private WebElement quantityField;

	    @FindBy(id = "productSize")
	    private WebElement sizeDropdown;

	    public AddToCartPage(WebDriver driver) {
	    	
	        PageFactory.initElements(driver, this);
	    }

	    public void addToCart(int quantity, String size) {
	        quantityField.clear();
	        quantityField.sendKeys(String.valueOf(quantity));
	        sizeDropdown.sendKeys(size);
	        addToCartButton.click();
	    }
	}


