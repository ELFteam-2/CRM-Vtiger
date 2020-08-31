package com.vtigerv2.testcripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.Alert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.vtigerv2.generics.BaseClass;
import com.vtigerv2.pom.HomePage;
import com.vtigerv2.pom.OrganizationPage;

public class MultipleDeleteOrg extends BaseClass
{
	@Test
	public void testMultipleDeleteOrganization() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		HomePage h=new HomePage(driver);
		//click on organization button
		h.getOrganizationBtn().click();
		Reporter.log("Organization page displayed",true);
		
		OrganizationPage o1=new OrganizationPage(driver);
		//click on check box to select all
		o1.getOrgSelectAllChkbox().click();
		Reporter.log("clicked on check box",true);
		//click on delete button
		o1.getDeleteBtn().click();
		Reporter.log("clicked on delete button",true);
		Alert a=driver.switchTo().alert();
		a.accept();
	}
}
