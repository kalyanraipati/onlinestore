package com.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IndexPage {

	WebDriver driver;

	public IndexPage(WebDriver driver) {
		this.driver = driver;
	}

	// @CacheLookup
	// @FindBy(xpath = "//a[contains(text(),'Mobile')]")
	// public WebElement Mobile_menu;
	//
	@CacheLookup
	@FindBy(linkText = "MOBILE")
	public WebElement Mobile_menu;

}
