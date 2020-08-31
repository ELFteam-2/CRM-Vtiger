package com.vtigerv2.testcripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.Alert;
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
public class SearchDuplicateAndExport extends BaseClass{
	@Test
	public void testSearchDuplicateAndExport() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		//Click on More Dropdown and Click on Invoice.
			HomePage h=new HomePage(driver);
			Actions a=new Actions(driver);
			a.moveToElement(h.getMorelink()).perform();
			h.getInvoicelink().click();
			//Click on Search For Text Field Enter the subject.
			FileLib f=new FileLib();
			String subject = f.getExceldata("Search", 3, 1);
			InvoicePage i=new InvoicePage(driver);
			i.getSearchtextbox().sendKeys(subject);
			//Click on In DropDown 
			Select s=new Select(i.getSearchindropdown());
			// Select subject
			s.selectByVisibleText("Subject");
			// Click on Search Now.
			i.getSearchnowbtn().click();
			Reporter.log("Invoice is searched",true);
			//Click on any one of the Invoice using Subject name.
			int count = i.getSubjectlink().size();
		   for(int k=0;k<count;k++) {
			   if(k<1) {
				   i.getSubjectlink().get(k).click();
			   }
		   }
		   //Click on Duplicate Button.
			i.getDuplicatebtn().click();
			//Click on Save
			i.getSavebtn().click();
			Reporter.log("Duplicate invoice is created",true);
			Thread.sleep(3000);
			//Click on Export to PDF.
			i.getExportpdflink().click();
			//Alert al = driver.switchTo().alert();
			//al.accept();
			Reporter.log("Invoice pdf is exported",true);
	}
}
