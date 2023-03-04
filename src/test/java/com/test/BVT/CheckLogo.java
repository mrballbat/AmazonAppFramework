package com.test.BVT;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.pages.LoginPage;

public class CheckLogo {
	@Test
	public static void checkLogo(WebDriver driver) {
		LoginPage.loginPageSelector(driver);
	}

}
