package com.magento;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Day1Test extends BaseTest {

	@Test
	public void TestDay1Test() throws InterruptedException {
		String homePageTitle = "Home page";

		//Assert.assertEquals(homePageTitle, driver.getTitle());
		System.out.println(driver.findElement(By.xpath("//a[contains(text(),'Mobile')]")).getText());
		// System.out.println(driver.findElement(By.linkText("Mobile")).getText());
		// System.out.println(driver.findElement(By.partialLinkText("Mobile")).getText());
		driver.findElement(By.xpath("//a[contains(text(),'Mobile')]")).click();
		System.out.println(driver.getCurrentUrl());
		//Assert.assertEquals("Mobile", driver.getTitle());

		Select select = new Select(driver.findElement(By.xpath("//select[@title='Sort By' and position()=1]")));
		for (WebElement element : select.getOptions()) {
			System.out.println(element.getText());
			// System.out.println(element.isSelected());

		}

		System.out.println(select.getFirstSelectedOption().getText());
		// select.selectByVisibleText("Position");

		Thread.sleep(5000);
		List<String> sortedByNameList = new ArrayList<String>();
		sortedByNameList.add("IPHONE");
		sortedByNameList.add("SONY XPERIA");
		sortedByNameList.add("SAMSUNG GALAXY");

		Collections.sort(sortedByNameList);

		List<String> actualByNameList = new ArrayList<String>();

		for (WebElement element : driver
				.findElements(By.xpath("//ul[contains(@class,'products-grid')]/descendant::h2"))) {
			actualByNameList.add(element.getText());
			System.out.println(element.getText());
		}

		//Assert.assertEquals(actualByNameList, sortedByNameList);

	}

}
