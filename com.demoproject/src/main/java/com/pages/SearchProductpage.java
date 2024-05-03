package com.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class SearchProductpage  extends BaseClass{
	

	    @FindBy(id ="navbarsearchform-keyword")
	    private WebElement searchInput;

	    @FindBy(name="navsearch")
	    private WebElement searchButton;

	    public SearchProductpage(WebDriver driver) {
	    
	        PageFactory.initElements(driver, this);
	    }

	public void searchProduct(String productName) {
	        searchInput.sendKeys(productName);
	        searchButton.click();
	}
}
 