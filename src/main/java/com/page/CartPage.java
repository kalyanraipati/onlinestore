package com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage {
	WebDriver driver;
	public CartPage(WebDriver driver) {
		this.driver=driver;
	}
	
	@FindBy(xpath="//input[@title='Qty']")
	protected WebElement Qty_element;
	
	@FindBy(xpath="//button[@title='Update']")
	protected WebElement Update_element;
	
	@FindBy(css=".error-msg span")
	protected WebElement ErrorMessage_element;
	
	@FindBy(xpath="//button[@title='Empty Cart']")
	protected WebElement EmptyCart_element;
	
	@FindBy(css=".page-title h1")
	protected WebElement EmptyPageTitle_element;
}
