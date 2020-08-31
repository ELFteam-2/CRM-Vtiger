package com.vtigerv2.pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RecycleBinPage {
	
	@FindBy(xpath="//select[@id='select_module']")
	private WebElement selectmoduledropdown;
	
	@FindBy(xpath="//input[@id='selectCurrentPageRec']")
	private List<WebElement> currentpagereq;
	
	@FindBy(xpath="(//input[@value='Restore'])[2]")
	private WebElement restorebtn;
	
	@FindBy(xpath="(//input[@value='Empty Recycle Bin'])[2]")
	private WebElement emptyrecyclebinbtn;
	
	public RecycleBinPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public WebElement getSelectmoduledropdown() {
		return selectmoduledropdown;
	}

	public List<WebElement> getCurrentpagereq() {
		return currentpagereq;
	}

	public WebElement getRestorebtn() {
		return restorebtn;
	}

	public WebElement getEmptyrecyclebinbtn() {
		return emptyrecyclebinbtn;
	}

}
