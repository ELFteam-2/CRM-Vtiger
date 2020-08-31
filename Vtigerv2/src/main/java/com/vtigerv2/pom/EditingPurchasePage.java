package com.vtigerv2.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditingPurchasePage {
	@FindBy(xpath="//input[@name='subject']")
	private WebElement subjecttextbox;
	@FindBy(xpath="//input[@value='  Save  ']")
	private WebElement savebtn;
	public 	EditingPurchasePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public WebElement getSubjecttextbox() {
		return subjecttextbox;
	}
	public WebElement getSavebtn() {
		return savebtn;
	}
	
}
