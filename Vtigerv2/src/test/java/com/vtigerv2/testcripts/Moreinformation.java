package com.vtigerv2.testcripts;

import java.io.IOException;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.vtigerv2.generics.BaseClass;
import com.vtigerv2.pom.ContactPage;
import com.vtigerv2.pom.HomePage;
import com.vtigerv2.pom.ServicePage;

public class Moreinformation extends BaseClass

{
	@Test
	public void moreInformation() throws EncryptedDocumentException, InvalidFormatException, IOException
	{

		Reporter.log("create a contact");
		HomePage h1 = new HomePage(driver);
		//Actions a=new Actions(driver);
		h1.getContactlink().click();
		
		
	//	 String firstname = f.getExceldata("contact",0,1);
	//	 String lastname = f.getExceldata("contact",1,1);
		 ContactPage c=new  ContactPage(driver);
		 c.getCreatecontact().click();
		
		 c.getFname().sendKeys("meena");
		 c.getLname().sendKeys("tina");
		 c.getSavebtn().click();
		 



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
		//select contacts from dropdown;
		s.getContacts().click();
		//clicks on selectcontacts button
		s.getSelectcontacts().click();
		//To handle parent window
		String parent = driver.getWindowHandle();
		//To handle child windows;
		Set<String> allwh = driver.getWindowHandles();
		for(String wh:allwh)
		{
			if(!(wh.equals(parent)))
			{
				driver.switchTo().window(wh);
				s.getMudu().click();
			}

		}
		for(String wh:allwh)
		{
			if((wh.equals(parent)))

					{
				driver.switchTo().window(wh);


					}}

	}

}
