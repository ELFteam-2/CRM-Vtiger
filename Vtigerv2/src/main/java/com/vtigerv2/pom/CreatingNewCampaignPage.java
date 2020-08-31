package com.vtigerv2.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatingNewCampaignPage {
	@FindBy(xpath="//input[@name='campaignname']")
	private WebElement Campaignnametbx;
	
	@FindBy(xpath="//input[@id='jscal_field_closingdate']")
	private WebElement Expectedclosedatetbx;
	
	@FindBy(xpath="(//input[@name='button'])[3]")
	private WebElement Savebtn;
	
	@FindBy(xpath="(//input[@class='crmbutton small cancel'])[2]")
	private WebElement Cancelbtn;
	
	@FindBy(xpath="//td/textarea[@name='description']")
	private WebElement Descriptiontbx;
	
	@FindBy(xpath="//a[.='Create Filter']")
	private WebElement CreateLink;
	
	public WebElement getCreateLink() {
		return CreateLink;
	}

	public CreatingNewCampaignPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getCampaignnametbx() {
		return Campaignnametbx;
	}

	public WebElement getExpectedclosedatetbx() {
		return Expectedclosedatetbx;
	}

	public WebElement getSavebtn() {
		return Savebtn;
	}

	public WebElement getCancelbtn() {
		return Cancelbtn;
	}

	public WebElement getDescriptiontbx() {
		return Descriptiontbx;
	}
	


}
