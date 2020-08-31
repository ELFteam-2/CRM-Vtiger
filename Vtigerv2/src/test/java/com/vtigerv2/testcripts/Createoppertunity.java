package com.vtigerv2.testcripts;

import java.io.IOException;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;

import com.vtigerv2.generics.BaseClass;
import com.vtigerv2.pom.HomePage;
import com.vtigerv2.pom.OpertunityPage;

public class Createoppertunity extends BaseClass
{
	@Test
	public void createOppurtunity() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		//String opertunityname = f.getExceldata("oppertunity",0,1);

		HomePage h = new HomePage(driver);
		h.getCreateaoppurtunity().click();
		OpertunityPage o = new  OpertunityPage(driver);

		o.getCreateopportunityplus().click();

		o.getOpurtunityname().sendKeys("MG tyers");
		o.getSelectplusbutton().click();
		String parent = driver.getWindowHandle();
		Set<String> wh = driver.getWindowHandles();
		//int count = wh.size();
		for(String allwh:wh) 
		{
			if(!(allwh.equals(parent)))
			{
				driver.switchTo().window(allwh);
				o.getSamsung().click();
				
			}
			
			o.getSave().click();
			
			





	}

	}
}
