package com.vtigerv2.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ServicesWindowPage {
@FindBy(xpath="//a[text()='tv installation']")
private WebElement selectservice;

public 	ServicesWindowPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public WebElement getSelectservice() {
	return selectservice;
}

}
