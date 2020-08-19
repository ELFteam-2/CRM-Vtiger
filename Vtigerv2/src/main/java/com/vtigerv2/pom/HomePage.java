package com.vtigerv2.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement AccountsDropdown;
	
	@FindBy(xpath="//a[text()='Sign Out']")
	private WebElement SignoutBtn;
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}


	public WebElement getAccountsDropdown() {
		return AccountsDropdown;
	}

	public WebElement getSignoutBtn() {
		return SignoutBtn;
	}

}
