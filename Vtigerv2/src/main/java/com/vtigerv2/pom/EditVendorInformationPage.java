package com.vtigerv2.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditVendorInformationPage {
	
	@FindBy(id="email")
	private WebElement emailtbx;
	
	@FindBy(xpath="(//input[@value='  Save  '])[2]")
	private WebElement savebtn;
	
	public WebElement getSavebtn() {
		return savebtn;
	}

	public EditVendorInformationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getEmailtbx() {
		return emailtbx;
	}
	
	

}
