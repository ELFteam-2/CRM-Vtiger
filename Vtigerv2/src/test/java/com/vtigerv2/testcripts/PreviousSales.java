package com.vtigerv2.testcripts;

import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.vtigerv2.generics.BaseClass;
import com.vtigerv2.pom.HomePage;
import com.vtigerv2.pom.SalesOrderPage;
@Listeners(com.vtigerv2.generics.Listener.class)
public class PreviousSales extends BaseClass {
	@Test
	public void testPreviousSales() throws InterruptedException {
		//Click on More Dropdown 
		HomePage h=new HomePage(driver);
	    Actions a=new Actions(driver);
	    a.moveToElement(h.getMorelink()).perform();
	    // Click on Sales Order.
	    h.getSalesorderlink().click();
	    //Click on Subject Name of any Sales Order Other than the First.
	    SalesOrderPage s=new SalesOrderPage(driver);
	   int count= s.getSalesordername().size();
	   for(int i=0;i<count;i++) {
		   if(i==2) {
			   s.getSalesordername().get(i).click();
		   }
	   }
	   //Click on 'Previous' Icon 
	   s.getPreviousicon().click();
	   Reporter.log("Previous sales order is displayed",true);
	}
}
