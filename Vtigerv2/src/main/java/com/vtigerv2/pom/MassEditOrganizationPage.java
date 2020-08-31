package com.vtigerv2.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MassEditOrganizationPage 
{
	@FindBy(xpath="//input[@id='email1']")
	private WebElement EmailIdTxtbox;
	
	@FindBy(xpath="//input[@class='crmbutton small save']")
	private WebElement SaveBtn;
	
	
	@FindBy(xpath="//input[@name='annual_revenue']")
	private WebElement AnualIncomeTxtbox;


	public WebElement getEmailIdTxtbox() {
		return EmailIdTxtbox;
	}


	public WebElement getSaveBtn() {
		return SaveBtn;
	}


	public WebElement getAnualIncomeTxtbox() {
		return AnualIncomeTxtbox;
	}
	
	public MassEditOrganizationPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);	
	}
}
