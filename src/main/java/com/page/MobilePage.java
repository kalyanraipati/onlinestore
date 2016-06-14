
package com.page;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MobilePage {
	WebDriver driver;

	@FindBy(xpath="//button[@title='Compare']")
	protected WebElement Compare_WebElement;
	
	public MobilePage(WebDriver driver) {
		this.driver = driver;
	}

	protected WebElement getProductPriceByPorductName(String productName) {
		return driver.findElement(
				By.xpath("//a[contains(text(),'" + productName + "')]/parent::h2/following-sibling::div/span/span"));
	}

	protected WebElement getProductByPorductName(String productName) {
		return driver.findElement(By.xpath("//a[contains(text(),'" + productName + "')]"));
	}

	protected WebElement getProductCartByPorductName(String productName) {
		return driver.findElement(By.xpath("//a[contains(text(),'" + productName
				+ "')]/parent::h2/following-sibling::div/button[@title='Add to Cart']"));
	}

	protected WebElement getProductAddtoCartByPorductName(String productName) {

		return driver.findElement(By.xpath("//a[contains(text(),'" + productName
				+ "')]/parent::h2/following-sibling::div//ul/li/a[contains(@class,'link-compare')]"));
	}

}
