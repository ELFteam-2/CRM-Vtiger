package com.vtigerv2.testcripts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.vtigerv2.generics.BaseClass;
import com.vtigerv2.pom.HomePage;
import com.vtigerv2.pom.SalesOrderPage;
@Listeners(com.vtigerv2.generics.Listener.class)
public class DeleteInvoiceFilter extends BaseClass {
	@Test
	public void testDeleteInvoiceFilter() throws InterruptedException {
		//Click on More Dropdown 
		HomePage h=new HomePage(driver);
	    Actions a=new Actions(driver);
	    a.moveToElement(h.getMorelink()).perform();
	    //Click on Sales Order.
	    h.getSalesorderlink().click();
	    //Select any Created Filter 
	    SalesOrderPage s=new SalesOrderPage(driver);
	    Select se=new Select(s.getFilterdropdown());
	    se.selectByVisibleText("quick");
	    //Click on delete.
	    s.getDelete().click();
	    //click on ok
	    Alert al = driver.switchTo().alert();
	    al.accept();
	    Reporter.log("sales filter is deleted",true);
	}
}
