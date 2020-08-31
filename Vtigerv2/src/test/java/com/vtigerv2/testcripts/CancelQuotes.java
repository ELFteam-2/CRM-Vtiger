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

public class CancelQuotes extends BaseClass
{
	@Test
	public void testCancelQuote() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
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
    	//click on create new quotes button
    	q.getCreateQuoteBtn().click();
    	Reporter.log("clicked on create new quotess button",true);
    	
    	QuotesInfoPage q2=new QuotesInfoPage(driver);
    	String SubjectData=f.getExceldata("Sheet1", 1, 8);
    	//enter subject name into subject text field
    	q2.getSubjectTxtBox().sendKeys(SubjectData);
    	Reporter.log("entered subject name",true);
    	//click on cancel button
    	q2.getCancelbtn().click();
    	Reporter.log("clicked on cancel button",true);
	}
}
