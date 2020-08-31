package com.vtigerv2.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeadPage
{
@FindBy(xpath="//img[@title='Create Lead...']")
private WebElement createlead;

@FindBy(xpath="//select[@name='salutationtype']")
private WebElement firstname;

@FindBy(xpath="//input[@name='lastname']")
private WebElement lastname;

@FindBy(xpath="(//a[.='edit'])[1]")
private WebElement edit;

@FindBy(xpath="(//input[@name='selected_id'])[1]")
private WebElement checkbox;

public WebElement getEdit() {
	return edit;
}


public WebElement getCheckbox() {
	return checkbox;
}


public WebElement getDelete() {
	return delete;
}

@FindBy(xpath="//input[@name='selectall']")
private WebElement leadallcheckbox;

@FindBy(xpath="(//input[@class='crmbutton small delete'])[1]")
private WebElement deleteallbtn;

@FindBy(xpath="(//input[@value='Mass Edit'])[1]")
private WebElement massedit;

@FindBy(xpath="//img[@title='Import Leads']")
private WebElement importlead;


@FindBy(xpath="//img[@title='Export Leads']")
private WebElement exportlead;

@FindBy(xpath="(//select[@name='mapped_fields'])[1]")
private WebElement crmfielddrop;


@FindBy(xpath="//td[@align='right']/input[@value='Import']")
private WebElement finalimport;

@FindBy(id="assigned_user_id_defaultvalue")
private WebElement assigneddrop;


public WebElement getAssigneddrop() {
	return assigneddrop;
}

@FindBy(id="import_file")
private WebElement  importfile;

@FindBy(xpath="//input[@value='Next']")
private WebElement importnext;

@FindBy(id="lastname_defaultvalue")
private WebElement defaultvalue;

public WebElement getDefaultvalue() {
	return defaultvalue;
}


public WebElement getImportfile() {
	return importfile;
}


public WebElement getImportnext() {
	return importnext;
}


public WebElement getImportlead() {
	return importlead;
}


public WebElement getExportlead() {
	return exportlead;
}


public WebElement getCrmfielddrop() {
	return crmfielddrop;
}


public WebElement getFinalimport() {
	return finalimport;
}


public WebElement getMassedit() {
	return massedit;
}

@FindBy(xpath="//a[.='del']")
private WebElement delete;

public WebElement getLeadallcheckbox() {
	return leadallcheckbox;
}


public WebElement getDeleteallbtn() {
	return deleteallbtn;
}

@FindBy(name="company")
private WebElement company;

@FindBy(xpath="(//input[@value='  Save  '])[1]")
private WebElement save;

@FindBy(xpath="(//input[@value='  Cancel  '])[1]")
private WebElement cancel;


public LeadPage(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}


public WebElement getCreatelead() {
	return createlead;
}


public WebElement getFirstname() {
	return firstname;
}


public WebElement getLastname() {
	return lastname;
}


public WebElement getCompany() {
	return company;
}


public WebElement getSave() {
	return save;
}


public WebElement getCancel() {
	return cancel;
}


}
