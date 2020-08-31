package com.vtigerv2.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CampaignMassEditPage {
	
	@FindBy(id="campaignname_mass_edit_check")
	private WebElement Campaigncheckbox;
	
	@FindBy(name="campaignname")
	private WebElement Campaignnametbx;
	
	@FindBy(xpath="//input[@value='  Save  ']")
	private WebElement savebtn;
	
	public CampaignMassEditPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getCampaigncheckbox() {
		return Campaigncheckbox;
	}

	public WebElement getCampaignnametbx() {
		return Campaignnametbx;
	}

	public WebElement getSavebtn() {
		return savebtn;
	}
	
	

}
