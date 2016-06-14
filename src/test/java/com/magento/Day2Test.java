package com.magento;

import static org.testng.Assert.assertEquals;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.page.IndexPage;
import com.page.actions.IndexPageAction;
import com.page.actions.MobilePageAction;
import com.page.actions.ProductPageAction;



public class Day2Test extends BaseTest {
	IndexPage indexPage;

	@Test(enabled=true)
	public void verifyCost() {
		IndexPageAction indexPage = new IndexPageAction(driver);
		String productiName = "Sony Xperia";
		System.out.println(driver.getCurrentUrl());
		indexPage.ClickOnMobileMenu();
		MobilePageAction mobilePageAction = new MobilePageAction(driver);
		String mobilePrice = mobilePageAction.getPriceByPorductName(productiName);
		mobilePageAction.clickProductByName(productiName);
		String productPrice = new ProductPageAction(driver).getProductPrice();
		// System.out.println(new ProductPageAction(driver).getProductPrice());
		assertEquals(mobilePrice, productPrice);
		Reporter.log("<b>MobilePageValue</b> "+ mobilePrice );
		Reporter.log("<b>DetailedPageValue</b> "+ productPrice );
		Reporter.log("loglvelt",1,true);
		Reporter.log("loglvel",1,false);
		Reporter.log("loglvel",2,false);
		Reporter.log("loglvelt",2,true);

	}
}
