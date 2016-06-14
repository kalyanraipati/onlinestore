package com.magento;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.page.actions.IndexPageAction;
import com.page.actions.MobilePageAction;

public class Day4Test extends BaseTest {
	@Test
	public void TestDay4Test() throws InterruptedException {
		IndexPageAction indexPage = new IndexPageAction(driver);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String productName1 = "Sony Xperia";
		String productName2 = "IPhone";
		indexPage.ClickOnMobileMenu();
		MobilePageAction mobilePageAction = new MobilePageAction(driver);
		mobilePageAction.clickAddToCartByName(productName1);
		System.out.println("done");
		mobilePageAction.clickAddToCartByName(productName2);
		String parentWindow = this.driver.getWindowHandle();
		mobilePageAction.clickCompare();
		Thread.sleep(5000);
		Set<String> windows=this.driver.getWindowHandles();
		windows.remove(parentWindow);
		for (String window : windows) {
			this.driver.switchTo().window(window);
			System.out.println(driver.getTitle());
			Thread.sleep(5000);
			this.driver.close();
		}
		
		driver.switchTo().window(parentWindow);
		System.out.println(driver.getTitle());
	}
}
