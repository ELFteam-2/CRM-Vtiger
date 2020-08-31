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
import com.vtigerv2.pom.MassEditPage;
import com.vtigerv2.pom.NewCustomViewPage;
@Listeners(com.vtigerv2.generics.Listener.class)
public class MassEditAndDeleteFilter extends BaseClass {
	@Test
	public void testMassEditAndDeleteFilter() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		//Click on More Dropdown and Click on Invoice.
		HomePage h=new HomePage(driver);
		Actions a=new Actions(driver);
		a.moveToElement(h.getMorelink()).perform();
		h.getInvoicelink().click();
		//Click on Checkboxes of Multiple Invoices 
		InvoicePage i=new InvoicePage(driver);
		int count = i.getCheckboxes().size();
		for(int j=0;j<count;j++) {
			if(j<3) {
				i.getCheckboxes().get(j).click();
			}
		}
	    // click on Mass Edit Button
		i.getMasseditbtn().click();
		//Click on Subject text Field, Enter a Subject Name 
		FileLib f=new FileLib();
		String subject = f.getExceldata("CreateInvoice", 3, 0);
		MassEditPage me=new MassEditPage(driver);
		me.getSubjectCheckbox().click();
		me.getSubjecttxtbox().sendKeys(subject);
		// Click on Save.
		me.getSavebtn().click();
		Reporter.log("multiple invoices are edited",true);
		//Click on Filter Dropdown 
		Select s=new Select(i.getFilterdropdown());
		// Select a Created Filter(Quick).
		s.selectByVisibleText("quick");
		//Click on Delete Next to Filter Dropdown
		i.getDelete().click();	
		Alert al = driver.switchTo().alert();
		al.accept();
		Reporter.log("Filter is deleted",true);
	}
}
