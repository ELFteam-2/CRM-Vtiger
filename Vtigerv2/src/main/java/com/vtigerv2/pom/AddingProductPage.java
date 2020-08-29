package com.vtigerv2.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddingProductPage 
{
	@FindBy(xpath="//a[contains(text(),'maggie')]")
	private WebElement ProductSelect;
	
	public AddingProductPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);	
	}

	public WebElement getProductSelect() {
		return ProductSelect;
	}

}
