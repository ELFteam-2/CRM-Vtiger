package com.vtigerv2.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	public WebElement getHomebtn() {
		return homebtn;
	}

	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement AccountsDropdown;
	
	@FindBy(xpath="//a[text()='Sign Out']")
	private WebElement SignoutBtn;
	
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
	 
		public HomePage(WebDriver driver) {
			PageFactory.initElements(driver, this);
			
		}


	 
	public WebElement getCreateaoppurtunity() {
		return createaoppurtunity;
	}


	public WebElement getCreatecontact() {
		return createcontact;
	}


	public WebElement getContactlink() {
		return contactlink;
	}




	public WebElement getAccountsDropdown() {
		return AccountsDropdown;
	}

	public WebElement getSignoutBtn() {
		return SignoutBtn;
	}



	
}
