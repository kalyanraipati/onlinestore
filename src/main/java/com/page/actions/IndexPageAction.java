package com.page.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.page.IndexPage;

public class IndexPageAction extends IndexPage {

	public IndexPageAction(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void ClickOnMobileMenu() {
		Mobile_menu.click();
	}

}
