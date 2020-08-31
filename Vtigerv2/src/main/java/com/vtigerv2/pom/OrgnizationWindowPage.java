package com.vtigerv2.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrgnizationWindowPage {
	@FindBy(xpath="//a[text()='Adidas']")
	private WebElement SelectOrganizations;
	public 	OrgnizationWindowPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public WebElement getSelectOrganizations() {
		return SelectOrganizations;
	}
	
	
}
