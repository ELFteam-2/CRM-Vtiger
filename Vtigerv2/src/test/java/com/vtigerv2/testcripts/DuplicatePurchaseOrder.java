package com.vtigerv2.testcripts;

import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.vtigerv2.generics.BaseClass;
import com.vtigerv2.pom.HomePage;
import com.vtigerv2.pom.PurchaseOrderPage;
@Listeners(com.vtigerv2.generics.Listener.class)
public class DuplicatePurchaseOrder extends BaseClass {
	@Test
	public void testDuplicatePurchaseOrder() throws InterruptedException {
		//Click on More Dropdown 
		HomePage h=new HomePage(driver);
	    Actions a=new Actions(driver);
	    a.moveToElement(h.getMorelink()).perform();
	    //and Click on purchase order
	    h.getPurchaseorderlink().click();
	    //Click on Subject Name of any Sales Order.
	    PurchaseOrderPage p=new PurchaseOrderPage(driver);
	   int count= p.getPurchaseOrderName().size();
	   for(int i=0; i<count;i++) {
		   if(i<1) {
			   p.getPurchaseOrderName().get(i).click();
		   }
	   }
	   //Click on Duplicate Button.
	  p.getDuplicatebtn().click();
	  //Click on Save
	  p.getSavebtn().click();
	  Reporter.log("Duplicate purchase order is created",true);
	}
}
