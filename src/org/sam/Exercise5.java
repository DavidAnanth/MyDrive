package org.sam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Exercise5 {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Lenovo\\eclipse-workspace\\SeleniumActions\\drivers\\msedgedriver.exe");
		
		WebDriver drv = new EdgeDriver();
		
		drv.get("https://www.shopclues.com/wholesale.html");
		
		drv.manage().window().maximize();
		
		Actions a = new Actions(drv);
			
		WebElement mob = drv.findElement(By.xpath("//a[text()='Sports & More']"));
		a.moveToElement(mob).perform();
		
		Thread.sleep(2000);
		
		WebElement prd = drv.findElement(By.xpath("//a[text()='Weight Gainers']"));
		prd.click();
		
	}
}
