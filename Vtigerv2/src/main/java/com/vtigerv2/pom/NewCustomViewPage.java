package com.vtigerv2.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewCustomViewPage {
	@FindBy(xpath="//input[@name='viewName']")
	private WebElement viewnametbx;
	
	@FindBy(xpath="//input[@name='setDefault']")
	private WebElement setasdefaultcheckbox;
	
	@FindBy(xpath="//input[@name='button2']")
	private WebElement Savebtn2;
	
	public WebElement getSavebtn2() {
		return Savebtn2;
	}

	public NewCustomViewPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getViewnametbx() {
		return viewnametbx;
	}

	public WebElement getSetasdefaultcheckbox() {
		return setasdefaultcheckbox;
	}
	
}
