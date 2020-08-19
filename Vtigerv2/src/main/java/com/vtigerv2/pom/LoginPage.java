package com.vtigerv2.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(xpath="//input[@name='user_name']")
	private WebElement UsernameTbx;
	
	@FindBy(xpath="//input[@name='user_password']")
	private WebElement PasswordTbx;
	
	@FindBy(id="submitButton")
	private WebElement Loginbtn;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void loggingin(String usn, String pwd) throws InterruptedException {
		UsernameTbx.sendKeys(usn);
		PasswordTbx.sendKeys(pwd);
		Loginbtn.click();
		Thread.sleep(2000);
		
	}

}
