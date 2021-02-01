package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MultiTest {

	WebDriver driver;

	@BeforeClass
	public void initalization() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\SeleniumJars\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("https://www.amazon.com");

		driver.manage().window().maximize();
	}

	@Test(priority = 1)
	public void SelectDropdown()

	{
		// TODO Auto-generated method stub

		WebElement SelectDrpDown = driver.findElement(By.id("searchDropdownBox"));

		Select sel = new Select(SelectDrpDown);

		sel.selectByIndex(5);

		sel.selectByValue("search-alias=amazon-pharmacy");

		sel.selectByVisibleText("Appliances");

	}

	@Test(priority = 2)
	public void AdvanceDropdown() {

		WebElement SelectDrpDown = driver.findElement(By.id("searchDropdownBox"));

		Select sel = new Select(SelectDrpDown);

		List<WebElement> li = sel.getOptions();
		System.out.println(li.size());

		for (int i = 0; i < li.size(); i++) {

			li.get(i).click();
			System.out.println(li.get(i).getText());
		}

	}

	@AfterClass
	public void cleanup() {
		driver.close();
	}

}
