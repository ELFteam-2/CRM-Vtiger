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

public class ExportOrganizations extends BaseClass
{
	@Test
	public void testExportOrganizations() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		HomePage h=new HomePage(driver);
		//click on organization button
		h.getOrganizationBtn().click();
		Reporter.log("Organization page displayed",true);
		
		OrganizationPage o1=new OrganizationPage(driver);
		//click on export organization button
		o1.getExportOrganizationsBtn().click();
		Reporter.log("clicked on export org button",true);
		ExportOrgPage e1=new ExportOrgPage(driver);
		e1.getExportOrganizationsBtn().click();
		//click on cancel button
		e1.getCancelOrgBtn().click();
		Reporter.log("clicked on cancel button",true);
	}
}
