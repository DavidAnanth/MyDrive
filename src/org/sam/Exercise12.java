package org.sam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Exercise12 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\Lenovo\\eclipse-workspace\\SeleniumActions\\drivers\\msedgedriver.exe");

		WebDriver drv = new EdgeDriver();

		drv.get("https://www.amazon.in");

		drv.manage().window().maximize();

		Actions a = new Actions(drv);
		
		Thread.sleep(2000);
		
		WebElement signOpt = drv.findElement(By.xpath("//span[text()='Hello, sign in']"));
		a.moveToElement(signOpt).perform();
		
		Thread.sleep(2000);
		
		WebElement sellAcct = drv.findElement(By.xpath("//span[text()='Your Seller Account']"));
		sellAcct.click();

		/*WebElement newAcct = drv.findElement(By.id("auth-create-account-link"));
		newAcct.click();
		
		Thread.sleep(2000);
		
		WebElement name = drv.findElement(By.name("customerName"));
		name.sendKeys("Joyal");
		
		WebElement mob = drv.findElement(By.xpath("//input[@type='tel']"));
		mob.sendKeys("098765432109");
		
		WebElement pwd = drv.findElement(By.name("password"));
		pwd.sendKeys("password");*/		
			
	}

}
