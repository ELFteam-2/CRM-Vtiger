package com.vtigerv2.generics;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.vtigerv2.generics.FileLib;
import com.vtigerv2.pom.HomePage;
import com.vtigerv2.pom.LoginPage;


public class BaseClass {
	static {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/driver/chromedriver.exe");
		
	}
	public static WebDriver driver;
	public FileLib  f=new FileLib();
	
	@BeforeTest
	public void openBrowser() throws IOException {
	Reporter.log("Opening Browser", true);
	String browser = f.getPropertyData("browser");
	if(browser.equals("chrome"))
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	else if(browser.equals("firefox"))
	{
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	}
	
	@AfterTest
	public void closeBrowser() throws InterruptedException {
		Reporter.log("Closing Browser", true);
		Thread.sleep(2000);
		driver.close();
	}
	
	@BeforeMethod
	public void login() throws IOException, InterruptedException
	{
		Reporter.log("login", true);
		String url = f.getPropertyData("url");
		String usn = f.getPropertyData("usn");
		String pwd = f.getPropertyData("pwd");
		driver.get(url);
		LoginPage l= new LoginPage(driver);
		l.loggingin(usn, pwd);
	}
    
   @AfterMethod
    public void logout() throws InterruptedException {
    	HomePage h= new HomePage(driver);
    	Reporter.log("logout", true);
    	Actions a=new Actions(driver);
    	a.moveToElement(h.getAdminstratorimg()).perform();
        h.getSignout().click();
    }

    
}
