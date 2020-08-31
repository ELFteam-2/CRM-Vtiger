package com.vtigerv2.testcripts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.vtigerv2.generics.BaseClass;
import com.vtigerv2.pom.HomePage;
import com.vtigerv2.pom.SalesOrderPage;
@Listeners(com.vtigerv2.generics.Listener.class)
public class DeleteSales extends BaseClass {
	@Test
	public void testDeleteSales() throws InterruptedException {
		//Click on More Dropdown 
		HomePage h=new HomePage(driver);
	    Actions a=new Actions(driver);
	    a.moveToElement(h.getMorelink()).perform();
	    // Click on Sales Order.
	    h.getSalesorderlink().click();
	    //Click on del under Action Tab on any of the Sales Order.
	    SalesOrderPage s=new SalesOrderPage(driver);
	    int count = s.getDeletelink().size();
		for(int k=0;k<count;k++) {
			if(k<1) {
				s.getDeletelink().get(k).click();
			}
		}
		//Click on OK.
		Alert al = driver.switchTo().alert();
		al.accept();
	 Reporter.log("Sales order is deleted",true);
	}
}
