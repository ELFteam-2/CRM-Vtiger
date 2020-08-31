package com.vtigerv2.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VendorMassEditPage {
	
	@FindBy(id="vendorname_mass_edit_check")
	private WebElement Vendornamecheckbox;
	
	@FindBy(name="vendorname")
	private WebElement vendornametbx;
	
	@FindBy(xpath="//input[@value='  Save  ']")
	private WebElement savebtn;
	
	public VendorMassEditPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getVendornamecheckbox() {
		return Vendornamecheckbox;
	}

	public WebElement getVendornametbx() {
		return vendornametbx;
	}

	public WebElement getSavebtn() {
		return savebtn;
	}
	
	

}
