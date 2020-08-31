package com.vtigerv2.testcripts;

import java.io.IOException;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.vtigerv2.generics.BaseClass;
import com.vtigerv2.generics.FileLib;
import com.vtigerv2.pom.CreateNewPurchasePage;
import com.vtigerv2.pom.HomePage;
import com.vtigerv2.pom.PurchaseOrderPage;
@Listeners(com.vtigerv2.generics.Listener.class)
public class CreatePurchaseOrder extends BaseClass {
	@Test
	public void testCreatePurchaseOrder() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {
		Reporter.log("Click on More Dropdown ",true);
		HomePage h=new HomePage(driver);
	    Actions a=new Actions(driver);
	    a.moveToElement(h.getMorelink()).perform();
	    Reporter.log("Click on Purchase Order ",true);
	    h.getPurchaseorderlink().click();
	    Reporter.log("Click on Create Purchase Order button (Plus Green Button)",true);
	    PurchaseOrderPage p=new PurchaseOrderPage(driver);
	    p.getCreatepurchasebtn().click();
	    FileLib f=new FileLib();
	   String subject = f.getExceldata("PurchaseOrder", 1, 0);
	   String BillingAddress = f.getExceldata("PurchaseOrder", 1, 1);
	   String ShippingAddress = f.getExceldata("PurchaseOrder", 1, 2);
	   String qty = f.getExceldata("PurchaseOrder", 1, 3);
	   Reporter.log("Enter Subject.",true);
	    CreateNewPurchasePage np=new CreateNewPurchasePage(driver);
	    np.getSubjecttextbox().sendKeys(subject);
	    Reporter.log("Click on Select (Plus Green) Button of the Vendor Name.",true);
	    np.getAddvendoricon().click();
	    String parentwindow = driver.getWindowHandle();
	    Set<String> childwindow = driver.getWindowHandles();
	    for(String child:childwindow) {
	    	if(!(parentwindow.equals(child))) {
	    		driver.switchTo().window(child);
	    		Reporter.log("Click on Required Vendor Name",true);
	    		np.getSelectvendor().click();
	    	}
	    }
	    driver.switchTo().window(parentwindow);
	    Reporter.log("Enter Billing and Shipping address",true);
	    np.getBillingaddresstxtbox().sendKeys(BillingAddress);
	    np.getShippingaddresstxtbox().sendKeys(ShippingAddress);
	    JavascriptExecutor j=(JavascriptExecutor) driver;
	    j.executeScript("window.scrollTo(0,10000)");
	    Reporter.log("Under Item Details add valid Product using Product Symbol ",true);
	    np.getProductsicon().click();
	    String parentwindow1 = driver.getWindowHandle();
	    Set<String> childwindow1 = driver.getWindowHandles();
	    for(String child:childwindow1) {
	    	if(!(parentwindow.equals(child))) {
	    		driver.switchTo().window(child);
	    		np.getSelectproduct().click();
	    	}
	    }
	    driver.switchTo().window(parentwindow1);
	    Reporter.log("Enter Valid Qty",true);
	    np.getQty1().sendKeys(qty);
	    Reporter.log("Click on Save",true); 
	    np.getSavebtn().click();
	    Reporter.log("Purchase Order is Created",true);
	}
}
