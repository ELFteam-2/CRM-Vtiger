package com.vtigerv2.testcripts;

import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.vtigerv2.generics.BaseClass;
import com.vtigerv2.pom.HomePage;
import com.vtigerv2.pom.PurchaseOrderPage;
@Listeners(com.vtigerv2.generics.Listener.class)
public class ExportPurchaseOrder extends BaseClass {
	@Test
	public void testExportPurchaseOrder() throws InterruptedException {
		//Click on More Dropdown .
		HomePage h=new HomePage(driver);
	    Actions a=new Actions(driver);
	    a.moveToElement(h.getMorelink()).perform();
	    //and Click on Purchase Order
	    h.getPurchaseorderlink().click();
	    //Click on Subject Name of any Purchase Order.
	    PurchaseOrderPage p=new PurchaseOrderPage(driver);
	   int count= p.getPurchaseOrderName().size();
	   for(int i=0; i<count;i++) {
		   if(i<1) {
			   p.getPurchaseOrderName().get(i).click();
		   }
	   }
	   //Click on Export to PDF.
	   p.getExportpdflink().click();
	   Reporter.log("purchase order pdf is exported",true);
	}
}
