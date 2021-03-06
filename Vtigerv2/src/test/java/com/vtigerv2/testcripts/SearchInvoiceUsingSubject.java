package com.vtigerv2.testcripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.vtigerv2.generics.BaseClass;
import com.vtigerv2.generics.FileLib;
import com.vtigerv2.pom.HomePage;
import com.vtigerv2.pom.InvoicePage;
@Listeners(com.vtigerv2.generics.Listener.class)
public class SearchInvoiceUsingSubject extends BaseClass {
	@Test
	public void testSearchInvoiceUsingSubject() throws EncryptedDocumentException, InvalidFormatException, IOException {
		//Click on More Dropdown and Click on Invoice.
			HomePage h=new HomePage(driver);
			Actions a=new Actions(driver);
			a.moveToElement(h.getMorelink()).perform();
			h.getInvoicelink().click();
			//Click on Search For Text Field Enter the Invoice No.
			FileLib f=new FileLib();
			String subject = f.getExceldata("Search", 1, 1);
			InvoicePage i=new InvoicePage(driver);
			i.getSearchtextbox().sendKeys(subject);
			//Click on In DropDown 
			Select s=new Select(i.getSearchindropdown());
			s.selectByVisibleText("Subject");
			// Click on Search Now.
			i.getSearchnowbtn().click();
			Reporter.log("Invoice is Searched using subject",true);
	}
}
