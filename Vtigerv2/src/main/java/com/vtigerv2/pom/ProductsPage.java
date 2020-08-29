package com.vtigerv2.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage 
{
	@FindBy(xpath="//img[@title='Create Product...']")
	private WebElement CreateNewProductbtn;
	
	@FindBy(xpath="//input[@name='selectall']")
	private WebElement SelectAllProductsChkbox;
	
	@FindBy(xpath="//input[2][@class='crmbutton small edit']")
	private WebElement MassEditBtn;
	
	@FindBy(xpath="//tr[5]/td/input[@id='7']")
	private WebElement SelectProductsChkbox;
	
	@FindBy(xpath="//input[@class='crmbutton small delete']")
	private WebElement DeleteBtn;
	
	@FindBy(xpath="//tr[4]/td[9]/a[contains(text(),'edit')]")
	private WebElement EditLink;
	
	@FindBy(xpath="//input[@class='txtBox']")
	private WebElement SearchTxtBox;
	
	@FindBy(xpath="//td[5]/div/select[@id='bas_searchfield']")
	private WebElement SearchInDropDown;
	
	@FindBy(xpath="//td[6]/input[@class='crmbutton small create']")
	private WebElement SearchNowBtn;
	
	@FindBy(xpath="//img[@title='Export Products']")
	private WebElement ExportProductsBtn;
	
	@FindBy(xpath="//img[@title='Find Duplicates']")
	private WebElement FindDuplicatesBtn1;
	
	@FindBy(xpath="//select[@id='availList']")
	private WebElement FindDuplicatesListBox;
	
	@FindBy(xpath="//input[1][@class='crmButton small']")
	private WebElement FindDuplicatesMoveBtn;
	
	@FindBy(xpath="//input[1][@class='crmbutton small edit']")
	private WebElement FindDuplicatesBtn2;
	
	@FindBy(xpath="//a[contains(text(),'Create Filter')]")
	private WebElement CreateFilterLink;
	
	public WebElement getCreateFilterLink() {
		return CreateFilterLink;
	}

	public WebElement getFindDuplicatesBtn1() {
		return FindDuplicatesBtn1;
	}

	public WebElement getFindDuplicatesListBox() {
		return FindDuplicatesListBox;
	}

	public WebElement getFindDuplicatesMoveBtn() {
		return FindDuplicatesMoveBtn;
	}

	public WebElement getFindDuplicatesBtn2() {
		return FindDuplicatesBtn2;
	}

	public WebElement getExportProductsBtn() {
		return ExportProductsBtn;
	}

	public WebElement getSearchTxtBox() {
		return SearchTxtBox;
	}

	public WebElement getSearchInDropDown() {
		return SearchInDropDown;
	}

	public WebElement getSearchNowBtn() {
		return SearchNowBtn;
	}

	public WebElement getEditLink() {
		return EditLink;
	}

	public WebElement getSelectProductsChkbox() {
		return SelectProductsChkbox;
	}

	public WebElement getDeleteBtn() {
		return DeleteBtn;
	}

	public WebElement getMassEditBtn() {
		return MassEditBtn;
	}

	public WebElement getSelectAllProductsChkbox() {
		return SelectAllProductsChkbox;
	}

	public ProductsPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);	
	}

	public WebElement getCreateNewProductbtn() {
		return CreateNewProductbtn;
	}
}
