package com.vtigerv2.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QuotesInfoPage 
{
	@FindBy(xpath="//input[@name='subject']")
	private WebElement SubjectTxtBox;
	
	@FindBy(xpath="//textarea[@name='bill_street']")
	private WebElement BillingAddTxtBox;
	
	@FindBy(xpath="//td[3]/input[@name='cpy']")
	private WebElement CopyBillingAddRadioBtn;
	
	@FindBy(xpath="//tr[7]/td[4]/img[@title='Select']")
	private WebElement OrganizationSelectBtn;
	
	@FindBy(xpath="//img[@id='searchIcon1']")
	private WebElement ProductSelectBtn;
	
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement SaveBtn;
	
	@FindBy(xpath="//input[@title='Cancel [Alt+X]']")
	private WebElement Cancelbtn;
	
	public WebElement getCancelbtn() {
		return Cancelbtn;
	}


	@FindBy(xpath="//input[@id='qty1']")
	private WebElement QtyTxtBox;
	
	@FindBy(xpath="//input[@id='listPrice1']")
	private WebElement PriceTxtBox;
	
	@FindBy(xpath="//a[contains(text(),'Export To PDF')]")
	private WebElement ExportToPdfLink;

	
	
	public WebElement getExportToPdfLink() {
		return ExportToPdfLink;
	}


	public WebElement getQtyTxtBox() {
		return QtyTxtBox;
	}


	public WebElement getPriceTxtBox() {
		return PriceTxtBox;
	}


	public WebElement getSaveBtn() {
		return SaveBtn;
	}


	public WebElement getOrganizationSelectBtn() {
		return OrganizationSelectBtn;
	}


	public WebElement getProductSelectBtn() {
		return ProductSelectBtn;
	}


	public WebElement getSubjectTxtBox() {
		return SubjectTxtBox;
	}


	public WebElement getBillingAddTxtBox() {
		return BillingAddTxtBox;
	}


	public WebElement getCopyBillingAddRadioBtn() {
		return CopyBillingAddRadioBtn;
	}


	public QuotesInfoPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);	
	}

}
