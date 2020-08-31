package com.vtigerv2.testcripts;

import java.io.IOException;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.vtigerv2.generics.BaseClass;
import com.vtigerv2.generics.FileLib;
import com.vtigerv2.pom.HomePage;
import com.vtigerv2.pom.PurchaseOrderPage;
@Listeners(com.vtigerv2.generics.Listener.class)
public class SendPurchaseMail extends BaseClass {
	@Test
	public void testSendPurchaseMail() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {
		HomePage h=new HomePage(driver);
	    Actions a=new Actions(driver);
	    a.moveToElement(h.getMorelink()).perform();
	    h.getPurchaseorderlink().click();
	    PurchaseOrderPage p=new PurchaseOrderPage(driver);
	   int count= p.getPurchaseOrderName().size();
	   for(int i=0; i<count;i++) {
		   if(i<1) {
			   p.getPurchaseOrderName().get(i).click();
		   }
	   }
	   p.getSendemaillink().click();
	   String parentwindow = driver.getWindowHandle();
	    Set<String> childwindow = driver.getWindowHandles();
	    for(String child:childwindow) {
	    	if(!(parentwindow.equals(child))) {
	    		driver.switchTo().window(child);
	    		FileLib f=new FileLib();
				String toaddress = f.getExceldata("Email", 1, 0);
				String subject = f.getExceldata("Email", 1, 1);
	    		p.getTotextbox().sendKeys(toaddress);
	    		p.getSubjecttextbox().sendKeys(subject);
	    		p.getSendbtn().click();
	    	}
	    }
	    driver.switchTo().window(parentwindow);
	}
}
