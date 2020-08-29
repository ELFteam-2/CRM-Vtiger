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

public class EditQuote extends BaseClass
{
	@Test
	public void testEditQuote() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		HomePage h=new HomePage(driver);
		//move to more
		WebElement MoreOption=h.getMoreDropDown();
		Actions a=new Actions(driver);
    	a.moveToElement(MoreOption).perform();
    	//click on quotes link
    	h.getQuoteLink().click();
    	Reporter.log("Quotes page displayed",true);
    	
    	QuotesPage q1=new QuotesPage(driver);
    	//click on edit link
    	q1.getEditQuoteLink().click();
    	Reporter.log("clicked on edit link",true);
    	
    	QuotesInfoPage q2=new QuotesInfoPage(driver);
    	String PriceData=f.getExceldata("Sheet1", 1, 9);
    	//click on check box
    	q2.getPriceTxtBox().sendKeys(PriceData);
    	Reporter.log("entered price",true);
    	//click on save button
    	q2.getSaveBtn().click();
    	Reporter.log("clicked on save button",true);
    	
	}
}
