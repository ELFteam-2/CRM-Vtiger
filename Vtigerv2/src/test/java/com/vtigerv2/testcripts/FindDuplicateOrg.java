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

public class FindDuplicateOrg extends BaseClass
{
	@Test
	public void testDuplicateOrganization() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		HomePage h=new HomePage(driver);
		//click on organization button
		h.getOrganizationBtn().click();
		Reporter.log("Organization page displayed",true);
		OrganizationPage o1=new OrganizationPage(driver);
		//click on find duplicates button
		o1.getFindDuplicatesBtn1().click();
		Reporter.log("clicked on find duplicates",true);
		WebElement DuplicateListBox=o1.getFindDuplicatesListBox();
		Select s=new Select(DuplicateListBox);
		s.selectByVisibleText("Website");
		//click on move button
		o1.getFindDuplicatesMoveBtn().click();
		Reporter.log("clicked on move button",true);
		//click on find duplicates button
		o1.getFindDuplicatesBtn2().click();
		Reporter.log("clicked on find duplicates",true);
		
	}
}
