package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	
	WebDriver driver;
	public LoginPage(WebDriver driver){
		this.driver=driver;
	}
	
	@FindBy(id="Username")
	@CacheLookup
	WebElement username;

	@FindBy(id="Password")
	@CacheLookup
	WebElement password;
	
	//Submit Login
	@FindBy(how=How.CSS,using="input[value='Log in']")
	@CacheLookup
	WebElement login;	
	
	@FindBy(how=How.LINK_TEXT,using="Log out")
	@CacheLookup
	WebElement logout;	
	
	//View my full report
	@FindBy(how=How.LINK_TEXT,using="View my full report")
	@CacheLookup
	WebElement viewreport;
	
	public void login_Noddle(String uname,String pwd){
		username.sendKeys(uname);
		password.sendKeys(pwd);
		login.click();
	}
	public void logout_Noddle(){
		logout.click();
	}
	public void creditReport(){
		viewreport.click();
	}
}
