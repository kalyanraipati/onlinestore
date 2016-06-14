package com.page.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.page.MobilePage;
import com.page.ProductPage;

public class ProductPageAction extends ProductPage {
	public ProductPageAction(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public String getProductPrice() {
		System.out.println( price.getText());
		
		return price.getText();
	}

}
