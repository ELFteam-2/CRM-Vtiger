package com.vtigerv2.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MassEditPage {

	@FindBy(xpath="//input[@name='subject_mass_edit_check']")
	private WebElement subjectCheckbox;
	@FindBy(xpath="//input[@name='subject']")
	private WebElement subjecttxtbox;
	@FindBy(xpath="//input[@value='  Save  ']")
	private WebElement savebtn;
	public MassEditPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public WebElement getSubjectCheckbox() {
		return subjectCheckbox;
	}
	public WebElement getSubjecttxtbox() {
		return subjecttxtbox;
	}
	public WebElement getSavebtn() {
		return savebtn;
	}
	
}
