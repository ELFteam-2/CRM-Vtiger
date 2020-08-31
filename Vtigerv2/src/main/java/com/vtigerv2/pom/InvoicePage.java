package com.vtigerv2.pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class InvoicePage {
	@FindBy(xpath="//img[@title='Create Invoice...']")
	private WebElement CreateInvoiceBtn;
	@FindBy(xpath="//a[text()='edit']")
	private List<WebElement> Editlink;
	@FindBy(xpath="//a[text()='del']")
	private List<WebElement> deletelink;
	@FindBy(xpath="//input[@name='selectall']")
	private WebElement selectCheckbox;
	@FindBy(xpath="//input[@value='Delete']")
	private WebElement deletebutton;
	@FindBy(xpath="//input[@name='search_text']")
	private WebElement searchtextbox;
	@FindBy(xpath="(//select[@name='search_field'])[1]")
	private WebElement searchindropdown;
	@FindBy(xpath="(//option[@value='invoice_no'])[1]")
	private WebElement selectinvoiceno;
	@FindBy(xpath="(//option[@value='subject'])[1]")
	private WebElement selectsubject;
	@FindBy(xpath="//input[@value='Mass Edit']")
	private WebElement masseditbtn;
	@FindBy(xpath="//a[text()='Create Filter']")
	private WebElement createfilterlink;
	@FindBy(xpath="//a[@title='Invoice']")
	private List<WebElement> subjectlink;
	@FindBy(xpath="//a[text()='Export To PDF']")
	private WebElement exportpdflink;
	@FindBy(xpath="//input[@name='Duplicate']")
	private WebElement duplicatebtn;
	@FindBy(xpath="//input[@value='  Save  ']")
	private WebElement savebtn;
	@FindBy(xpath="//a[text()='Send Email With PDF']")
	private WebElement sendemail;
	@FindBy(xpath="//input[@id='parent_name']")
	private WebElement totextbox;
	@FindBy(xpath="//input[@id='subject']']")
	private WebElement subjecttextbox;
	@FindBy(xpath="(//input[@value=' Send '])[1]")
	private WebElement sendbtn;
	@FindBy(xpath="(//input[@value=' Search Now '])[1]")
	private WebElement searchnowbtn;
	@FindBy(xpath="(//a[text()='Invoice'])[1]")
	private WebElement invoicetab;
	@FindBy(xpath="(//a[@class='listFormHeaderLinks'])[1]")
	private WebElement invoicenolink;
	@FindBy(xpath="//input[@id='50']")
	private WebElement lastinvoice;
	@FindBy(xpath="//a[text()='Delete']")
	private WebElement delete;
	@FindBy(xpath="//select[@id='viewname']")
	private WebElement filterdropdown;
	@FindBy(xpath="//option[@value='56']")
	private WebElement filtername;
	@FindBy(xpath="//input[@name='selected_id']")
	private List<WebElement> checkboxes;
	@FindBy(xpath="(//input[@name='selected_id'])[1]")
	private WebElement checkboxe;
	@FindBy(xpath="(//a[text()='Maggi Packs'])[3]")
	private WebElement subject;
	

	public WebElement getSubject() {
		return subject;
	}

	public WebElement getCheckboxe() {
		return checkboxe;
	}

	public 	InvoicePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getSendemail() {
		return sendemail;
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
	public WebElement getDuplicatebtn() {
		return duplicatebtn;
	}
	public WebElement getSavebtn() {
		return savebtn;
	}
	public List<WebElement> getSubjectlink() {
		return subjectlink;
	}
	public WebElement getExportpdflink() {
		return exportpdflink;
	}
	public WebElement getCreatefilterlink() {
		return createfilterlink;
	}
	public List<WebElement> getCheckboxes() {
		return checkboxes;
	}

	public WebElement getMasseditbtn() {
		return masseditbtn;
	}
	public WebElement getSelectsubject() {
		return selectsubject;
	}
	public WebElement getSearchtextbox() {
		return searchtextbox;
	}
	public WebElement getSearchindropdown() {
		return searchindropdown;
	}
	public WebElement getSelectinvoiceno() {
		return selectinvoiceno;
	}
	public WebElement getSearchnowbtn() {
		return searchnowbtn;
	}
	public WebElement getSelectCheckbox() {
		return selectCheckbox;
	}
	public WebElement getDeletebutton() {
		return deletebutton;
	}
	public List<WebElement> getDeletelink() {
		return deletelink;
	}
	public WebElement getCreateInvoiceBtn() {
		return CreateInvoiceBtn;
	}
	public List<WebElement> getEditlink() {
		return Editlink;
	}
	public WebElement getInvoicetab() {
		return invoicetab;
	}
	public WebElement getInvoicenolink() {
		return invoicenolink;
	}
	public WebElement getLastinvoice() {
		return lastinvoice;
	}
	public WebElement getDelete() {
		return delete;
	}
	public WebElement getFilterdropdown() {
		return filterdropdown;
	}

	public WebElement getFiltername() {
		return filtername;
	}
}
