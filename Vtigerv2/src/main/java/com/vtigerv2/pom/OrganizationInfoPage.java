package com.vtigerv2.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationInfoPage 
{
	@FindBy(xpath="//input[@name='accountname']")
	private WebElement OrgNameTxtbx;

	@FindBy(xpath="//textarea[@name='bill_street']")
	private WebElement BillingAddtxtbx;
	
	@FindBy(xpath="//input[@onclick='return copyAddressRight(EditView)']")
	private WebElement CopyAddressCheckbox;
	
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement Savebtn;
	
	@FindBy(xpath="//input[@title='Cancel [Alt+X]']")
	private WebElement Cancelbtn;
	
	public WebElement getCancelbtn() {
		return Cancelbtn;
	}
	public WebElement getBillingAddtxtbx() {
		return BillingAddtxtbx;
	}
	public WebElement getCopyAddressCheckbox() {
		return CopyAddressCheckbox;
	}
	public WebElement getSavebtn() {
		return Savebtn;
	}

	public WebElement getOrgNameTxtbx() {
		return OrgNameTxtbx;
	}

	public OrganizationInfoPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);	
	}
}
