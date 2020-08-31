package com.vtigerv2.testcripts;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.vtigerv2.generics.BaseClass;
import com.vtigerv2.pom.HomePage;
import com.vtigerv2.pom.ServicePage;

public class moreinfoinvoice_cancel extends BaseClass

{
@Test
public void invoiceCancel()
{
	HomePage h = new HomePage(driver);
	//to perform mousehover action using actions class
	Actions a = new Actions(driver);
	//mousehover to morelink
	a.moveToElement(h.getMorelink()).perform();
	//creating servicepage object
	ServicePage s = new ServicePage(driver);
	//click on services link
	s.getServices().click();
	//click on repairlink in service page
	s.getRepairlink().click();
	//mousehover to moreinformationlink
	a.moveToElement(s.getMoreinformation()).perform();	
	
	s.getInvoicedrop().click();
	s.getInvoiceadd().click();
	s.getInvoicesubject().sendKeys("sales");
	s.getInvoiceorganisationplus().click();
	String parent = driver.getWindowHandle();
	Set<String> allwh = driver.getWindowHandles();
	
	for(String wh:allwh)
	{
		if(!(wh.equals(parent)))
		{
			driver.switchTo().window(wh);
			s.getUnacademy().click();
			Alert ale = driver.switchTo().alert();
			ale.accept();
		}
	}
	
	for(String wh:allwh)
	{
		if((wh.equals(parent)))
		{
			driver.switchTo().window(wh);
			
		}
	}
  
	s.getInvoicebillingaddress().sendKeys("rtnagar");
	s.getShippingaddress().sendKeys("rtnagar");
s.getListprice1().sendKeys("3450");
s.getCancel().click();



}
}
