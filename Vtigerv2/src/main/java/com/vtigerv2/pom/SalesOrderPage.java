package com.vtigerv2.pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SalesOrderPage {
@FindBy(xpath="//img[@title='Create Sales Order...']")
private WebElement createsalesbtn;
@FindBy(xpath="//a[text()='edit']")
private List<WebElement> editlink;
@FindBy(xpath="//a[text()='del']")
private List<WebElement> deletelink;

@FindBy(xpath="//input[@name='selected_id']")
private List<WebElement> checkboxes;

@FindBy(xpath="//input[@value='Delete']")
private WebElement deletebtn;
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
@FindBy(xpath="//a[@title='Sales Order']")
private List<WebElement> salesordername;
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
@FindBy(xpath="//img[@id='jumpBtnIdTop']")
private WebElement jumpicon;
@FindBy(xpath="//a[text()=' Maggi Packs']")
private WebElement salesorder;
@FindBy(xpath="//img[@name='nextrecord']")
private WebElement nexticon;
@FindBy(xpath="//img[@title='Previous']")
private WebElement previousicon;
@FindBy(xpath="//select[@id='viewname']")
private WebElement filterdropdown;
@FindBy(xpath="//a[text()='Delete']")
private WebElement delete;
@FindBy(xpath="//a[text()='Go to Advanced Search']")
private WebElement advancedsearch;
@FindBy(xpath="//select[@id='fcol0']")
private WebElement adsearchdropdown;
@FindBy(xpath="//select[@id='fop0']")
private WebElement adsearchdropdown2;
@FindBy(xpath="//input[@id='fval0']")
private WebElement adsearchtextbox;
@FindBy(xpath="(//input[@value=' Search Now '])[2]")
private WebElement searchnowbtn2;
@FindBy(xpath="(//option[text()='Subject'])[2]")
private WebElement adsearchsubject;

public 	SalesOrderPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public WebElement getCreatesalesbtn() {
	return createsalesbtn;
}
public List<WebElement> getEditlink() {
	return editlink;
}
public List<WebElement> getDeletelink() {
	return deletelink;
}
public List<WebElement> getCheckboxes() {
	return checkboxes;
}
public WebElement getDeletebtn() {
	return deletebtn;
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
public List<WebElement> getSalesordername() {
	return salesordername;
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
public WebElement getJumpicon() {
	return jumpicon;
}
public WebElement getSalesorder() {
	return salesorder;
}
public WebElement getNexticon() {
	return nexticon;
}
public WebElement getPreviousicon() {
	return previousicon;
}
public WebElement getFilterdropdown() {
	return filterdropdown;
}
public WebElement getDelete() {
	return delete;
}
public WebElement getAdvancedsearch() {
	return advancedsearch;
}
public WebElement getAdsearchdropdown() {
	return adsearchdropdown;
}
public WebElement getAdsearchdropdown2() {
	return adsearchdropdown2;
}
public WebElement getAdsearchtextbox() {
	return adsearchtextbox;
}
public WebElement getSearchnowbtn2() {
	return searchnowbtn2;
}
public WebElement getAdsearchsubject() {
	return adsearchsubject;
}
 

}
