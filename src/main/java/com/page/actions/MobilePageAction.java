package com.page.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.page.IndexPage;
import com.page.MobilePage;

public class MobilePageAction extends MobilePage {

	public MobilePageAction(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);

	}

	public String getPriceByPorductName(String productName) {
		return getProductPriceByPorductName(productName).getText();
	}

	public void clickProductByName(String productName) {
		getProductByPorductName(productName).click();

	}

	public void clickProductCartByName(String productName) {
		getProductCartByPorductName(productName).click();

	}

	public void clickAddToCartByName(String productName) {
		getProductAddtoCartByPorductName(productName).click();
	}

	public void clickCompare() {
		Compare_WebElement.click();
	}
}
