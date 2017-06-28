package helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;

public class BrowserFactory {
	static WebDriver driver;
	
	public static WebDriver startBrowser(String browserName,String url){
		
		if(browserName.equalsIgnoreCase("Opera")){
			System.setProperty("webdriver.opera.driver", "operadriver.exe");
			driver=new OperaDriver();
			}
		else if(browserName.equalsIgnoreCase("Chrome")){
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			driver=new ChromeDriver();
			}
		else if(browserName.equalsIgnoreCase("IE")){
			System.setProperty("webdriver.ie.driver", "IEDriverServer.exe");
			driver=new InternetExplorerDriver();
			}
		else if(browserName.equalsIgnoreCase("Firefox")){
			System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
			driver=new FirefoxDriver();
			}
		driver.manage().window().maximize();
		driver.navigate().to(url);
		
		return driver;
		}
	

}
