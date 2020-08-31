package com.vtigerv2.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpertunityPage
{

	@FindBy(xpath="//input[@name='potentialname']")
	private WebElement opurtunityname;

	@FindBy(xpath="//img[@title='Create Opportunity...']")
	private WebElement createopportunityplus;

	@FindBy(xpath="(//textarea[@class='detailedViewTextBox'])[1]")
	private WebElement billingaddress;
	
	@FindBy(xpath="(//textarea[@class='detailedViewTextBox'])[2]")
	private WebElement shippingaddress;
	

	public WebElement getShippingaddress() {
		return shippingaddress;
	}




	public WebElement getBillingaddress() {
		return billingaddress;
	}

	@FindBy(id="related_to_display")
	private WebElement relatedto;

	@FindBy(xpath="(//img[@title='Select'])[1]")
	private WebElement selectplusbutton;

	@FindBy(xpath="//input[@name='assigntype']")
	private WebElement user;

	@FindBy(xpath="(//input[@type='submit'])[1]")
	private WebElement save;

	@FindBy(xpath="(//input[@value='  Cancel  '])[1]")
	private WebElement cancel;

	@FindBy(xpath="//a[.='unacademy']")
	private WebElement unacademy;

	@FindBy(xpath="//a[.='Go to Advanced Search']")
	private WebElement searchbtn;

	@FindBy(xpath="//Select[@class='repBox']")
	private WebElement equalsdropdown;

	@FindBy(xpath="//td[@class='dvtCellLabel']/input[@class='repBox']")
	private WebElement enterdetails;

	@FindBy(xpath="(//input[@value=' Search Now '])[1]")
	private WebElement insidesearchbtn;

	@FindBy(xpath="//img[@title='Import Opportunities']")
	private WebElement importopertunity;

	@FindBy(xpath="//img[@title='Export Opportunities']")
	private WebElement exportoppertunity;

	@FindBy(xpath="//input[@name=\"next\"]")
	private WebElement importnextbtn;

	@FindBy(xpath="(//select[@name='mapped_fields'])[1]")
	private WebElement crmfield1;
	
	
	@FindBy(xpath="(//input[@name='export_data'])[1]")
	private WebElement exportalldata;
	@FindBy(xpath="//input[@value='withoutsearch']")
	private WebElement withoutsearch;

	@FindBy(xpath="//input[@name='import']")
	private WebElement crmfieldimportbtn;

	@FindBy(xpath="//img[@title='LBL_SET_DATE']")
	private WebElement expectedclousuredate;

	@FindBy(id="import_file")
	private WebElement importfile;
@FindBy(xpath="//img[@title='LBL_SET_DATE']")
private WebElement calender;

@FindBy(xpath="(//tr[@class='daysrow'])[5]/td[@class='day']")
private WebElement date;

@FindBy(xpath="//input[@value='Export Opportunities ']")
private WebElement exportoppertunitiesbtn;

@FindBy(xpath="//input[@value=' Cancel ']")
private WebElement exportcancel;

@FindBy(xpath="//td[@align='right']/input[@name='cancel']")
private WebElement importcancel;

@FindBy(xpath="(//td[@class='day selected'])[1]")
private WebElement evendate;

@FindBy(xpath="//td[@class='calAddButton']")
private WebElement addbtn;

@FindBy(xpath="//input[@name='subject']")
private WebElement eventname;


@FindBy(xpath="(//img[@alt='Set Date'])[1]")
private WebElement startdate;

@FindBy(xpath="//input[@title='Save [Alt+S]']")
private WebElement eventsave;

public WebElement getEvendate() {
	return evendate;
}




public WebElement getAddbtn() {
	return addbtn;
}




public WebElement getEventname() {
	return eventname;
}




public WebElement getStartdate() {
	return startdate;
}




public WebElement getEventsave() {
	return eventsave;
}




public WebElement getCall() {
	return call;
}




public WebElement getOpencalender() {
	return opencalender;
}

@FindBy(xpath="//a[.='Call']")
private WebElement call;

@FindBy(xpath="//img[@title='Open Calendar...']")
private WebElement opencalender;
	
	public WebElement getExportalldata() {
	return exportalldata;
}




public WebElement getWithoutsearch() {
	return withoutsearch;
}




public WebElement getExportoppertunitiesbtn() {
	return exportoppertunitiesbtn;
}




public WebElement getExportcancel() {
	return exportcancel;
}




public WebElement getImportcancel() {
	return importcancel;
}




	public WebElement getDate() {
	return date;
}




	public WebElement getCalender() {
	return calender;
}

	@FindBy(name="selected_id")
	private WebElement checkbox;

	@FindBy(xpath="selected_id")
	private WebElement delete;

	@FindBy(xpath="//a[.='edit']")
	private WebElement edit;

	@FindBy(xpath="//a[.='samsung']")
	private WebElement samsung;

	@FindBy(xpath="(//input[@value='Mass Edit'])[1]")
	private WebElement massedit;
	
	@FindBy(xpath="//input[@name='potentialname_defaultvalue']")
	private WebElement defaultvalue;
	
	@FindBy(xpath="//select[@id='sales_stage_defaultvalue']")
	private WebElement saledefaultvalue;

	public WebElement getSaledefaultvalue() {
		return saledefaultvalue;
	}




	public  OpertunityPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}




	public WebElement getDefaultvalue() {
		return defaultvalue;
	}




	public WebElement getSearchbtn() {
		return searchbtn;
	}

	public WebElement getEqualsdropdown() {
		return equalsdropdown;
	}

	public WebElement getEnterdetails() {
		return enterdetails;
	}

	public WebElement getCreateopportunityplus() {
		return createopportunityplus;
	}


	public WebElement getInsidesearchbtn() {
		return insidesearchbtn;
	}

	public WebElement getImportopertunity() {
		return importopertunity;
	}

	public WebElement getExportoppertunity() {
		return exportoppertunity;
	}

	public WebElement getImportnextbtn() {
		return importnextbtn;
	}

	public WebElement getCrmfield1() {
		return crmfield1;
	}

	public WebElement getCrmfieldimportbtn() {
		return crmfieldimportbtn;
	}

	public WebElement getExpectedclousuredate() {
		return expectedclousuredate;
	}

	public WebElement getImportfile() {
		return importfile;
	}



	public WebElement getOpurtunityname() {
		return opurtunityname;
	}


	public WebElement getRelatedto() {
		return relatedto;
	}

	public WebElement getSelectplusbutton() {
		return selectplusbutton;
	}

	public WebElement getUser() {
		return user;
	}

	public WebElement getSave() {
		return save;
	}

	public WebElement getCancel() {
		return cancel;
	}

	public WebElement getUnacademy() {
		return unacademy;
	}

	public WebElement getCheckbox() {
		return checkbox;
	}

	public WebElement getDelete() {
		return delete;
	}

	public WebElement getEdit() {
		return edit;
	}

	public WebElement getSamsung() {
		return samsung;
	}

	public WebElement getMassedit() {
		return massedit;
	}


}
