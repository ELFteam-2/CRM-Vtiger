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
@Listeners(com.vtigerv2.generics.Listener.class)
public class CreateSales extends BaseClass{
@Test
public void testCreateSales() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {
	Reporter.log("Click on More Dropdown",true);
	HomePage h=new HomePage(driver);
    Actions a=new Actions(driver);
    a.moveToElement(h.getMorelink()).perform();
    Reporter.log("Click on Sales Order.",true);
    h.getSalesorderlink().click();
    Reporter.log("Click on Create Sales Order button (Plus Green Button)",true);
    SalesOrderPage so=new SalesOrderPage(driver);
    so.getCreatesalesbtn().click();
    FileLib f=new FileLib();
	   String subject = f.getExceldata("SalesOrder", 1, 0);
	   String BillingAddress = f.getExceldata("SalesOrder", 1, 1);
	   String ShippingAddress = f.getExceldata("SalesOrder", 1, 2);
	   String qty = f.getExceldata("SalesOrder", 1, 3);
	   Reporter.log("Enter valid Subject",true);
    CreateNewSalesPage ns=new CreateNewSalesPage(driver);
    ns.getSubjecttxtbox().sendKeys(subject);
    Reporter.log("Click on Select (Plus Green) Button of the Organization Name.",true);
    ns.getOrganizationbtn().click();
   String parentid = driver.getWindowHandle();
  Set<String> childid = driver.getWindowHandles();
  for(String child:childid) {
	  if(!(parentid.equals(child))) {
		  driver.switchTo().window(child);
		  Reporter.log("Click on Required Organization Name",true);
		  OrgnizationWindowPage o=new OrgnizationWindowPage(driver);
		  o.getSelectOrganizations().click();
		  Reporter.log("Click on Ok",true);
		  Alert al = driver.switchTo().alert();
		  al.accept();
		  driver.close();
	  }
  }
  driver.switchTo().window(parentid);
  Thread.sleep(5000);
  JavascriptExecutor j=(JavascriptExecutor) driver;
  j.executeScript("window.scrollTo(0,10000)");
  Reporter.log("Enter Address Information",true);
  ns.getBillingaddresstxtbox().sendKeys(BillingAddress);
  ns.getShippingaddresstxtbox().sendKeys(ShippingAddress);
  Reporter.log(" Under Item Details add valid Product using Product Symbol",true);
  ns.getProductsicon().click();
  String parentwindow = driver.getWindowHandle();
  Set<String> childwindow = driver.getWindowHandles();
  for(String child:childwindow) {
	  if(!(parentwindow.equals(child))) {
		  driver.switchTo().window(child);
		  ProductWindowPage p=new ProductWindowPage(driver);
		  p.getSelectproduct().click();
	  }
  }
 driver.switchTo().window(parentwindow);
 Reporter.log("Enter Valid Qty",true);
 ns.getQty1().sendKeys(qty);
 Reporter.log("Click on Save.",true);
 ns.getSavebtn().click();
 Reporter.log("Sales order is created",true);
}
}
