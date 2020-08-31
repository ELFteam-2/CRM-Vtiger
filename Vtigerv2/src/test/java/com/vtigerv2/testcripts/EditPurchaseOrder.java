package com.vtigerv2.testcripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.vtigerv2.generics.BaseClass;
import com.vtigerv2.generics.FileLib;
import com.vtigerv2.pom.EditingPurchasePage;
import com.vtigerv2.pom.HomePage;
import com.vtigerv2.pom.PurchaseOrderPage;
@Listeners(com.vtigerv2.generics.Listener.class)
public class EditPurchaseOrder extends BaseClass {
	@Test
	public void testEditPurchaseOrder() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {
		//Click on More Dropdown 
		HomePage h=new HomePage(driver);
	    Actions a=new Actions(driver);
	    a.moveToElement(h.getMorelink()).perform();
	    //Click on Purchase Order.
	    h.getPurchaseorderlink().click();
	    //Click on edit under Action Tab on any of the Purchase Order
	    PurchaseOrderPage p=new PurchaseOrderPage(driver);
	   int count= p.getEditlink().size();
	   for(int i=0; i<count;i++) {
		   if(i<1) {
			   p.getEditlink().get(i).click();
		   }
	   }
	   FileLib f=new FileLib();
	   String subject = f.getExceldata("PurchaseOrder", 2, 0);
	   //Enter New Subject 
	   EditingPurchasePage ep=new EditingPurchasePage(driver);
	   ep.getSubjecttextbox().clear();
	   ep.getSubjecttextbox().sendKeys(subject);
	   //and Click on Save.
	   ep.getSavebtn().click();
	   Reporter.log("Purchase order is Edited",true);
	}
}
