package org.sam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Exercise10 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\Lenovo\\eclipse-workspace\\SeleniumActions\\drivers\\msedgedriver.exe");

		WebDriver drv = new EdgeDriver();

		drv.get("https://www.snapdeal.com/");

		drv.manage().window().maximize();

		Actions a = new Actions(drv);
		
		WebElement btn = drv.findElement(By.id("pushDenied"));
		btn.click();
		
		Thread.sleep(2000);
		
		WebElement womFas = drv.findElement(By.xpath("//li[@navindex='2']"));
		a.moveToElement(womFas).perform();
		
		WebElement heels = drv.findElement(By.xpath("//span[text()='Heels']"));
		heels.click();
	}

}
