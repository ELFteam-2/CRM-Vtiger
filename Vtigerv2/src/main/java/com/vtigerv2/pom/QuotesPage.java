package com.vtigerv2.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QuotesPage 
{
	@FindBy(xpath="//img[@title='Create Quote...']")
	private WebElement CreateQuoteBtn;
	
	@FindBy(xpath="//tr[4]/td[9]/a[contains(text(),'edit')]")
	private WebElement EditQuoteLink;
	
	@FindBy(xpath="//td/input[@id='12']")
	private WebElement SelectChkBoxToDelete;
	
	public WebElement getSelectChkBoxToDelete() {
		return SelectChkBoxToDelete;
	}

	@FindBy(xpath="//tr[5]/td[9]/a[contains(text(),'del')]")
	private WebElement DeleteQuoteLink;
	
	@FindBy(xpath="//input[@name='selectall']")
	private WebElement SelectAllChkBox;
	
	@FindBy(xpath="//input[2][@class='crmbutton small edit']")
	private WebElement MassEditBtn;
	
	@FindBy(xpath="//td[3]/input[@class='txtBox']")
	private WebElement SearchTxtBox;
	
	@FindBy(xpath="//input[@class='crmbutton small delete']")
	private WebElement DeleteBtn;
	
	@FindBy(xpath="//img[@title='Export Products']")
	private WebElement ExportBtn;
	
	@FindBy(xpath="//a[contains(text(),'Create Filter')]")
	private WebElement CreateFilterLink;
	
	@FindBy(xpath="//img[@title='Chat...']")
	private WebElement ChatBtn;
	
	public WebElement getChatBtn() {
		return ChatBtn;
	}

	public WebElement getExportBtn() {
		return ExportBtn;
	}

	public WebElement getCreateFilterLink() {
		return CreateFilterLink;
	}

	public WebElement getDeleteBtn() {
		return DeleteBtn;
	}

	@FindBy(xpath="//td[5]/div/select[@id='bas_searchfield']")
	private WebElement SearchInListBox;
	
	@FindBy(xpath="//td[6]/input[@class='crmbutton small create']")
	private WebElement SearchNowBtn;
	
	@FindBy(xpath="//td[3]/a[contains(text(),'sales123')]")
	private WebElement ExportQuotesSalesLink;
	
	public WebElement getExportQuotesSalesLink() {
		return ExportQuotesSalesLink;
	}

	public WebElement getSelectAllChkBox() {
		return SelectAllChkBox;
	}

	public WebElement getMassEditBtn() {
		return MassEditBtn;
	}

	public WebElement getSearchTxtBox() {
		return SearchTxtBox;
	}

	public WebElement getSearchInListBox() {
		return SearchInListBox;
	}

	public WebElement getSearchNowBtn() {
		return SearchNowBtn;
	}

	public WebElement getEditQuoteLink() {
		return EditQuoteLink;
	}

	public WebElement getDeleteQuoteLink() {
		return DeleteQuoteLink;
	}

	public WebElement getCreateQuoteBtn() {
		return CreateQuoteBtn;
	}

	public QuotesPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);	
	}

}
