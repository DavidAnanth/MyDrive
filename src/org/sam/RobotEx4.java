package org.sam;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RobotEx4 {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Lenovo\\eclipse-workspace\\SeleniumActions\\drivers\\chromedriver.exe");

		WebDriver drv = new ChromeDriver();

		drv.get("https://www.snapdeal.com/");

		drv.manage().window().maximize();
		
		Thread.sleep(2000);

		Actions a = new Actions(drv);

		Robot r = new Robot();

		WebElement item = drv.findElement(
				By.xpath("(//div[text()='Shiv Trishul Damru Gold-plated Locket with Rudraksha Mala'])[1]"));
		a.contextClick(item).perform();
		
		for (int i = 0; i < 2; i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);			
		}
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);	
	}

}
