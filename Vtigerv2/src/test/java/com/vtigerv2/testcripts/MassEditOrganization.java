package com.vtigerv2.testcripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Reporter;
import org.testng.annotations.Test;
import com.vtigerv2.generics.BaseClass;
import com.vtigerv2.pom.HomePage;
import com.vtigerv2.pom.MassEditOrganizationPage;
import com.vtigerv2.pom.OrganizationPage;

public class MassEditOrganization extends BaseClass
{
	@Test
	public void testMassEditOrg() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		HomePage h=new HomePage(driver);
		//click on organization button
		h.getOrganizationBtn().click();
		Reporter.log("Organization page displayed",true);
		
		OrganizationPage o1=new OrganizationPage(driver);
		//click on check box to select all
		o1.getOrgSelectAllChkbox().click();
		Reporter.log("clicked on check box",true);
		//click on mass edit button
		o1.getMassEditBtn().click();
		Reporter.log("clicked on mass edit",true);
		
		MassEditOrganizationPage m1=new MassEditOrganizationPage(driver);
		String EmailData=f.getExceldata("Sheet1", 1, 2);
		//enter the email-id into email-id text box
		m1.getEmailIdTxtbox().sendKeys(EmailData);
		Reporter.log("entered email-id",true);
		//click on save button
		m1.getSaveBtn();
		Reporter.log("clicked on save  utton",true);
	}
}
