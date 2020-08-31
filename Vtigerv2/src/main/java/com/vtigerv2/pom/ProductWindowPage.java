package com.vtigerv2.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductWindowPage {
	@FindBy(xpath="//a[@id='popup_product_36']")
	private WebElement selectproduct;
	
	public 	ProductWindowPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getSelectproduct() {
		return selectproduct;
	}
}
