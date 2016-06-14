package com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ProductPage {

	WebDriver driver;
	public ProductPage(WebDriver driver) {
		this.driver=driver;
	}
	
	@CacheLookup
	@FindBy(css="span.price")
	public WebElement price;
		
	
}
