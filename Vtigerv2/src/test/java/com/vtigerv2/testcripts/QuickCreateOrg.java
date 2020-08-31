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
import com.vtigerv2.pom.OrganizationInfoPage;

public class QuickCreateOrg extends BaseClass
{
	@Test
	public void testQuickCreateOrg() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		HomePage h=new HomePage(driver);
		//select create organization from the quick create list
		WebElement QuickCreateListBox=h.getQuickCreateListbox();
		Select s=new Select(QuickCreateListBox);
		s.selectByVisibleText("New Organization");
		Reporter.log("selected create organization",true);
		
		OrganizationInfoPage o2=new OrganizationInfoPage(driver);
		String OrgName=f.getExceldata("Sheet1", 6, 0);
		//enter organization name into organization name text field
		o2.getOrgNameTxtbx().sendKeys(OrgName);
		Reporter.log("entered organization name",true);
		//click on save button
		o2.getSavebtn().click();
		Reporter.log("clicked on save",true);
	}
}
