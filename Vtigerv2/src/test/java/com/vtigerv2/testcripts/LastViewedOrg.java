package com.vtigerv2.testcripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.vtigerv2.generics.BaseClass;
import com.vtigerv2.pom.HomePage;
import com.vtigerv2.pom.OrganizationPage;

public class LastViewedOrg extends BaseClass
{
	@Test
	public void testLastViwedOrganization() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		HomePage h=new HomePage(driver);
		//click on organization button
		h.getOrganizationBtn().click();
		Reporter.log("Organization page displayed",true);
		OrganizationPage o1=new OrganizationPage(driver);
		//click on last viewed button
		o1.getLastViewedBtn().click();
		Reporter.log("clicked on last viewed",true);
		//select one item from the list
		o1.getSelectLastViewed().click();
		Reporter.log("selected item",true);
	}
}
