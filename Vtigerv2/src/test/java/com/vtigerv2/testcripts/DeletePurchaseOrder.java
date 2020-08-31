package com.vtigerv2.testcripts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.vtigerv2.generics.BaseClass;
import com.vtigerv2.pom.EditingPurchasePage;
import com.vtigerv2.pom.HomePage;
import com.vtigerv2.pom.PurchaseOrderPage;
@Listeners(com.vtigerv2.generics.Listener.class)
public class DeletePurchaseOrder extends BaseClass {
	@Test
	public void testDeletePurchaseOrder() throws InterruptedException {
		//Click on More Dropdown 
		HomePage h=new HomePage(driver);
	    Actions a=new Actions(driver);
	    a.moveToElement(h.getMorelink()).perform();
	    //and Click on Purchase Order.
	    h.getPurchaseorderlink().click();
	    //Click on del under Action Tab on any of the Purchase Order.
	    PurchaseOrderPage p=new PurchaseOrderPage(driver);
	   int count= p.getDeletelink().size();
	   for(int i=0; i<count;i++) {
		   if(i<1) {
			   p.getDeletelink().get(i).click();
		   }
	   }
	   //Click on OK.
	  Alert al = driver.switchTo().alert();
	  al.accept();
	  Reporter.log("Purchase order is deleted",true);
	}
}
