package org.sam;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class AlertEx2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\Lenovo\\eclipse-workspace\\SeleniumActions\\drivers\\msedgedriver.exe");

		WebDriver drv = new EdgeDriver();

		drv.get("https://demo.automationtesting.in/Alerts.html");

		drv.manage().window().maximize();

		Thread.sleep(2000);

		WebElement altBtn = drv.findElement(By.xpath("//a[contains(text(),'OK & Cancel')]"));
		altBtn.click();
		
		WebElement altBtn1 = drv.findElement(By.xpath("//button[@class='btn btn-primary']"));
		altBtn1.click();
		
		Alert a = drv.switchTo().alert();

		Thread.sleep(3000);

		a.accept();
	}

}
