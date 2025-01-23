package org.sam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Exercise2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\Lenovo\\eclipse-workspace\\SeleniumActions\\drivers\\msedgedriver.exe");

		WebDriver drv = new EdgeDriver();

		drv.get("https://www.amazon.in/");

		drv.manage().window().maximize();

		Actions a = new Actions(drv);

		WebElement prime = drv.findElement(By.id("nav-link-amazonprime"));
		a.moveToElement(prime).perform();

		Thread.sleep(3000);

		WebElement clk = drv.findElement(By.xpath(
				"//img[@src='https://m.media-amazon.com/images/G/31/prime/NavFlyout/TryPrime/2018/Apr/IN-Prime-PIN-TryPrime-MultiBen-Apr18-400x400._CB612889281_.jpg']"));
		clk.click();

	}

}
