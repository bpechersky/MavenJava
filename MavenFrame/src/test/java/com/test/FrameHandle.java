package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class FrameHandle {
	@Test
	public  void Cancellation() {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\SeleniumJars\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.yatra.com/");
		
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle());
		
		WebElement Support = driver.findElement(By.xpath("//a[text()='Support ']"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(Support).perform();
		driver.findElement(By.xpath("//a[text()='Talk To Us']")).click();
		
		
		driver.switchTo().frame("iframeChatBot");
		
		driver.findElement(By.xpath("//button[text()='Cancellation']")).click();
		
		driver.switchTo().defaultContent(); //come out frm the frame
		
		driver.findElement(By.id("chatbot_close_button")).click();
		
		driver.close();
		
	}
	
	
	@Test
	public  void Eticket() {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\SeleniumJars\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.yatra.com/");
		
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle());
		
		WebElement Support = driver.findElement(By.xpath("//a[text()='Support ']"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(Support).perform();
		driver.findElement(By.xpath("//a[text()='Talk To Us']")).click();
		
		
		driver.switchTo().frame("iframeChatBot");
		
		driver.findElement(By.xpath("//button[text()='e-Tickets']")).click();
		
		driver.switchTo().defaultContent(); //come out frm the frame
		
		driver.findElement(By.id("chatbot_close_button")).click();
		
		driver.close();
		
	}
	
	@Test
	public  void Modification() {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\SeleniumJars\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.yatra.com/");
		
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle());
		
		WebElement Support = driver.findElement(By.xpath("//a[text()='Support ']"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(Support).perform();
		driver.findElement(By.xpath("//a[text()='Talk To Us']")).click();
		
		
		driver.switchTo().frame("iframeChatBot");
		
		driver.findElement(By.xpath("//button[text()='Modification']")).click();
		
		driver.switchTo().defaultContent(); //come out frm the frame
		
		driver.findElement(By.id("chatbot_close_button")).click();
		
		driver.close();
		
	}

}
