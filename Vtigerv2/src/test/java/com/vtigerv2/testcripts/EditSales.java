package com.vtigerv2.testcripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.vtigerv2.generics.BaseClass;
import com.vtigerv2.generics.FileLib;
import com.vtigerv2.pom.EditingSalesPage;
import com.vtigerv2.pom.HomePage;
import com.vtigerv2.pom.SalesOrderPage;
@Listeners(com.vtigerv2.generics.Listener.class)
public class EditSales extends BaseClass {
	@Test
	public void testEditSales() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {
		//Click on More Dropdown 
		HomePage h=new HomePage(driver);
	    Actions a=new Actions(driver);
	    a.moveToElement(h.getMorelink()).perform();
	    // Click on Sales Order.
	    h.getSalesorderlink().click();
	    //Click on edit under Action Tab on any of the Sales Order
	    SalesOrderPage s=new SalesOrderPage(driver);
	   int count = s.getEditlink().size();
	   for(int k=0;k<count;k++) {
		   if(k<1) {
			   s.getEditlink().get(k).click();
		   }
	   }
	    JavascriptExecutor j=(JavascriptExecutor) driver;
	    j.executeScript("window.scrollTo(0,10000)");
	   // Enter New Shipping Address under Address Information 
	    FileLib f=new FileLib();
	   String shippingAddress = f.getExceldata("SalesOrder", 2, 2);
	    EditingSalesPage es=new EditingSalesPage(driver);
	    es.getShippingAddresstxtbox().clear();
	    es.getShippingAddresstxtbox().sendKeys(shippingAddress);
	    // Click on Save.
	    es.getSavebtn().click();
	    Reporter.log("Sales order is Edited",true);
	}
}
