package com.vtigerv2.testcripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.vtigerv2.generics.BaseClass;
import com.vtigerv2.pom.HomePage;
import com.vtigerv2.pom.QuotesPage;

public class SearchQuotes extends BaseClass
{
	@Test
	public void testSearchQuote() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		HomePage h=new HomePage(driver);
		WebElement MoreOption=h.getMoreDropDown();
		Actions a=new Actions(driver);
    	a.moveToElement(MoreOption).perform();
    	//click on quotes link
    	h.getQuoteLink().click();
    	Reporter.log("quotes page displayed",true);
    	
    	QuotesPage q1=new QuotesPage(driver);
    	String SearchData=f.getExceldata("Sheet1", 2, 8);
    	//enter data into search text field
    	q1.getSearchTxtBox().sendKeys(SearchData);
    	Reporter.log("entered data",true);
    	WebElement SearchListBox=q1.getSearchInListBox();
    	Select s=new Select(SearchListBox);
    	s.selectByVisibleText("Subject");
    	//click on search now button
    	q1.getSearchNowBtn().click();
    	Reporter.log("clicked on search now button",true);
	}
}
