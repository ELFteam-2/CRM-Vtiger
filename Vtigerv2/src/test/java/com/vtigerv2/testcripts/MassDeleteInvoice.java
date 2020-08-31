package com.vtigerv2.testcripts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.vtigerv2.generics.BaseClass;
import com.vtigerv2.pom.HomePage;
import com.vtigerv2.pom.InvoicePage;
@Listeners(com.vtigerv2.generics.Listener.class)
public class MassDeleteInvoice extends BaseClass {
@Test
public void testMassDeleteInvoice() {
	//Click on More Dropdown and Click on Invoice.
	HomePage h=new HomePage(driver);
	Actions a=new Actions(driver);
	a.moveToElement(h.getMorelink()).perform();
	h.getInvoicelink().click();
	//Click on Checkboxes of Multiple Invoices(Select 2) 
	InvoicePage i=new InvoicePage(driver);
	int count = i.getCheckboxes().size();
	for(int k=0;k<count;k++) {
		if(k<2) {
			i.getCheckboxes().get(k).click();
		}
	}
	// click on Delete Button
	i.getDeletebutton().click();
	//Click on Ok
	Alert al = driver.switchTo().alert();
	al.accept();
	Reporter.log("Multiple Invoices are Deleted",true);
}
}
