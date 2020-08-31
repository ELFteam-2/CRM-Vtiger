package com.vtigerv2.pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CampaignsPage {
	
	@FindBy(xpath="//img[@alt='Create Campaign...']")
	private WebElement createcampaignicon;
	
	@FindBy(xpath="//img[@title='Last Viewed']")
	private WebElement LastViewedIcon;
	
	@FindBy(xpath="//a[.='Create Filter']")
	private WebElement CreateFilterLink;
	
	
	@FindBy(xpath="//input[@value='Delete']")
	private WebElement Deletebtn;
	
	@FindBy(xpath="//input[@value='Mass Edit']")
	private WebElement MassEditbtn;
	
	@FindBy(xpath="//input[@type='checkbox']")
	private List<WebElement> CAMcheckbox;
	
	@FindBy(xpath="(//a[.='edit'])[5]")
	private WebElement CAMeditLink;
	
	@FindBy(xpath="//input[@class='txtBox']")
	private WebElement searchfortbx;
	
	@FindBy(xpath="(//input[@class='crmbutton small create'])[1]")
	private WebElement searchnowbtn;
	
	@FindBy(xpath="(//select[@name='search_field'])[1]")
	private WebElement Inlistbox;
	
	@FindBy(xpath="//img[@title='Campaigns Settings']")
	private WebElement CampaignSettingsIcon;
	
	@FindBy(xpath="//a[.='Go to Advanced Search']")
	private WebElement advancesearchlink;
	
	@FindBy(xpath="//select[@class='detailedViewTextBox']")
	private WebElement detaileviewdropdown;
	
	@FindBy(xpath="//select[@class='repBox']")
	private WebElement addrequirementdropdown;
	
	@FindBy(xpath="//input[@id='fval0']")
	private WebElement detailtbx;
	
	@FindBy(xpath="(//input[@value=' Search Now '])[2]")
	private WebElement searchnowbtn2;
	
	
	

	public WebElement getAddrequirementdropdown() {
		return addrequirementdropdown;
	}

	public WebElement getDetailtbx() {
		return detailtbx;
	}

	public WebElement getSearchnowbtn2() {
		return searchnowbtn2;
	}

	public WebElement getAdvancesearchlink() {
		return advancesearchlink;
	}

	public WebElement getDetaileviewdropdown() {
		return detaileviewdropdown;
	}

	public WebElement getCampaignSettingsIcon() {
		return CampaignSettingsIcon;
	}

	public WebElement getInlistbox() {
		return Inlistbox;
	}

	public WebElement getSearchnowbtn() {
		return searchnowbtn;
	}

	public WebElement getSearchfortbx() {
		return searchfortbx;
	}

	public CampaignsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getCreatecampaignicon() {
		return createcampaignicon;
	}

	public WebElement getLastViewedIcon() {
		return LastViewedIcon;
	}

	public WebElement getCreateFilterLink() {
		return CreateFilterLink;
	}
	
	public WebElement getDeletebtn() {
		return Deletebtn;
	}

	public WebElement getMassEditbtn() {
		return MassEditbtn;
	}

	

	public List<WebElement> getCAMcheckbox() {
		return CAMcheckbox;
	}

	public WebElement getCAMeditLink() {
		return CAMeditLink;
	}

	
	

}
