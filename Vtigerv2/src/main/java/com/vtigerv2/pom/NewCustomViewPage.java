package com.vtigerv2.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewCustomViewPage {

	@FindBy(xpath="//input[@name='subject_mass_edit_check']")
	private WebElement subjectCheckbox;
	@FindBy(xpath="//input[@name='viewName']")
	private WebElement viewnametxtbox;
	@FindBy(id="stdDateFilter")
	private WebElement selectdurationdropdown;
	@FindBy(xpath="//option[text()='Last 30 Days']")
	private WebElement duration;
	@FindBy(xpath="(//input[@value='Save'])[2]")
	private WebElement savebtn;
	
	public NewCustomViewPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getSubjectCheckbox() {
		return subjectCheckbox;
	}
	public WebElement getViewnametxtbox() {
		return viewnametxtbox;
	}
	public WebElement getSelectdurationdropdown() {
		return selectdurationdropdown;
	}
	public WebElement getDuration() {
		return duration;
	}
	public WebElement getSavebtn() {
		return savebtn;
	}

	@FindBy(xpath="//input[@name='viewName']")
	private WebElement viewnametbx;
	
	@FindBy(xpath="//input[@name='setDefault']")
	private WebElement setasdefaultcheckbox;
	
	@FindBy(xpath="//input[@name='button2']")
	private WebElement Savebtn2;
	
	public WebElement getSavebtn2() {
		return Savebtn2;
	}

	

	public WebElement getViewnametbx() {
		return viewnametbx;
	}

	public WebElement getSetasdefaultcheckbox() {
		return setasdefaultcheckbox;
	}
	

}
