package com.qagroup.lec5.web;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SimpleGoogleScenario {
	private WebDriver driver;
	private String baseUrl;

	@BeforeClass(alwaysRun = true)
	public void setUp() {
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");

		driver = new FirefoxDriver();
		baseUrl = "https://www.google.com.ua/";

		// Will wait for an element to appear for 30 seconds
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void testSimpleGoogleScenario() {
		driver.get(baseUrl);
		driver.findElement(By.id("lst-ib")).clear();
		driver.findElement(By.id("lst-ib")).sendKeys("selenium ide");
		driver.findElement(By.name("btnG")).click();
		driver.findElement(By.linkText("Selenium IDE Plugins")).click();
		driver.findElement(By.linkText("Download")).click();

		assertEquals(driver.getTitle(), "Downloads");
	}

	@Test
	public void testInDomainLanguage() {
//		google.openStartPage().searchFor("Selenium IDE")
//		.selectResult("Selenium IDE Plugins").navigateToDownloadPage();
	}

	@AfterClass(alwaysRun = true)
	public void tearDown() {
		driver.quit();
	}

}
