package org.sam;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RobotEx3 {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Lenovo\\eclipse-workspace\\SeleniumActions\\drivers\\chromedriver.exe");

		WebDriver drv = new ChromeDriver();

		drv.get("https://www.amazon.in/");

		drv.manage().window().maximize();

		Actions a = new Actions(drv);

		Robot r = new Robot();
		
		Thread.sleep(2000);
		
		WebElement login = drv.findElement(By.id("nav-link-accountList-nav-line-1"));
		login.click();
		
		WebElement email = drv.findElement(By.id("ap_email"));
		email.sendKeys("revananth97@gmail.com");
		
		a.doubleClick(email).click(email).perform();
		
		a.contextClick(email).perform();
		
		for (int i = 0; i < 2; i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);			
		}
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);	
		
	}

}
