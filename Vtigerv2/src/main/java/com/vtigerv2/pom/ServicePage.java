package com.vtigerv2.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ServicePage
{
@FindBy(xpath="//a[.='Services']")
private WebElement services;

@FindBy(xpath="//a[.='meena tina']")
private WebElement mudu;

@FindBy(xpath="(//td/a[.='Contacts'])[2]")
private WebElement contacts;

@FindBy(xpath="//input[@value='Select Contacts']")
private WebElement selectcontacts;

@FindBy(xpath="(//a[.='shakuntala H'])[1]")
private WebElement contactlist;

@FindBy(xpath="(//td/a[.='Leads'])[2]")
private WebElement leaddrop;


@FindBy(xpath="(//td/a[.='Invoice'])[2]")
private WebElement invoicedrop;

@FindBy(xpath="//td[@align='right']/input[@title='Select Leads']")
private WebElement selectlead;

@FindBy(xpath="//input[@title='Add Invoice']")
private WebElement invoiceadd;

@FindBy(xpath="//input[@name='subject']")
private WebElement invoicesubject;

@FindBy(xpath="(//img[@title='Select'])[3]")
private WebElement invoiceorganisationplus;

@FindBy(xpath="//input[@value='Add Invoice']")
private WebElement selectinvoice;

@FindBy(xpath="//textarea[@name='bill_street']")
private WebElement invoicebillingaddress;

@FindBy(xpath="//textarea[@name='ship_street']")
private WebElement shippingaddress;

@FindBy(xpath="//input[@id='listPrice1']")
private WebElement listprice1;


@FindBy(xpath="(//input[@title='Save [Alt+S]'])[2]")
private WebElement invoicesave;


























@FindBy(xpath="//td/a[.=' zubair']")
private WebElement leadname;

@FindBy(xpath="(//a[.='More Information'])[1]")
private WebElement moreinformation;

@FindBy(xpath="//input[@name='import']")
private WebElement importbtn;

@FindBy(xpath="//input[@name='servicename_defaultvalue']")
private WebElement importdefault;

@FindBy(xpath="//input[@value='Finish']")
private WebElement importfinsh;

@FindBy(xpath="//td[.='Export without search records']")
private WebElement Exportwithoutsearchrecords;


@FindBy(xpath="//td[.='Export all data']")
private WebElement exportalldata;


@FindBy(xpath="//input[@class='crmButton big cancel']")
private WebElement importcancel;

@FindBy(xpath="//input[@value='Export Services ']")
private WebElement exportservicesbtn;

@FindBy(xpath="//input[@class='crmbutton small cancel']")
private WebElement exportcancelbtn;


@FindBy(xpath="//img[@alt='Export Services']")
private WebElement exportservices;


@FindBy(xpath="//input[@title='Cancel [Alt+X]']")
private WebElement cancel;

@FindBy(xpath="//img[@alt='Import Services']")
private WebElement importservices;

@FindBy(id="import_file")
private WebElement importfile;

@FindBy(xpath="//input[@name='next']")
private WebElement importnxt;


@FindBy(xpath="(//input[@title='Save [Alt+S]'])[1]")
private WebElement save;

@FindBy(xpath="//a[@title='Services']")
private WebElement repairlink;

@FindBy(xpath="(//Select[@name='mapped_fields'])[1]")
private WebElement importcrmfielddrop;


@FindBy(name="servicename_mass_edit_check")
private WebElement servicenamemassedit;



@FindBy(xpath="//input[@name='website']")
private WebElement website;



@FindBy(xpath="//img[@title='Create Service...']")
private WebElement createserviceplus;

@FindBy(xpath="//input[@name='servicename']")
private WebElement servicename;

@FindBy(xpath="//a[.='Create Invoice']")
private WebElement createinvoice;

@FindBy(xpath="(//textarea[@class='detailedViewTextBox'])[1]")
private WebElement billingaddress;





@FindBy(xpath="//input[@name='subject']")
private WebElement subjectname;

@FindBy(xpath="(//img[@alt='Select'])[3]")
private WebElement organisationnameplusbtn;

@FindBy(xpath="//a[.='unacademy']")
private WebElement unacademy;

@FindBy(xpath="//input[@name='qty1']")
private WebElement quantity;

@FindBy(xpath="//input[@id='listPrice1']")
private WebElement listprice;

@FindBy(xpath="(//input[@title='Save [Alt+S]'])[1]")
private WebElement savebtn;


@FindBy(xpath="(//input[@name='selected_id'])[1]")
private WebElement checkbox;

@FindBy(xpath="//input[@name='selectall']")
private WebElement allcheckbox;

@FindBy(xpath="//a[.='edit']")
private WebElement edit;

@FindBy(xpath="(//input[@value='Mass Edit'])[1]")
private WebElement massedit;


public ServicePage(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}


public WebElement getServices() {
	return services;
}


public WebElement getMudu() {
	return mudu;
}


public WebElement getContacts() {
	return contacts;
}


public WebElement getSelectcontacts() {
	return selectcontacts;
}


public WebElement getContactlist() {
	return contactlist;
}


public WebElement getLeaddrop() {
	return leaddrop;
}


public WebElement getInvoicedrop() {
	return invoicedrop;
}


public WebElement getSelectlead() {
	return selectlead;
}


public WebElement getInvoiceadd() {
	return invoiceadd;
}


public WebElement getInvoicesubject() {
	return invoicesubject;
}


public WebElement getInvoiceorganisationplus() {
	return invoiceorganisationplus;
}


public WebElement getSelectinvoice() {
	return selectinvoice;
}


public WebElement getInvoicebillingaddress() {
	return invoicebillingaddress;
}


public WebElement getShippingaddress() {
	return shippingaddress;
}


public WebElement getListprice1() {
	return listprice1;
}


public WebElement getInvoicesave() {
	return invoicesave;
}


public WebElement getLeadname() {
	return leadname;
}


public WebElement getMoreinformation() {
	return moreinformation;
}


public WebElement getImportbtn() {
	return importbtn;
}


public WebElement getImportdefault() {
	return importdefault;
}


public WebElement getImportfinsh() {
	return importfinsh;
}


public WebElement getExportwithoutsearchrecords() {
	return Exportwithoutsearchrecords;
}


public WebElement getExportalldata() {
	return exportalldata;
}


public WebElement getImportcancel() {
	return importcancel;
}


public WebElement getExportservicesbtn() {
	return exportservicesbtn;
}


public WebElement getExportcancelbtn() {
	return exportcancelbtn;
}


public WebElement getExportservices() {
	return exportservices;
}


public WebElement getCancel() {
	return cancel;
}


public WebElement getImportservices() {
	return importservices;
}


public WebElement getImportfile() {
	return importfile;
}


public WebElement getImportnxt() {
	return importnxt;
}


public WebElement getSave() {
	return save;
}


public WebElement getRepairlink() {
	return repairlink;
}


public WebElement getImportcrmfielddrop() {
	return importcrmfielddrop;
}


public WebElement getServicenamemassedit() {
	return servicenamemassedit;
}


public WebElement getWebsite() {
	return website;
}


public WebElement getCreateserviceplus() {
	return createserviceplus;
}


public WebElement getServicename() {
	return servicename;
}


public WebElement getCreateinvoice() {
	return createinvoice;
}


public WebElement getBillingaddress() {
	return billingaddress;
}


public WebElement getSubjectname() {
	return subjectname;
}


public WebElement getOrganisationnameplusbtn() {
	return organisationnameplusbtn;
}


public WebElement getUnacademy() {
	return unacademy;
}


public WebElement getQuantity() {
	return quantity;
}


public WebElement getListprice() {
	return listprice;
}


public WebElement getSavebtn() {
	return savebtn;
}


public WebElement getCheckbox() {
	return checkbox;
}


public WebElement getAllcheckbox() {
	return allcheckbox;
}


public WebElement getEdit() {
	return edit;
}


public WebElement getMassedit() {
	return massedit;
}






}
