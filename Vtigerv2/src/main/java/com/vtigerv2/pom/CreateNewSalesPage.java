package com.vtigerv2.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewSalesPage {
	@FindBy(xpath="//input[@name='subject']")
	private WebElement subjecttxtbox;
	@FindBy(xpath="//textarea[@name='bill_street']")
	private WebElement billingaddresstxtbox;
	@FindBy(xpath="//textarea[@name='ship_street']")
	private WebElement shippingaddresstxtbox;
	@FindBy(xpath="//img[@title='Products']")
	private WebElement productsicon;
	@FindBy(id="qty1")
	private WebElement qty1;
	@FindBy(xpath="//input[@value='  Save  ']")
	private WebElement savebtn;
	@FindBy(xpath="(//img[@title='Select'])[4]")
	private WebElement organizationbtn;
	@FindBy(xpath="//input[@value='Add Service']")
	private WebElement addservicesbtn;
	@FindBy(xpath="//img[@id='searchIcon2']")
	private WebElement servicesicon;
	@FindBy(xpath="//img[@src='themes/images/up_layout.gif']")
	private WebElement arrowicon;
	@FindBy(xpath="//input[@id='qty2']")
	private WebElement qty2;
	@FindBy(xpath="//img[@src='themes/images/delete.gif']")
	private WebElement deleteicon;
	
	public WebElement getDeleteicon() {
		return deleteicon;
	}

	public WebElement getServicesicon() {
		return servicesicon;
	}

	public WebElement getArrowicon() {
		return arrowicon;
	}

	public WebElement getQty2() {
		return qty2;
	}

	public WebElement getAddservicesbtn() {
		return addservicesbtn;
	}

	public WebElement getOrganizationbtn() {
		return organizationbtn;
	}

	public 	CreateNewSalesPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getSubjecttxtbox() {
		return subjecttxtbox;
	}

	public WebElement getBillingaddresstxtbox() {
		return billingaddresstxtbox;
	}

	public WebElement getShippingaddresstxtbox() {
		return shippingaddresstxtbox;
	}

	public WebElement getProductsicon() {
		return productsicon;
	}

	public WebElement getQty1() {
		return qty1;
	}

	public WebElement getSavebtn() {
		return savebtn;
	}

	
}
