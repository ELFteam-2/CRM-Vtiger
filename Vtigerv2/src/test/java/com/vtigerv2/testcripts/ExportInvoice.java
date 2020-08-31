package com.vtigerv2.testcripts;

import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.vtigerv2.generics.BaseClass;
import com.vtigerv2.pom.HomePage;
import com.vtigerv2.pom.InvoicePage;
@Listeners(com.vtigerv2.generics.Listener.class)
public class ExportInvoice extends BaseClass {
	@Test
	public void testExportInvoice() {
		//Click on More Dropdown and Click on Invoice.
		HomePage h=new HomePage(driver);
		Actions a=new Actions(driver);
		a.moveToElement(h.getMorelink()).perform();
		h.getInvoicelink().click();
		//Click on Subject Name of any Invoice.
		InvoicePage i=new InvoicePage(driver);
		int count = i.getSubjectlink().size();
		for(int k=0;k<count;k++) {
			if(k<1) {
				i.getSubjectlink().get(k).click();
			}
		}
		//Click on Export to PDF.
		i.getExportpdflink().click();
		Reporter.log("Invoice is Exported",true);
	}
}
