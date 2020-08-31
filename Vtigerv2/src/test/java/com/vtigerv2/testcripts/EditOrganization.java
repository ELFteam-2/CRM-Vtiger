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

public class EditOrganization extends BaseClass
{
	@Test
	public void testEditOrganization() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		HomePage h=new HomePage(driver);
		//click on organization button
		h.getOrganizationBtn().click();
		Reporter.log("Organization page displayed",true);
		
		OrganizationPage o1=new OrganizationPage(driver);
		//click on check box
		o1.getOrgSelectCheckbox().click();
		Reporter.log("clicked on check box",true);
		//click on edit link
		o1.getEditLink().click();
		Reporter.log("clicked on edit link",true);
		Thread.sleep(2000);
		OrganizationInfoPage o2=new OrganizationInfoPage(driver);
		String EditData=f.getExceldata("Sheet1", 2, 1);
		//enter billing address into billing address text field
		o2.getBillingAddtxtbx().sendKeys(EditData);
		Reporter.log("entered billing address",true);
		//click on save button
		o2.getSavebtn().click();
		Reporter.log("clicked on save button",true);
		Thread.sleep(3000);
	}
}
