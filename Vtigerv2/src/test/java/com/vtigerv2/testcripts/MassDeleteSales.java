package com.vtigerv2.testcripts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.vtigerv2.generics.BaseClass;
import com.vtigerv2.pom.HomePage;
import com.vtigerv2.pom.SalesOrderPage;
@Listeners(com.vtigerv2.generics.Listener.class)
public class MassDeleteSales extends BaseClass {
	@Test
	public void testMassDeleteSales() throws InterruptedException {
		//Click on More Dropdown
		HomePage h=new HomePage(driver);
	    Actions a=new Actions(driver);
	    a.moveToElement(h.getMorelink()).perform();
	    // Click on Sales Order.
	    h.getSalesorderlink().click();
	    //Click on Checkboxes of Multiple Sales Order(Select 2) 
	    SalesOrderPage s=new SalesOrderPage(driver);
	    int count=s.getCheckboxes().size();
	    for(int i=0;i<count;i++) {
	    	if(i<2) {
	    		s.getCheckboxes().get(i).click();
	    	}
	    }
	    // click on Delete Button
	    s.getDeletebtn().click();
	    //Click on Ok
	    Alert al = driver.switchTo().alert();
	    al.accept();
	}
}
