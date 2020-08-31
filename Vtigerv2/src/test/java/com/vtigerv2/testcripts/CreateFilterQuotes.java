package com.vtigerv2.testcripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.vtigerv2.generics.BaseClass;
import com.vtigerv2.pom.HomePage;
import com.vtigerv2.pom.NewCustomViewFilterPage;
import com.vtigerv2.pom.QuotesPage;

public class CreateFilterQuotes extends BaseClass
{
	@Test
	public void testCreateFilterQuotes() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		HomePage h=new HomePage(driver);
		//move to more
		WebElement MoreOption=h.getMoreDropDown();
		Actions a=new Actions(driver);
    	a.moveToElement(MoreOption).perform();
    	//click on quotes link
    	h.getQuoteLink().click();
    	Reporter.log("Quotes Page displayed",true);
    	
    	QuotesPage q=new QuotesPage(driver);
    	//click on create filter link
    	q.getCreateFilterLink().click();
    	Reporter.log("NewCustomView Page displayed",true);
    	
    	NewCustomViewFilterPage n=new NewCustomViewFilterPage(driver);
		String ViewNameData=f.getExceldata("Sheet1", 1, 3);
		//enter view name into view name text filed
		n.getViewNameTxtbox().sendKeys(ViewNameData);
		Reporter.log("entered view name",true);
		//click on save button
		n.getSavebtn().click();
		Reporter.log("clicked on save button",true);
	}
}
