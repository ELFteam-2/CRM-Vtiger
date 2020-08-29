package com.vtigerv2.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddingVendorPage 
{
	@FindBy(xpath="//tbody/tr[2]/td/div/table/tbody/tr[2]/td/a[@id='1']")
	private WebElement VendorsNames;
	
	public AddingVendorPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);	
	}

	public WebElement getVendorsNames() {
		return VendorsNames;
	}
}
