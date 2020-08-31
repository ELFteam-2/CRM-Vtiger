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
import com.vtigerv2.pom.SalesOrderPage;
@Listeners(com.vtigerv2.generics.Listener.class)
public class SendSalesMail extends BaseClass{
	@Test
	public void testSendSalesMail() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {
		HomePage h=new HomePage(driver);
	    Actions a=new Actions(driver);
	    a.moveToElement(h.getMorelink()).perform();
	    h.getSalesorderlink().click();
	    SalesOrderPage s=new SalesOrderPage(driver);
	   int count= s.getSalesordername().size();
	   for(int i=0;i<count;i++) {
		   if(i<1) {
			   s.getSalesordername().get(i).click();
		   }
	   }
	   s.getSendemaillink().click();
	   String parentwindow = driver.getWindowHandle();
	   Set<String> childwindow = driver.getWindowHandles();
	   for(String child:childwindow) {
		   if(!(parentwindow.equals(child))) {
			   driver.switchTo().window(child);
			   Thread.sleep(3000);
			   FileLib f=new FileLib();
				String toaddress = f.getExceldata("Email", 1, 0);
				String subject = f.getExceldata("Email", 1, 1);
			   s.getTotextbox().sendKeys(toaddress);
			   s.getSubjecttextbox().sendKeys(subject);
			   s.getSendbtn().click();
			   driver.close();
		   }
	   }
	   driver.switchTo().window(parentwindow);
	}
}
