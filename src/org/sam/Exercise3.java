package org.sam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Exercise3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\eclipse-workspace\\SeleniumActions\\drivers\\chromedriver.exe");
		
		WebDriver drv = new ChromeDriver();
		
		drv.get("https://www.flipkart.com/");
		
		drv.manage().window().maximize();
		
		Actions a = new Actions(drv);
		
		WebElement home = drv.findElement(By.xpath("(//div[@class='_2GaeWJ'])[5]"));
		a.moveToElement(home).perform();
		
		Thread.sleep(3000);
		
		WebElement bath = drv.findElement(By.xpath("//a[text()='Bath linen']"));
		bath.click();
		
		WebElement prd = drv.findElement(By.xpath("(//a[contains(text(),'280 GSM')])[1]"));
		String txt = prd.getText();
		System.out.println(txt);
	}

}
