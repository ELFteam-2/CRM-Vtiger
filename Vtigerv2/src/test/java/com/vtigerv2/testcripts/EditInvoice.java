package com.vtigerv2.testcripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.vtigerv2.generics.BaseClass;
import com.vtigerv2.generics.FileLib;
import com.vtigerv2.pom.CreateNewInvoicePage;
import com.vtigerv2.pom.EditingInvoicePage;
import com.vtigerv2.pom.HomePage;
import com.vtigerv2.pom.InvoicePage;
@Listeners(com.vtigerv2.generics.Listener.class)
public class EditInvoice extends BaseClass {
@Test
public void testEditInvoice() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
	//Click on More Dropdown and Click on Invoice.
	HomePage h=new HomePage(driver);
	Actions a=new Actions(driver);
	a.moveToElement(h.getMorelink()).perform();
	h.getInvoicelink().click();
	//Click on edit under Action Tab on any of the Invoice.
	InvoicePage i=new InvoicePage(driver);
	int count = i.getEditlink().size();
	for(int k=0;k<count;k++) {
		if(k<1) {
			i.getEditlink().get(k).click();  
		}
	}
	FileLib f=new FileLib();
	String billingaddress = f.getExceldata("CreateInvoice", 2, 1);
	//Enter New Billing Address under Address Information 
	EditingInvoicePage e=new EditingInvoicePage(driver);
	e.getBillingAddresstxtbox().clear();
	Thread.sleep(2000);
	e.getBillingAddresstxtbox().sendKeys(billingaddress);
	// Click on Save.
	CreateNewInvoicePage c=new CreateNewInvoicePage(driver);
	c.getSavebtn().click();
	Reporter.log("Invoice is edited",true);
}
}
