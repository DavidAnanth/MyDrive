package org.sam;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RobotEx2 {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Lenovo\\eclipse-workspace\\SeleniumActions\\drivers\\chromedriver.exe");

		WebDriver drv = new ChromeDriver();

		drv.get("https://www.google.co.in/");

		drv.manage().window().maximize();

		Actions a = new Actions(drv);

		Robot r = new Robot();
		
		WebElement txt = drv.findElement(By.id("APjFqb"));
		txt.sendKeys("Inmakes Infotech");
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement link1 = drv.findElement(By.xpath("(//h3[text()='Inmakes Infotech Pvt.Ltd.'])[1]"));
		link1.click();
		
	}

}
