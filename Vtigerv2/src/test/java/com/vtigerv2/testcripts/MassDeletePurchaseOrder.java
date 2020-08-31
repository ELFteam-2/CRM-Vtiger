package com.vtigerv2.testcripts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.vtigerv2.generics.BaseClass;
import com.vtigerv2.pom.HomePage;
import com.vtigerv2.pom.PurchaseOrderPage;
@Listeners(com.vtigerv2.generics.Listener.class)
public class MassDeletePurchaseOrder extends BaseClass{
	@Test
	public void testMassDeletePurchaseOrder() throws InterruptedException {
		//Click on More Dropdown 
		HomePage h=new HomePage(driver);
	    Actions a=new Actions(driver);
	    a.moveToElement(h.getMorelink()).perform();
	    //and Click on Purchase Order.
	    h.getPurchaseorderlink().click();
	    //Click on Checkboxes of Multiple Purchase Order(Select 2)
	    PurchaseOrderPage p=new PurchaseOrderPage(driver);
	   int count = p.getCheckboxes().size();
	   for(int i=0;i<count;i++) {
		   if(i<2) {
			   p.getCheckboxes().get(i).click();
		   }
	   }
	   // and click on Delete Button
	   p.getDeletebtn().click();
	   //Click on Ok.
	   Alert al = driver.switchTo().alert();
	   al.accept();
	   Reporter.log("Multiple Purchase orders are deleted",true);
	}
}
