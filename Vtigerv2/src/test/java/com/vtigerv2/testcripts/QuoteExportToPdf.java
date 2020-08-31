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
import com.vtigerv2.pom.QuotesInfoPage;
import com.vtigerv2.pom.QuotesPage;

public class QuoteExportToPdf extends BaseClass
{
	@Test
	public void testMassEditQuote() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
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
    	//click on quotes sales
    	q1.getExportQuotesSalesLink().click();
    	Reporter.log("clicked on sales quotes",true);
    	
    	QuotesInfoPage q2=new QuotesInfoPage(driver);
    	//click on export to pdf link
    	q2.getExportToPdfLink().click();
    	Reporter.log("clicked on export to pdf link",true);
	}
}
