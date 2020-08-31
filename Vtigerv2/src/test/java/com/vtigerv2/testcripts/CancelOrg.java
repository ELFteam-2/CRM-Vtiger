package com.vtigerv2.testcripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.vtigerv2.generics.BaseClass;
import com.vtigerv2.pom.HomePage;
import com.vtigerv2.pom.OrganizationInfoPage;
import com.vtigerv2.pom.OrganizationPage;

public class CancelOrg extends BaseClass
{
	@Test
	public void testCancelOrganization() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		HomePage h=new HomePage(driver);
		//click on organization button
		h.getOrganizationBtn().click();
		Reporter.log("Organization Page displayed",true);
		OrganizationPage o1=new OrganizationPage(driver);
		//click on create new Organization button
		o1.getOrgNewBtn().click();
		Reporter.log("clicked on create new Organization button",true);
		OrganizationInfoPage o2=new OrganizationInfoPage(driver);
		String OrgName=f.getExceldata("Sheet1", 2, 0);
		//enter organization name into organization name text field
		o2.getOrgNameTxtbx().sendKeys(OrgName);
		Reporter.log("entered org name",true);
		//click on cancel button
		o2.getCancelbtn().click();
		Reporter.log("clicked on cancel button",true);
	}
}
