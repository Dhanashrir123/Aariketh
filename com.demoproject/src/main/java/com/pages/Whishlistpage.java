package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class Whishlistpage extends BaseClass {    
	

	    @FindBy(id = "add-to-wish-list-56")
	    private WebElement wishlistItem1;

	    @FindBy(id = "add-to-wish-list-53")
	    private WebElement wishlistItem2;

	    @FindBy(id = "Add to Compare-55")
	    private WebElement wishlistItem3;

	    @FindBy(id = "removefromcart-55")
	    private WebElement removeButton;

	    public void WishlistPage(WebDriver driver) {
	      
	        PageFactory.initElements(driver, this);
	    }

	    public void removeItemFromWishlist() {
	        removeButton.click();
	    }

	    public boolean isItemPresentInWishlist(String itemName) {
	        switch (itemName) {
	            case "Item1":
	                return wishlistItem1.isDisplayed();
	            case "Item2":
	                return wishlistItem2.isDisplayed();
	            case "Item3":
	                return wishlistItem3.isDisplayed();
	            default:
	                return false;
	        }
	    }
	}

