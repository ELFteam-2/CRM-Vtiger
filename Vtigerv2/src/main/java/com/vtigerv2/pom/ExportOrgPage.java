package com.vtigerv2.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExportOrgPage 
{
	@FindBy(xpath="//input[@title='Export']")
	private WebElement ExportBtn1;
	
	@FindBy(xpath="//input[@title='Cancel [Alt+X]']")
	private WebElement CancelBtn1;
	
	@FindBy(xpath="//input[@class='crmbutton small create']")
	private WebElement ExportOrganizationsBtn;
	
	@FindBy(xpath="//input[@name='Cancel']")
	private WebElement CancelOrgBtn;
	
	@FindBy(xpath="//input[@name='Export']")
	private WebElement ExportProductsBtn;
	
	@FindBy(xpath="//input[@name='Cancel']")
	private WebElement CancelProductBtn;
	

	public WebElement getExportProductsBtn() {
		return ExportProductsBtn;
	}

	public WebElement getCancelProductBtn() {
		return CancelProductBtn;
	}

	public WebElement getCancelOrgBtn() {
		return CancelOrgBtn;
	}

	public WebElement getExportOrganizationsBtn() {
		return ExportOrganizationsBtn;
	}

	public WebElement getExportBtn1() {
		return ExportBtn1;
	}

	public WebElement getCancelBtn1() {
		return CancelBtn1;
	}
	
	public ExportOrgPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);	
	}
}
