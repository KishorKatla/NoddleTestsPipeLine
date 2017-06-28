package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {
	
	@FindBy(how=How.LINK_TEXT,using="Log in")
	WebElement login;
	
	//About Noddle
	@FindBy(how=How.LINK_TEXT,using="About Noddle")
	WebElement aboutNoddle;
	
	//Sign Up
	@FindBy(how=How.LINK_TEXT,using="Get your free credit score<")
	WebElement signUp;
	
	//FAQs
	@FindBy(how=How.LINK_TEXT,using="FAQs")
	WebElement faqs;
	
	public void navigateToLoginPage(){
		login.click();
	}
	
	
}
