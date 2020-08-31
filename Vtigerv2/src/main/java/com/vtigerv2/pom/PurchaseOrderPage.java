package com.vtigerv2.pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PurchaseOrderPage {
	@FindBy(xpath="//img[@title='Create Purchase Order...']")
	private WebElement createpurchasebtn;
	@FindBy(xpath="//a[text()='edit']")
	private List<WebElement> editlink;
	@FindBy(xpath="//a[text()='del']")
	private List<WebElement> deletelink;
	@FindBy(xpath="//input[@name='selected_id']")
	private List<WebElement> Checkboxes;
	@FindBy(xpath="//input[@value='Delete']")
	private WebElement Deletebtn;
	@FindBy(xpath="//input[@name='search_text']")
	private WebElement searchtxtbox;
	@FindBy(xpath="//input[@name='submit']")
	private WebElement searchnowbtn;
	@FindBy(xpath="(//select[@id='bas_searchfield'])[1]")
	private WebElement searchindropdown;
	@FindBy(xpath="//input[@value='Mass Edit']")
	private WebElement masseditbtn;
	@FindBy(xpath="//a[text()='Create Filter']")
	private WebElement CreateFilterLink;
	@FindBy(xpath="//a[@title='Purchase Order']")
	private List<WebElement> PurchaseOrderName ;
	@FindBy(xpath="//a[.='Export To PDF']")
	private WebElement exportpdflink;
	@FindBy(xpath="//input[@name='Duplicate']")
	private WebElement duplicatebtn;
	@FindBy(xpath="//input[@value='  Save  ']")
	private WebElement savebtn;
	@FindBy(xpath="//a[text()='Send Email With PDF']")
	private WebElement sendemaillink;
	@FindBy(xpath="//input[@id='parent_name']")
	private WebElement totextbox;
	@FindBy(xpath="//input[@id='subject']")
	private WebElement subjecttextbox;
	@FindBy(xpath="(//input[@value=' Send '])[1]")
	private WebElement sendbtn;
	
	

	public 	PurchaseOrderPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}



	public WebElement getCreatepurchasebtn() {
		return createpurchasebtn;
	}
	public List<WebElement> getEditlink() {
		return editlink;
	}
	public List<WebElement> getDeletelink() {
		return deletelink;
	}
	public List<WebElement> getCheckboxes() {
		return Checkboxes;
	}
	public WebElement getDeletebtn() {
		return Deletebtn;
	}
	public WebElement getSearchtxtbox() {
		return searchtxtbox;
	}
	public WebElement getSearchnowbtn() {
		return searchnowbtn;
	}
	public WebElement getSearchindropdown() {
		return searchindropdown;
	}
	public WebElement getMasseditbtn() {
		return masseditbtn;
	}
	public WebElement getCreateFilterLink() {
		return CreateFilterLink;
	}
	public List<WebElement> getPurchaseOrderName() {
		return PurchaseOrderName;
	}
	public WebElement getExportpdflink() {
		return exportpdflink;
	}
	public WebElement getDuplicatebtn() {
		return duplicatebtn;
	}
	public WebElement getSavebtn() {
		return savebtn;
	}
	public WebElement getSendemaillink() {
		return sendemaillink;
	}
	public WebElement getTotextbox() {
		return totextbox;
	}
	public WebElement getSubjecttextbox() {
		return subjecttextbox;
	}
	public WebElement getSendbtn() {
		return sendbtn;
	}
	
	
	
	
	
	
}
