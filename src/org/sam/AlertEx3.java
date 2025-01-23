package org.sam;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class AlertEx3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\Lenovo\\eclipse-workspace\\SeleniumActions\\drivers\\msedgedriver.exe");

		WebDriver drv = new EdgeDriver();

		drv.get("https://demo.automationtesting.in/Alerts.html");

		drv.manage().window().maximize();

		Thread.sleep(2000);

		WebElement altBtn = drv.findElement(By.xpath("//a[text()='Alert with Textbox ']"));
		altBtn.click();
		
		WebElement altBtn1 = drv.findElement(By.xpath("//button[@class='btn btn-info']"));
		altBtn1.click();
		
		Alert a = drv.switchTo().alert();

		Thread.sleep(3000);
		
		String txt = a.getText();
		System.out.println(txt);
		
		a.sendKeys("David");

		a.accept();
	}

}
