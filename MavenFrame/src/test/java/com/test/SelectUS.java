package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class SelectUS {
	
	@Test
	
	public void SelectDropDown()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\SeleniumJars\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		
		driver.manage().window().maximize();
		
		WebElement SelectDrpDown = driver.findElement(By.name("country"));
		
		Select sel = new Select(SelectDrpDown);
		
		
		List<WebElement> li = sel.getOptions();
		System.out.println(li.size());
		
		for(int i = 0; i<li.size();i++)  //0<264 //0
		{
			
			System.out.println(li.get(i).getText());
			
			li.get(i).click();
			
			//System.out.println(li.get(4).getText());
			
			
			
			
		
			if(li.get(i).getText().equalsIgnoreCase("ANGOLA") )
			{
				li.get(i).click();
				
				System.out.println(li.get(i).getText());
				break;
			}
			
			//break;
		}
		driver.quit();
	}
	

}
