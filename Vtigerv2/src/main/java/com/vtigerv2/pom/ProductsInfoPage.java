package com.vtigerv2.pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsInfoPage 
{
	@FindBy(xpath="//input[@name='productname']")
	private WebElement ProductTxtbox;
	
	@FindBy(xpath="//img[@id='jscal_trigger_sales_end_date']")
	private WebElement SalesStartDateBtn;
	
	@FindBy(xpath="//div/div[1][@class='combo']")
	private WebElement MonthListBox;
	
	@FindBy(xpath="//tbody/tr[4]/td[7][@class='today day selected']")
	private WebElement SalesStartDate;
	
	@FindBy(xpath="//img[@id='jscal_trigger_sales_end_date']")
	private WebElement SalesEndDateBtn;
	
	@FindBy(xpath="//thead/tr[2]/td[4][@class='button nav']")
	private WebElement MonthArrowBtn;
	
	@FindBy(xpath="//table/tbody/tr/td[5][@class='day']")
	private WebElement SalesEndDate;
	
	@FindBy(xpath="//img[@title='Select']")
	private WebElement VendorSelectBtn;
	
	@FindBy(xpath="//td/span[contains(text(),'No Vendors Found !')]")
	private List<WebElement> NoVendorFound;
	
	@FindBy(xpath="//tr[3]/td[2]/input[@class='detailedViewTextBox']")
	private WebElement QuantityTxtBox;
	
	public WebElement getQuantityTxtBox() {
		return QuantityTxtBox;
	}

	public List<WebElement> getNoVendorFound() {
		return NoVendorFound;
	}

	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement SaveBtn;
	
	@FindBy(xpath="//input[@title='Cancel [Alt+X]']")
	private WebElement Cancelbtn;
	
	public WebElement getCancelbtn() {
		return Cancelbtn;
	}

	public ProductsInfoPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);	
	}

	public WebElement getProductTxtbox() {
		return ProductTxtbox;
	}

	public WebElement getSalesStartDateBtn() {
		return SalesStartDateBtn;
	}

	public WebElement getMonthListBox() {
		return MonthListBox;
	}

	public WebElement getSalesStartDate() {
		return SalesStartDate;
	}

	public WebElement getSalesEndDateBtn() {
		return SalesEndDateBtn;
	}

	public WebElement getMonthArrowBtn() {
		return MonthArrowBtn;
	}

	public WebElement getSalesEndDate() {
		return SalesEndDate;
	}

	public WebElement getVendorSelectBtn() {
		return VendorSelectBtn;
	}

	public WebElement getSaveBtn() {
		return SaveBtn;
	}
}
