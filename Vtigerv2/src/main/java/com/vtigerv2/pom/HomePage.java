package com.vtigerv2.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement AccountsDropdown;
	
	@FindBy(xpath="//a[text()='Sign Out']")
	private WebElement SignoutBtn;
	
	@FindBy(xpath="//td[6]/a[contains(text(),'Organizations')]")
	private WebElement OrganizationBtn;
	
	@FindBy(xpath="//select[@id='qccombo']")
	private WebElement QuickCreateListbox;
	
	@FindBy(xpath="//td[12]/a[contains(text(),'Products')]")
	private WebElement ProductsBtn;
	
	@FindBy(xpath="//td[22]/a[contains(text(),'More')]")
	private WebElement MoreDropDown;
	
	@FindBy(xpath="//a[@name='Quotes']")
	private WebElement QuoteLink;
	
	public WebElement getQuoteLink() {
		return QuoteLink;
	}

	public WebElement getMoreDropDown() {
		return MoreDropDown;
	}

	public WebElement getProductsBtn() {
		return ProductsBtn;
	}

	public WebElement getQuickCreateListbox() {
		return QuickCreateListbox;
	}

	public HomePage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);	
	}

	public WebElement getAccountsDropdown() 
	{
		return AccountsDropdown;
	}
	public WebElement getSignoutBtn() 
	{
		return SignoutBtn;
	}
	public WebElement getOrganizationBtn() {
		return OrganizationBtn;
	}

}
