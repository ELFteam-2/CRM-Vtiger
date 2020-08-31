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
import com.vtigerv2.pom.NewCustomViewPage;
@Listeners(com.vtigerv2.generics.Listener.class)
public class CreateInvoiceFilter extends BaseClass {
	@Test
	public void testCreateInvoiceFilter() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		Reporter.log("Click on More Dropdown and Click on Invoice.",true);
		HomePage h=new HomePage(driver);
		Actions a=new Actions(driver);
		a.moveToElement(h.getMorelink()).perform();
		h.getInvoicelink().click();
		Reporter.log("Click on Create filter",true);
		InvoicePage i=new InvoicePage(driver);
		i.getCreatefilterlink().click();
		Reporter.log("Enter Filter Details",true);
		FileLib f=new FileLib();
		String ViewName = f.getExceldata("Filter", 1, 0);
		NewCustomViewPage cv=new NewCustomViewPage(driver);
		cv.getViewnametxtbox().sendKeys(ViewName);
		Reporter.log("Enter Simple Time Filter",true);
		Select s=new Select(cv.getSelectdurationdropdown());
		s.selectByVisibleText("Last 30 Days");
		Reporter.log("Click on Save Button.",true);
		cv.getSavebtn().click();
		Reporter.log("Invoice Filter is Created",true);
	}
}
