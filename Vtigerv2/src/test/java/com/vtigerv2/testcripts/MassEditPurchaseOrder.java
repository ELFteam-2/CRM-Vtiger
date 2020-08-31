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
import com.vtigerv2.pom.HomePage;
import com.vtigerv2.pom.MassEditPage;
import com.vtigerv2.pom.PurchaseOrderPage;
@Listeners(com.vtigerv2.generics.Listener.class)
public class MassEditPurchaseOrder extends BaseClass{
	@Test
	public void testMassEditPurchaseOrder() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {
		//Click on More Dropdown 
		HomePage h=new HomePage(driver);
	    Actions a=new Actions(driver);
	    a.moveToElement(h.getMorelink()).perform();
	    //and Click on Purchase Order.
	    h.getPurchaseorderlink().click();
	    //Click on Checkboxes of Multiple Purchase Order 
	    PurchaseOrderPage p=new PurchaseOrderPage(driver);
	   int count = p.getCheckboxes().size();
	   for(int i=0;i<count;i++) {
		   if(i<2) {
			   p.getCheckboxes().get(i).click();
		   }
	   }
	   //and click on Mass Edit Button
	   p.getMasseditbtn().click();
	   FileLib f=new FileLib();
	   String subject = f.getExceldata("PurchaseOrder", 3, 0);
	   //Click on Subject text Field, Enter a Subject Name 
	   MassEditPage m=new MassEditPage(driver);
	   m.getSubjectCheckbox().click();
	   m.getSubjecttxtbox().sendKeys(subject);
	   //and Click on Save.
	   m.getSavebtn().click();
	  Reporter.log("Multiple purchase orders are edited",true);
	}
}
