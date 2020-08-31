package com.vtigerv2.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatingNewVendorPage {
	
	@FindBy(xpath="//input[@name='vendorname']")
	private WebElement vendornamrtbx;
	
	@FindBy(xpath="(//input[@value='  Save  '])[2]")
	private WebElement savetbn;

	
	@FindBy(xpath="//input[@value='  Cancel  ']")
	private WebElement cancelbtn; 
	
	public CreatingNewVendorPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getVendornamrtbx() {
		return vendornamrtbx;
	}

	public WebElement getSavetbn() {
		return savetbn;
	}

	public WebElement getCancelbtn() {
		return cancelbtn;
	}
	
	



}
