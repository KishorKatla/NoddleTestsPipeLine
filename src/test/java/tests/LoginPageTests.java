package tests;


import helper.BrowserFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;

public class LoginPageTests {

	WebDriver driver = BrowserFactory.startBrowser("Firefox", "https://www.noddle.co.uk");
	HomePage home_page=PageFactory.initElements(driver, HomePage.class);
	LoginPage login_page=PageFactory.initElements(driver, LoginPage.class);
	
		
	@Test(priority=3)
	public void loginPageTest(){
		home_page.navigateToLoginPage();
		Assert.assertEquals("Log in - Noddle | Free For Life Credit Report And Credit Score", driver.getTitle(), "Strings are NOT matching");
	}
	
	@Test(priority=4)
	public void userLoginTest(){
		login_page.login_Noddle("UserHarika", "Kritika2009");
		Assert.assertEquals("Home - Noddle | Free For Life Credit Report And Credit Score", driver.getTitle(), "Strings are NOT matching");
	}
	
	@AfterClass
	public void tearDown(){
		 driver.quit();
		 System.out.println("Thanks for Testing Noddle User Login");
	}
	

	
}
