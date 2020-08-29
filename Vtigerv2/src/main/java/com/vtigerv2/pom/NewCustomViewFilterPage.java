package com.vtigerv2.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewCustomViewFilterPage 
{
	@FindBy(xpath="//input[@class='detailedViewTextBox']")
	private WebElement ViewNameTxtbox;
	
	@FindBy(xpath="//select[@id='column1']//optgroup[@label='Organization Information']//option")
	private WebElement Column1Listbox;
	
	@FindBy(xpath="//select[@id='column2']/optgroup/option")
	private WebElement Column2Listbox;
	
	@FindBy(xpath="//select[@id='column3']/optgroup/option")
	private WebElement Column3Listbox;
	
	@FindBy(xpath="//input[@class='crmbutton small save']")
	private WebElement Savebtn;

	public WebElement getViewNameTxtbox() {
		return ViewNameTxtbox;
	}

	public WebElement getColumn1Listbox() {
		return Column1Listbox;
	}

	public WebElement getColumn2Listbox() {
		return Column2Listbox;
	}

	public WebElement getColumn3Listbox() {
		return Column3Listbox;
	}

	public WebElement getSavebtn() {
		return Savebtn;
	}
	
	public NewCustomViewFilterPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);	
	}

}
