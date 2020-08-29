package com.vtigerv2.testcripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.vtigerv2.generics.BaseClass;
import com.vtigerv2.pom.HomePage;
import com.vtigerv2.pom.QuotesPage;

public class MultipleDeleteQuotes extends BaseClass
{
	@Test
	public void testDeleteQuote() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		HomePage h=new HomePage(driver);
		//move to more
		WebElement MoreOption=h.getMoreDropDown();
		Actions a=new Actions(driver);
    	a.moveToElement(MoreOption).perform();
    	//click on quotes button
    	h.getQuoteLink().click();
    	Reporter.log("quotes page displayed",true);
    	
    	QuotesPage q1=new QuotesPage(driver);
    	//click on check box to select all
    	q1.getSelectAllChkBox().click();
    	Reporter.log("clicked on check box",true);
    	//click on delete button
    	q1.getDeleteBtn().click();
    	Reporter.log("clicked on delete button",true);
    	Alert a1=driver.switchTo().alert();
		a1.accept();
	}
}
