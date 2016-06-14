package com.magento;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	WebDriver driver;

	@BeforeTest
	public void setUp() throws FileNotFoundException, IOException {
		driver = new FirefoxDriver();
		Properties prop = new Properties();
		prop.load(new FileReader("E:\\J2EEWorkspace\\Guru99Project\\src\\com\\config\\config.properties"));
		driver.get(prop.getProperty("baseurl"));
		driver.manage().window().maximize();

	}

	@AfterTest
	public void TearDown() {
		driver.close();
		driver.quit();
	}


}
