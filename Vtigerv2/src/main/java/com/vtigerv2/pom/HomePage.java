package com.vtigerv2.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	@FindBy(xpath="(//img[@border='0'])[3]")
	private WebElement adminstratorimg;
	
	@FindBy(xpath="//a[text()='Sign Out']")
	private WebElement signout;
	
	@FindBy(xpath="//a[text()='More']")
	private WebElement Morelink;
	
	@FindBy(xpath="//a[@name='Invoice']")
	private WebElement Invoicelink;

	@FindBy(xpath="//a[@name='Sales Order']")
	private WebElement salesorderlink;
	
	@FindBy(xpath="//a[@name='Purchase Order']")
	private WebElement purchaseorderlink;

	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public WebElement getAdminstratorimg() {
		return adminstratorimg;
	}
	public WebElement getSignout() {
		return signout;
	}
	public WebElement getMorelink() {
		return Morelink;
	}
	public WebElement getInvoicelink() {
		return Invoicelink;
	}
	public WebElement getSalesorderlink() {
		return salesorderlink;
	}
	public WebElement getPurchaseorderlink() {
		return purchaseorderlink;
	}
	

}
