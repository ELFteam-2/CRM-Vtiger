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

public class SearchOrganization extends BaseClass
{
	@Test
	public void testSearchOrganization() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		HomePage h=new HomePage(driver);
		//click on organization button
		h.getOrganizationBtn().click();
		Reporter.log("Organization page displayed",true);
		
		OrganizationPage o1=new OrganizationPage(driver);
		String SearchData=f.getExceldata("Sheet1", 2, 0);
		//enter data into search text field
		o1.getSearchTxtBox().sendKeys(SearchData);
		Reporter.log("entered data",true);
		
		WebElement SearchListBox=o1.getSearchOptionListBox();
		Select s=new Select(SearchListBox);
		s.selectByVisibleText("Organization Name");
		//click on search now button
		o1.getSearchNowBtn().click();
		Reporter.log("clicked on search now button",true);
	}
}
