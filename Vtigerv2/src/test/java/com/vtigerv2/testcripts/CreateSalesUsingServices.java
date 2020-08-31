package com.vtigerv2.testcripts;

import java.io.IOException;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.vtigerv2.generics.BaseClass;
import com.vtigerv2.generics.FileLib;
import com.vtigerv2.pom.CreateNewSalesPage;
import com.vtigerv2.pom.HomePage;
import com.vtigerv2.pom.OrgnizationWindowPage;
import com.vtigerv2.pom.ProductWindowPage;
import com.vtigerv2.pom.SalesOrderPage;
import com.vtigerv2.pom.ServicesWindowPage;
@Listeners(com.vtigerv2.generics.Listener.class)
public class CreateSalesUsingServices extends BaseClass{
	@Test
	public void testCreateSalesUsingServices() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {
		//Click on More Dropdown 
		HomePage h=new HomePage(driver);
	    Actions a=new Actions(driver);
	    a.moveToElement(h.getMorelink()).perform();
	    // Click on Sales Order.
	    h.getSalesorderlink().click();
	    //Click on Create Sales Order button (Plus Green Button)
	    SalesOrderPage so=new SalesOrderPage(driver);
	    so.getCreatesalesbtn().click();
	    FileLib f=new FileLib();
		   String subject = f.getExceldata("SalesOrder", 1, 0);
		   String BillingAddress = f.getExceldata("SalesOrder", 1, 1);
		   String ShippingAddress = f.getExceldata("SalesOrder", 1, 2);
		   String qty = f.getExceldata("SalesOrder", 1, 3);
		   //Enter valid Subject
	    CreateNewSalesPage ns=new CreateNewSalesPage(driver);
	    ns.getSubjecttxtbox().sendKeys(subject);
	    //Click on Select (Plus Green) Button of the Organization Name.
	    ns.getOrganizationbtn().click();
	   String parentid = driver.getWindowHandle();
	   Set<String> childid = driver.getWindowHandles();
	   for(String child:childid) {
	 	  if(!(parentid.equals(child))) {
	 		  driver.switchTo().window(child);
	 		  //Click on Required Organization Name.
	 		  OrgnizationWindowPage o=new OrgnizationWindowPage(driver);
	 		  o.getSelectOrganizations().click();
	 		  //Click on Ok.
	 		  Alert al = driver.switchTo().alert();
	 		  al.accept();
	 		  driver.close();
	 	  }
	   }
	   driver.switchTo().window(parentid);
	   Thread.sleep(5000);
	   JavascriptExecutor j=(JavascriptExecutor) driver;
	   j.executeScript("window.scrollTo(0,10000)");
	   //Enter Address Information
	   ns.getBillingaddresstxtbox().sendKeys(BillingAddress);
	   ns.getShippingaddresstxtbox().sendKeys(ShippingAddress);
	   ns.getAddservicesbtn().click();
	   ns.getServicesicon().click();
	   String parentwindow = driver.getWindowHandle();
	   Set<String> childwindow = driver.getWindowHandles();
	   for(String child:childwindow) {
	 	  if(!(parentwindow.equals(child))) {
	 		  driver.switchTo().window(child);
	 		  //Under Item Details click on Add Service Button 
	 		 ServicesWindowPage sw=new ServicesWindowPage(driver);
	 		 sw.getSelectservice().click();
	 	  }
	   }
	  driver.switchTo().window(parentwindow);
	  //add qty 
	  ns.getQty2().sendKeys(qty);
	  //Click on Move Upward Arrow button (Delete the Product Item)
	  ns.getArrowicon().click();
	  ns.getDeleteicon().click();
	  //and Click on Save.
	  ns.getSavebtn().click();
	  Thread.sleep(3000);
	  Reporter.log("Sales order is created using services",true);
	}
}
