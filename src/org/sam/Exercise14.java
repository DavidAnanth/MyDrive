package org.sam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Exercise14 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\Lenovo\\eclipse-workspace\\SeleniumActions\\drivers\\msedgedriver.exe");

		WebDriver drv = new EdgeDriver();

		drv.get("https://www.flipkart.com/");

		drv.manage().window().maximize();

		Actions a = new Actions(drv);
		
		Thread.sleep(3000);
		
				
		WebElement appl = drv.findElement(By.xpath("(//div[@class='YBLJE4'])[6]"));
		appl.click();
		
		Thread.sleep(3000);
		
		WebElement srhTxt = drv.findElement(By.xpath("//span[text()='TVs & Appliances']"));
		a.moveToElement(srhTxt).perform();
		
		Thread.sleep(3000);
		
		WebElement tv = drv.findElement(By.xpath("//a[text()='Smart & Ultra HD']"));
		tv.click();
	}

}
