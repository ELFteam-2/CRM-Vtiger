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
	

	@FindBy(xpath="(//td/a[@href='javascript:;'])[1]")
	private WebElement moredropdownlink;
	
	@FindBy(xpath="//a[@name='Campaigns']")
	private WebElement CampaignsLink;
	
	@FindBy(xpath="//a[@name='Vendors']")
	private WebElement VendorsLink;
	
	@FindBy(xpath="//a[.='Recycle Bin']")
	private WebElement RecycleBinLink;
	
	@FindBy(xpath="//input[@value='  Save']")
	private WebElement savetbtn;
	
	@FindBy(xpath="//input[@name='vendorname']")
	private WebElement vendortbx;
	
	@FindBy(xpath="//select[@id='qccombo']")
	private WebElement quickdropdown;
	
	@FindBy(xpath="//input[@name='campaignname']")
	private WebElement Campaigntbx;
	
	@FindBy(xpath="//input[@name='accountname']")
	private WebElement Organizationtbx;
	
	@FindBy(xpath="(//input[@value='  Save  '])[1]")
	private WebElement savetbn2;
	
	@FindBy(xpath="//textarea[@name='ticket_title']")
	private WebElement tickettbx;
	
	@FindBy(xpath="(//input[@name='productname'])[1]")
	private WebElement producttbx;
	
	@FindBy(xpath="(//input[@name='notes_title'])[1]")
	private WebElement doctitletbx;
	
	@FindBy(xpath="//input[@name='bookname']")
	private WebElement pricebooktbx;
	

	public WebElement getOrganizationtbx() {
		return Organizationtbx;
	}


	public WebElement getSavetbn2() {
		return savetbn2;
	}


	public WebElement getTickettbx() {
		return tickettbx;
	}


	public WebElement getProducttbx() {
		return producttbx;
	}


	public WebElement getDoctitletbx() {
		return doctitletbx;
	}


	public WebElement getPricebooktbx() {
		return pricebooktbx;
	}


	public WebElement getCampaigntbx() {
		return Campaigntbx;
	}


	public WebElement getSavetbtn() {
		return savetbtn;
	}


	public WebElement getVendortbx() {
		return vendortbx;
	}


	public WebElement getQuickdropdown() {
		return quickdropdown;
	}


	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
		

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


	public WebElement getMoredropdownlink() {
		return moredropdownlink;
	}


	
	public WebElement getProductsBtn() {
		return ProductsBtn;
	}

	public WebElement getQuickCreateListbox() {
		return QuickCreateListbox;
	}

	public WebElement getAccountsDropdown() 
	{
		return AccountsDropdown;
	}
	public WebElement getSignoutBtn() 
	{
		return SignoutBtn;
	}

	
	public WebElement getVendorsLink() {
		return VendorsLink;
	}


	public WebElement getRecycleBinLink() {
		return RecycleBinLink;
	}


	public WebElement getCampaignsLink() {
		return CampaignsLink;
	}


	public WebElement getOrganizationBtn() {
		return OrganizationBtn;
	}

}
