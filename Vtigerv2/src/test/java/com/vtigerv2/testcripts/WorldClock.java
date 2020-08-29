package com.vtigerv2.testcripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.vtigerv2.generics.BaseClass;
import com.vtigerv2.pom.HomePage;
import com.vtigerv2.pom.OrganizationPage;

public class WorldClock extends BaseClass
{
	@Test
	public void testWorldColckOrganization() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		HomePage h=new HomePage(driver);
		//click on organization button
		h.getOrganizationBtn().click();
		Reporter.log("Organization page displayed",true);
		
		OrganizationPage o1=new OrganizationPage(driver);
		//click on world clock button
		o1.getShowWorldClk().click();
		Reporter.log("clicked on world clock",true);
		WebElement ClkListBox=o1.getClkListBox();
		Select s=new Select(ClkListBox);
		//select india from the list
		s.selectByVisibleText("India");
	}
}
