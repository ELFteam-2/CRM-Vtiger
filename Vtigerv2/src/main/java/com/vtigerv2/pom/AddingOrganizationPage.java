package com.vtigerv2.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddingOrganizationPage 
{
	@FindBy(xpath="//a[contains(text(),'Tyss3')]")
	private WebElement OrgSelect;
	
	public AddingOrganizationPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);	
	}

	public WebElement getOrgSelect() {
		return OrgSelect;
	}
	
	
}
