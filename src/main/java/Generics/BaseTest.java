package Generics;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;


import Pages.ActiTimeLogin;

public class BaseTest implements AutoConstant
{
	public WebDriver driver;
	@BeforeClass
	public void openBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);;
	}
	
	
	//@BeforeMethod
	//public void loginto() throws IOException
	//{
		//ActiTimeLogin login = new ActiTimeLogin(driver);
		//login.loginmethod();
	//}
	@AfterClass
	public void closeBrowser()
	{
		//driver.close();
	}

}
