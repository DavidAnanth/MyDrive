package org.sam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Exercise8 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\Lenovo\\eclipse-workspace\\SeleniumActions\\drivers\\msedgedriver.exe");

		WebDriver drv = new EdgeDriver();

		drv.get("https://www.homedepot.com/");

		drv.manage().window().maximize();

		Actions a = new Actions(drv);

		WebElement shopAll = drv.findElement(By.xpath("//p[text()='Shop All']"));
		shopAll.click();		
		Thread.sleep(2000);

		WebElement allDept = drv.findElement(By.xpath("(//div[@class='sui-flex-auto sui-my-1 sui-block'])[4]"));
		allDept.click();		
		Thread.sleep(2000);

		WebElement paint = drv.findElement(By.id("menu-item-id-67ZimwQYnTW1rmUeYp5OzU"));
		paint.click();		
		Thread.sleep(2000);
		
		WebElement intPaint = drv.findElement(By.id("menu-item-id-514dpJFkktPdH3srIoSANW"));
		intPaint.click();		
		Thread.sleep(2000);
		
		WebElement ceilPaint = drv.findElement(By.id("menu-item-id-6aycmcIm7V636JGgXbucIK"));
		ceilPaint.click();
		
	}

}
