package com.vtigerv2.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewInvoicePage {
	@FindBy(xpath="//input[@name='subject']")
	private WebElement subjecttextbox;
	@FindBy(xpath="(//img[@title='Select'])[3]")
	private WebElement orgnisationname;
	@FindBy(xpath="//input[@type='submit']")
	private WebElement savebtn;
	@FindBy(xpath="//textarea[@name='bill_street']")
	private WebElement BillingAddresstxtbox;
	@FindBy(xpath="//textarea[@name='ship_street']")
	private WebElement ShippingAddresstxtbox;
	@FindBy(id="searchIcon1")
	private WebElement productsicon;
	@FindBy(id="qty1")
	private WebElement qty;
	@FindBy(id="qty2")
	private WebElement qty2;
	@FindBy(xpath="//input[@value='Add Service']")
	private WebElement addservicesbtn;
	@FindBy(xpath="//img[@title='Services']")
	private WebElement servicesicon;
	@FindBy(xpath="(//img[@border='0'])[24]")
	private WebElement arrowicon;
	@FindBy(xpath="//img[@src='themes/images/delete.gif']")
	private WebElement deleteicon;
	
	public 	CreateNewInvoicePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getQty2() {
		return qty2;
	}
	public WebElement getAddservicesbtn() {
		return addservicesbtn;
	}
	public WebElement getServicesicon() {
		return servicesicon;
	}
	public WebElement getArrowicon() {
		return arrowicon;
	}
	public WebElement getSubjecttextbox() {
		return subjecttextbox;
	}
	public WebElement getOrgnisationname() {
		return orgnisationname;
	}
	
	public WebElement getSavebtn() {
		return savebtn;
	}
	public WebElement getBillingAddresstxtbox() {
		return BillingAddresstxtbox;
	}
	public WebElement getShippingAddresstxtbox() {
		return ShippingAddresstxtbox;
	}
	public WebElement getProductsicon() {
		return productsicon;
	}
	
	public WebElement getQty() {
		return qty;
	}

	public WebElement getDeleteicon() {
		return deleteicon;
	}
	
	
}
