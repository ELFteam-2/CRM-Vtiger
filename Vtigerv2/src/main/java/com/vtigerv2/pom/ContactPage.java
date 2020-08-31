package com.vtigerv2.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactPage 
{
	@FindBy(name="firstname")
	private WebElement fname;

	
	@FindBy(name="lastname")
	private WebElement lname;

	@FindBy(xpath="//img[@title='Create Contact...']")
	private WebElement createcontact;

	@FindBy(xpath="(//input[@type='submit'])[1]")
	private WebElement savebtn;

	@FindBy(xpath="//a[.='edit']")
	private WebElement editbtn;

	@FindBy(xpath="//a[.='del']")
	private WebElement delbtn;

	@FindBy(name="selected_id")
	private WebElement checkbox;

	@FindBy(xpath="//img[@title='Import Contacts']")
	private WebElement importcontact;

	@FindBy(id="import_file")
	private WebElement choosefile;

	@FindBy(name="next")
	private WebElement nextbtn;

	@FindBy(name="mapped_fields")
	private WebElement descriptiondropdown;

	@FindBy(name="del")
	private WebElement delcheck;

	@FindBy(id="availList")
	private WebElement availablelist;

	@FindBy(name="import")
	private WebElement importbutton;


	@FindBy(xpath="//img[@title='Export Contacts']")
	private WebElement exportbutton;

	@FindBy(name="search_type")
	private WebElement Exportwithoutsearchrecords;

	@FindBy(name="export_data")
	private WebElement Exportalldata;

	@FindBy(name="Export")
	private WebElement Exportbuttonicon;
	@FindBy(xpath="//input[@value='Delete']")
	private WebElement Delete;


	@FindBy(xpath="//input[@value='Finish']")
	private WebElement finishbtn;

	@FindBy(xpath="//a/img[@title='Find Duplicates']")
	private WebElement duplicateicon;

	@FindBy(name="Button")
	private WebElement rightbutton;

	@FindBy(xpath="//input[@value='Find Duplicates']")
	private WebElement duplicatebutton;

	public WebElement getDelcheck() {
		return delcheck;
	}

	public WebElement getDelete() {
		return Delete;
	}

	public WebElement getRightbutton() {
		return rightbutton;
	}

	public WebElement getDuplicatebutton() {
		return duplicatebutton;
	}


	public WebElement getChoosefile() {
		return choosefile;
	}

	public WebElement getNextbtn() {
		return nextbtn;
	}

	public WebElement getDescriptiondropdown() {
		return descriptiondropdown;
	}

	public WebElement getImportbutton() {
		return importbutton;
	}

	public WebElement getFinishbtn() {
		return finishbtn;
	}

	public WebElement getDuplicateicon() {
		return duplicateicon;
	}

	public WebElement getImportcontact() {
		return importcontact;
	}

	public WebElement getCheckbox() {
		return checkbox;
	}

	public WebElement getDelbtn() {
		return delbtn;
	}

	public WebElement getEditbtn() {
		return editbtn;
	}

	public WebElement getSavebtn() {
		return savebtn;
	}


	public ContactPage (WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public WebElement getFname() {
		return fname;
	}
	public WebElement getLname() {
		return lname;
	}

	public WebElement getExportbutton() {
		return exportbutton;
	}

	public WebElement getExportwithoutsearchrecords() {
		return Exportwithoutsearchrecords;
	}

	public WebElement getExportalldata() {
		return Exportalldata;
	}

	public WebElement getExportbuttonicon() {
		return Exportbuttonicon;
	}

	public WebElement getAvailablelist() {
		return availablelist;
	}
	
	
	public WebElement getCreatecontact() 
	{
		return createcontact;
	}

}
