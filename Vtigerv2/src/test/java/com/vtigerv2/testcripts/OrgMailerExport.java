package com.vtigerv2.testcripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.vtigerv2.generics.BaseClass;
import com.vtigerv2.pom.ExportOrgPage;
import com.vtigerv2.pom.HomePage;
import com.vtigerv2.pom.OrganizationPage;

public class OrgMailerExport extends BaseClass
{
	@Test
	public void testMailerExportOrganization() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		HomePage h=new HomePage(driver);
		//click on organization button
		h.getOrganizationBtn().click();
		Reporter.log("Organization page displayed",true);
		OrganizationPage o1=new OrganizationPage(driver);
		//click on mailer export button
		o1.getMailerExportBtn().click();
		Reporter.log("clicked on mailer export",true);
		
		ExportOrgPage e1=new ExportOrgPage(driver);
		//click on export button
		e1.getExportBtn1().click();
		Reporter.log("clicked on export",true);
		//click on cancel button
		e1.getCancelBtn1().click();
		Reporter.log("clicked on cancel button",true);
	}
}
