package com.test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SelectDropDown {
	
	@Test
	public void Test1()

	 {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\SeleniumJars\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com");
		
		driver.manage().window().maximize();
		
		WebElement SelectDrpDown = driver.findElement(By.id("searchDropdownBox"));
		
		Select sel = new Select(SelectDrpDown);
		
		sel.selectByIndex(5);
		
		sel.selectByValue("search-alias=amazon-pharmacy");
		
		sel.selectByVisibleText("Appliances");
		
		driver.close();
		
		
		
		

	}
	
	@Test
	public void Test2()
	{
System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\SeleniumJars\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.Amazon.com");
		
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle());
		
		WebElement AccountList = driver.findElement(By.xpath("//span[text()='Account & Lists']"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(AccountList).perform();
		
		driver.findElement(By.xpath("//span[text()='Orders']")).click();
		
		driver.close();
	}

}
