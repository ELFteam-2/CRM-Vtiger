package com.vtigerv2.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JustDoItEditingCampaignInformationPage {
	
	@FindBy(name="targetsize")
	private WebElement targetsize;
	
	@FindBy(xpath="//input[@name='expectedrevenue']")
	private WebElement ExpectedRevenue;
	
	@FindBy(xpath="(//input[@value='  Save  '])[2]")
	private WebElement Savebtn2;
	


	public JustDoItEditingCampaignInformationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}

	
	public WebElement getTargetsize() {
		return targetsize;
	}


	public WebElement getExpectedRevenue() {
		return ExpectedRevenue;
	}
	
	public WebElement getSavebtn2() {
		return Savebtn2;
	}
	
	


}
