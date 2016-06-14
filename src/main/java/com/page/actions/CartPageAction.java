package com.page.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.page.CartPage;

public class CartPageAction extends CartPage {
	public CartPageAction(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void setQty(String qty) {
		Qty_element.clear();
		Qty_element.sendKeys(qty);
	}

	public void clickUpdate() {
		Update_element.click();

	}

	public String getErrorMessage() {
		return ErrorMessage_element.getText();
	}

	public void clickEmptyCart() {
		EmptyCart_element.click();
	}

	public String getEmptyPageTileString() {

		return EmptyPageTitle_element.getText();
	}

}
