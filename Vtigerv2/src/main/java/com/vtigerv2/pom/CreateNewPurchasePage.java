package com.vtigerv2.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewPurchasePage {
	@FindBy(xpath="//input[@name='subject']")
	private WebElement subjecttextbox;
	@FindBy(xpath="(//img[@src='themes/softed/images/select.gif'])[1]")
	private WebElement addvendoricon;
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
	@FindBy(xpath="//a[text()='abcdefgh']")
	private WebElement selectvendor;
	@FindBy(xpath="//a[@id='popup_product_36']")
	private WebElement selectproduct;
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
	
	public 	CreateNewPurchasePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getSubjecttextbox() {
		return subjecttextbox;
	}
	public WebElement getAddvendoricon() {
		return addvendoricon;
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

	public WebElement getSelectvendor() {
		return selectvendor;
	}

	public WebElement getSelectproduct() {
		return selectproduct;
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

	public WebElement getQty2() {
		return qty2;
	}

	public WebElement getDeleteicon() {
		return deleteicon;
	}
	
	
	
	
}
