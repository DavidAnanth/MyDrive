package org.sam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class SeleniumActions {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\eclipse-workspace\\SeleniumActions\\drivers\\chromedriver.exe");
		
		WebDriver drv = new ChromeDriver();
		
		drv.get("http://demo.guru99.com/test/drag_drop.html");
		
		drv.manage().window().maximize();
		
		Actions a = new Actions(drv);
		
		WebElement bnkSrc = drv.findElement(By.xpath("//a[text()=' BANK ']"));
		WebElement bnkTgt = drv.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		a.dragAndDrop(bnkSrc, bnkTgt).perform();
		
		WebElement bnkAmt = drv.findElement(By.xpath("//a[text()=' 5000 ']"));
		WebElement dbtTgt = drv.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		a.dragAndDrop(bnkAmt, dbtTgt).perform();		
		
		WebElement crtSrc = drv.findElement(By.xpath("//a[text()=' SALES ']"));
		WebElement crtTgt = drv.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		a.dragAndDrop(crtSrc, crtTgt).perform();
		
		WebElement crtAmt = drv.findElement(By.xpath("//a[text()=' 5000']"));
		WebElement tgtAmt = drv.findElement(By.xpath("//li[@class='placeholder']"));
		a.dragAndDrop(crtAmt, tgtAmt).perform();
	}

}
