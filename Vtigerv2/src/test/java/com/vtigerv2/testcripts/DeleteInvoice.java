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
public class DeleteInvoice extends BaseClass{
@Test
public void testDeleteInvoice() {
	//Click on More Dropdown and Click on Invoice.
	HomePage h=new HomePage(driver);
	Actions a=new Actions(driver);
	a.moveToElement(h.getMorelink()).perform();
	h.getInvoicelink().click();
	//Click on del under Action Tab on any of the Invoice.
	InvoicePage i=new InvoicePage(driver);
	int count = i.getDeletelink().size();
	for(int k=0;k<count;k++) {
		if(k<1) {
			i.getDeletelink().get(k).click();
		}
	}
	//Click on OK.
	Alert al = driver.switchTo().alert();
	al.accept();
	Reporter.log("Invoice is Deleted",true);
}
}
