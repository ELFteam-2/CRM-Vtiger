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
import com.vtigerv2.pom.InvoicePage;
@Listeners(com.vtigerv2.generics.Listener.class)
public class SendInvoiceMail extends BaseClass{
	@Test
	public void testSendInvoiceMail() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {
		//Click on More Dropdown and Click on Invoice.
		HomePage h=new HomePage(driver);
		Actions a=new Actions(driver);
		a.moveToElement(h.getMorelink()).perform();
		h.getInvoicelink().click();
		//Click on Subject Name of any Invoice.
		InvoicePage i=new InvoicePage(driver);
		int count = i.getSubjectlink().size();
		for(int k=0;k<count;k++) {
			if(k<1) {
				i.getSubjectlink().get(k).click();
			}
		}
		//Click on Send Email with PDF
		i.getSendemail().click();
		//Enter valid details of Email 
		String parentid = driver.getWindowHandle();
		Set<String> childid = driver.getWindowHandles();
		for(String child:childid) {
			if(!parentid.equalsIgnoreCase(child)) {
				Thread.sleep(3000);
				driver.switchTo().window(child);
				Thread.sleep(6000);
				FileLib f=new FileLib();
				String toaddress = f.getExceldata("Email", 1, 0);
				String subject = f.getExceldata("Email", 1, 1);
				i.getTotextbox().sendKeys(toaddress);
				i.getSubjecttextbox().sendKeys(subject);
				// Click on Send.
				i.getSendbtn().click();
				driver.close();
			}
		}
		driver.switchTo().window(parentid);
	}
}
