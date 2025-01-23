package org.sam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Exercise6 {
	public static void main(String[] args) {
System.setProperty("webdriver.edge.driver", "C:\\Users\\Lenovo\\eclipse-workspace\\SeleniumActions\\drivers\\msedgedriver.exe");
		
		WebDriver drv = new EdgeDriver();
		
		drv.get("https://lh.inmakesedu.com/home");
		
		drv.manage().window().maximize();
		
		Actions a = new Actions(drv);
			
		WebElement courses = drv.findElement(By.id("navbarDropdown"));
		a.moveToElement(courses).perform();
		
		WebElement swTst = drv.findElement(By.xpath("(//button[@type='button'])[11]"));
		a.moveToElement(swTst).perform();
		
		WebElement stMas = drv.findElement(By.xpath("//a[text()='ST Advanced class']"));
		stMas.click();
		
	}

}
