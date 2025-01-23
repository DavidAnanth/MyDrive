package org.sam;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RobotEx5 {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Lenovo\\eclipse-workspace\\SeleniumActions\\drivers\\chromedriver.exe");

		WebDriver drv = new ChromeDriver();

		drv.get("https://www.flipkart.com/");

		drv.manage().window().maximize();
		
		Thread.sleep(2000);

		Actions a = new Actions(drv);

		Robot r = new Robot();
		
		WebElement clsAd = drv.findElement(By.xpath("(//div[@class='zlQd20 _1eDlvI'])[1]"));
		a.contextClick(clsAd).perform();
		
		for (int i = 0; i < 5; i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);			
		}
		
		Thread.sleep(2000);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
	}

}
