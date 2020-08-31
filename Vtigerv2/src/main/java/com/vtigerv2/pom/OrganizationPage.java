package com.vtigerv2.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationPage 
{
	@FindBy(xpath="//img[@title='Create Organization...']")
	private WebElement OrgNewBtn;
	
	public WebElement getOrgSelectAllChkbox() {
		return OrgSelectAllChkbox;
	}

	public WebElement getMassEditBtn() {
		return MassEditBtn;
	}

	@FindBy(xpath="//input[@id='13']")
	private WebElement OrgSelectCheckbox;
	
	@FindBy(xpath="//tr[3]/td[8]/a[contains(text(),'edit')]")
	private WebElement EditLink;
	
	@FindBy(xpath="//td[3]/a[contains(text(),'Tyss3')]")
	private WebElement DeleteLink;
	
	@FindBy(xpath="//input[@id='selectCurrentPageRec']")
	private WebElement OrgSelectAllChkbox;
	
	@FindBy(xpath="//input[2][@class='crmbutton small edit']")
	private WebElement MassEditBtn;
	
	@FindBy(xpath="//input[@class='txtBox']")
	private WebElement SearchTxtBox;
	
	@FindBy(xpath="//td[5]/div/select[@name='search_field']")
	private WebElement SearchOptionListBox;
	
	@FindBy(xpath="//td[6]/input[@class='crmbutton small create']")
	private WebElement SearchNowBtn;
	
	@FindBy(xpath="//a[contains(text(),'Create Filter')]")
	private WebElement CreateFilterLink;
	
	@FindBy(xpath="//input[4][@class='crmbutton small edit']")
	private WebElement MailerExportBtn;
	
	public WebElement getMailerExportBtn() {
		return MailerExportBtn;
	}

	@FindBy(xpath="//img[@title='Last Viewed']")
	private WebElement LastViewedBtn;
	
	@FindBy(xpath="//tr[2]/td[2]/a")
	private WebElement SelectLastViewed;
	
	@FindBy(xpath="//img[@title='Show World Clock...']")
	private WebElement ShowWorldClk;
	
	@FindBy(xpath="//select[@name='clockcity']")
	private WebElement ClkListBox;
	
	@FindBy(xpath="//input[@class='crmbutton small delete']")
	private WebElement DeleteBtn;
	
	@FindBy(xpath="//img[@title='Export Organizations']")
	private WebElement ExportOrganizationsBtn;
	
	@FindBy(xpath="//img[@title='Find Duplicates']")
	private WebElement FindDuplicatesBtn1;
	
	@FindBy(xpath="//select[@id='availList']")
	private WebElement FindDuplicatesListBox;
	
	@FindBy(xpath="//input[1][@class='crmButton small']")
	private WebElement FindDuplicatesMoveBtn;
	
	@FindBy(xpath="//input[1][@class='crmbutton small edit']")
	private WebElement FindDuplicatesBtn2;
	
	
	
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

	public WebElement getExportOrganizationsBtn() {
		return ExportOrganizationsBtn;
	}

	public WebElement getDeleteBtn() {
		return DeleteBtn;
	}

	public WebElement getShowWorldClk() {
		return ShowWorldClk;
	}

	public WebElement getClkListBox() {
		return ClkListBox;
	}

	public WebElement getLastViewedBtn() {
		return LastViewedBtn;
	}

	public WebElement getSelectLastViewed() {
		return SelectLastViewed;
	}

	public WebElement getSearchTxtBox() {
		return SearchTxtBox;
	}

	public WebElement getSearchOptionListBox() {
		return SearchOptionListBox;
	}

	public WebElement getSearchNowBtn() {
		return SearchNowBtn;
	}

	public WebElement getDeleteLink() {
		return DeleteLink;
	}

	public WebElement getOrgNewBtn() {
		return OrgNewBtn;
	}

	public WebElement getOrgSelectCheckbox() {
		return OrgSelectCheckbox;
	}

	public WebElement getCreateFilterLink() {
		return CreateFilterLink;
	}

	public WebElement getEditLink() {
		return EditLink;
	}

	public OrganizationPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);	
	}

	
}
