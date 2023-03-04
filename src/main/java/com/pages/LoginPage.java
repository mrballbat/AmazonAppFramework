package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	public static void loginPageSelector(WebDriver driver) {
		WebElement logo= driver.findElement(By.xpath("//a[@id='nav-logo-sprites']"));
	}
	
	

}
