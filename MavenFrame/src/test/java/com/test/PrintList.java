package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class PrintList {
	
	@Test
	public static void TestPrintingList() throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\SeleniumJars\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com");
		
		driver.manage().window().maximize();
		
		
		WebElement AccountList = driver.findElement(By.xpath("//span[text()='Account & Lists']"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(AccountList).perform();
		
	//    Thread.sleep(3000);
		
		//driver.findElement(By.xpath("//span[text()='Orders']")).click();
	    
		
        List<WebElement> account = driver.findElements(By.id("nav-al-your-account"));

        System.out.println(account.size());

        for (int i = 0; i<account.size();i++) {
            String name = account.get(i).getText();
            System.out.println(name);
        }
		

		driver.quit();

	}

}
