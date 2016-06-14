package com.magento;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.page.actions.CartPageAction;
import com.page.actions.IndexPageAction;
import com.page.actions.MobilePageAction;

public class Day3Test extends BaseTest {

	@Test
	public void TestDay3Test() {
		IndexPageAction indexPage = new IndexPageAction(driver);
		String productName = "Sony Xperia";
		indexPage.ClickOnMobileMenu();
		MobilePageAction mobilePageAction = new MobilePageAction(driver);
		mobilePageAction.clickProductCartByName(productName);
		CartPageAction cartPageAction = new CartPageAction(driver);
		cartPageAction.setQty("10000");
		cartPageAction.clickUpdate();
		assertTrue(cartPageAction.getErrorMessage().contains("cannot be ordered in requested quantity"),"contains cannot be ordered in requested quantity");
		cartPageAction.clickEmptyCart();
		assertTrue(cartPageAction.getEmptyPageTileString().contains("SHOPPING CART IS EMPTY") , "SHOPPING CART IS EMPTY");
		
	}

}
