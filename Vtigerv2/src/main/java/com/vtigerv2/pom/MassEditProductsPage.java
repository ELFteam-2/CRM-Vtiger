package com.vtigerv2.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MassEditProductsPage 
{
	@FindBy(xpath="//input[@name='website']")
	private WebElement WebsiteTxtbox;
	
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement SaveBtn;
	
	@FindBy(xpath="//input[@title='Cancel [Alt+X]']")
	private WebElement CancelBtn;

	public WebElement getCancelBtn() {
		return CancelBtn;
	}

	public WebElement getWebsiteTxtbox() {
		return WebsiteTxtbox;
	}

	public WebElement getSaveBtn() {
		return SaveBtn;
	}
	public MassEditProductsPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);	
	}
}
