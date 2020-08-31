package com.vtigerv2.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	

	@FindBy(xpath="(//img[@border='0'])[3]")
	private WebElement adminstratorimg;

	public WebElement getHomebtn() {
		return homebtn;
	}

	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement AccountsDropdown;

	
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

	public WebElement getAdminstratorimg() {
		return adminstratorimg;}



	public WebElement getMoredropdownlink() {
		return moredropdownlink;}

	@FindBy(xpath="//a[.='More']")
	private WebElement morelink;
	
	@FindBy(xpath="//img[@src='themes/softed/images/Home.PNG']")
	private WebElement homebtn;
	
	 public WebElement getMorelink() {
		return morelink;

	}

	@FindBy(xpath="//a[.='Contacts']")
	 private WebElement contactlink;
	
	 @FindBy(xpath="//a[.='Leads']")
	 private WebElement Leads;
	 
	 public WebElement getLeads() {
		return Leads;
	}

	@FindBy(xpath="//img[@title='Create Contact...']")
	 private WebElement createcontact;
	 
	 @FindBy(xpath="(//a[.='Opportunities'])[1]")
	 private WebElement createaoppurtunity;
	 
	public WebElement getCreateaoppurtunity() {
		return createaoppurtunity;
	}


	public WebElement getCreatecontact() {
		return createcontact;
	}


	public WebElement getContactlink() {
		return contactlink;
	}




	
	public WebElement getProductsBtn() {
		return ProductsBtn;
	}

	public WebElement getQuickCreateListbox() {
		return QuickCreateListbox;
	}

	

	public WebElement getSignout() {
		return signout;}

	
	public WebElement getInvoicelink() {
		return Invoicelink;
	}
	public WebElement getSalesorderlink() {
		return salesorderlink;
	}
	public WebElement getPurchaseorderlink() {
		return purchaseorderlink;
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
