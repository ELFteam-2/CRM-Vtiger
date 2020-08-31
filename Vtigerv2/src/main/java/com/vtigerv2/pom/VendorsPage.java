package com.vtigerv2.pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VendorsPage {
	
	@FindBy(xpath="//img[@title='Create Vendor...']")
	private WebElement createvendoricon;
	
	public WebElement getCreatevendoricon() {
		return createvendoricon;
	}

	@FindBy(xpath="//input[@name='search_text']")
	private WebElement searchfortbx;
	
	@FindBy(xpath="//input[@name='submit']")
	private WebElement searchnowbtn;
	
	@FindBy(xpath="//a[text()='Create Filter']")
	private WebElement createfilterlink;
	
	@FindBy(xpath="(//input[@value='Delete'])[2]")
	private WebElement deletebtn;
	
	@FindBy(xpath="(//a[.='edit'])[11]")
	private WebElement VEN12editlink;
	
	@FindBy(xpath="//input[@type='checkbox']")
	private List<WebElement> VENcheckbox;
	
	@FindBy(xpath="(//select[@name='search_field'])[1]")
	private WebElement Inlistbox;
	
	@FindBy(xpath="//input[@value='Mass Edit']")
	private WebElement MassEditbtn;
	
	@FindBy(xpath="//img[@title='Last Viewed']")
	private WebElement LastViewedicon;
	
	@FindBy(xpath="//select[@class='detailedViewTextBox']")
	private WebElement detaileviewdropdown;
	
	@FindBy(xpath="//select[@class='repBox']")
	private WebElement addrequirementdropdown;
	
	@FindBy(xpath="//input[@id='fval0']")
	private WebElement detailtbx;
	
	@FindBy(xpath="(//input[@value=' Search Now '])[2]")
	private WebElement searchnowbtn2;
	
	@FindBy(xpath="//a[.='Go to Advanced Search']")
	private WebElement advancesearchlink;
	
	
	
	
	
	
	

	public WebElement getAdvancesearchlink() {
		return advancesearchlink;
	}

	public WebElement getDetaileviewdropdown() {
		return detaileviewdropdown;
	}

	public WebElement getAddrequirementdropdown() {
		return addrequirementdropdown;
	}

	public WebElement getDetailtbx() {
		return detailtbx;
	}

	public WebElement getSearchnowbtn2() {
		return searchnowbtn2;
	}

	public WebElement getLastViewedicon() {
		return LastViewedicon;
	}

	public WebElement getMassEditbtn() {
		return MassEditbtn;
	}

	public WebElement getInlistbox() {
		return Inlistbox;
	}

	public VendorsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getSearchfortbx() {
		return searchfortbx;
	}

	public WebElement getSearchnowbtn() {
		return searchnowbtn;
	}

	public WebElement getCreatefilterlink() {
		return createfilterlink;
	}

	public WebElement getDeletebtn() {
		return deletebtn;
	}

	public WebElement getVEN12editlink() {
		return VEN12editlink;
	}

	public List<WebElement> getVENcheckbox() {
		return VENcheckbox;
	}


	
	
	
	
	

}
