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
import com.vtigerv2.pom.CreateNewInvoicePage;
import com.vtigerv2.pom.HomePage;
import com.vtigerv2.pom.InvoicePage;
import com.vtigerv2.pom.OrgnizationWindowPage;
import com.vtigerv2.pom.ProductWindowPage;
@Listeners(com.vtigerv2.generics.Listener.class)
public class CreateInvoiceAndDelete extends BaseClass {
	@Test
	public void testCreateInvoiceAndDelete() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {
		Reporter.log("Click on More Dropdown and Click on Invoice.",true);
		HomePage h=new HomePage(driver);
		Actions a=new Actions(driver);
		a.moveToElement(h.getMorelink()).perform();
		h.getInvoicelink().click();
		Reporter.log("Click on Create Invoice button (Plus Green Button)",true);
		InvoicePage ivp=new InvoicePage(driver);
		ivp.getCreateInvoiceBtn().click();
		FileLib f=new FileLib();
		String subject = f.getExceldata("CreateInvoice", 1, 0);
		String billingaddress = f.getExceldata("CreateInvoice", 1, 1);
		String shippingaddress = f.getExceldata("CreateInvoice", 1, 2);
		String qty = f.getExceldata("CreateInvoice", 1, 3);
		Reporter.log("Enter Subject",true); 
		CreateNewInvoicePage cni=new CreateNewInvoicePage(driver);
		cni.getSubjecttextbox().sendKeys(subject);
		Reporter.log("Click on Select (Plus Green) Button of the Organization Name.",true);
		cni.getOrgnisationname().click();
		Thread.sleep(5000);
		String pw = driver.getWindowHandle();
		Set<String> cw=driver.getWindowHandles();
		for(String child1:cw) {
			if(!(pw.equals(child1))) {
				driver.switchTo().window(child1);
				Reporter.log("Click on Required Organization Name",true);
				OrgnizationWindowPage o=new OrgnizationWindowPage(driver);
				o.getSelectOrganizations().click();
				Reporter.log("Click on Ok.",true);
				Alert al = driver.switchTo().alert();
				al.accept();
				driver.close();
			}
		}
		Thread.sleep(5000);
		driver.switchTo().window(pw);
		Reporter.log("Enter Address Information",true);
	    cni.getBillingAddresstxtbox().sendKeys(billingaddress);
	    cni.getShippingAddresstxtbox().sendKeys(shippingaddress);
	    JavascriptExecutor j=(JavascriptExecutor) driver;
	    j.executeScript("window.scrollTo(0,10000)");
	    Reporter.log("Under Item details click on Product Icon ",true);
	    cni.getProductsicon().click();
	    Thread.sleep(3000);
	      String parentwindow = driver.getWindowHandle();
		   Set<String> childwindow=driver.getWindowHandles();
			for(String child:childwindow) {
				if(!(parentwindow.equals(child))) {
					driver.switchTo().window(child);
					 Reporter.log("Select the Required Product Using Product Name ",true);
					ProductWindowPage p=new ProductWindowPage(driver);
				    p.getSelectproduct().click();
				}
			}  
	    Thread.sleep(5000);
	    driver.switchTo().window(parentwindow);
	    Reporter.log("Enter the Qty ",true);
	    cni.getQty().sendKeys(qty);
	    Reporter.log("Click on Save Button",true);
	    cni.getSavebtn().click();
	    Thread.sleep(3000);
	    Reporter.log("Click on Invoice Tab and Click on Invoice No",true);
	    ivp.getInvoicetab().click();
	    ivp.getInvoicenolink().click();
	    Reporter.log("Select the Checkbox of the  Created Invoice",true);
	    int count = ivp.getCheckboxes().size();
	    for(int k=0;k<count;k++) {
	    	if(k==count) {
	    		ivp.getCheckboxes().get(k).click();
	    	}
	    }
	    Thread.sleep(5000);
	    Reporter.log("Click on Delete Button.",true); 
	    ivp.getDeletebutton().click();
	    Alert al = driver.switchTo().alert();
		al.accept();
		Reporter.log("Invoice is Created and Deleted",true);
	}
}
