package com.vtigerv2.testcripts;

import java.io.IOException;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.vtigerv2.generics.BaseClass;
import com.vtigerv2.pom.AddingOrganizationPage;
import com.vtigerv2.pom.AddingProductPage;
import com.vtigerv2.pom.HomePage;
import com.vtigerv2.pom.QuotesInfoPage;
import com.vtigerv2.pom.QuotesPage;

public class DeleteQuote extends BaseClass
{
	@Test
	public void testDeleteQuote() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
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
    	String SubjectData=f.getExceldata("Sheet1", 4, 8);
    	//enter subject name into subject text field
    	q2.getSubjectTxtBox().sendKeys(SubjectData);
    	Reporter.log("entered subject name",true);
    	String BillingData=f.getExceldata("Sheet1", 1, 1);
    	//enter billing address into billing address text field
    	q2.getBillingAddTxtBox().sendKeys(BillingData);
    	Reporter.log("entered billing address",true);
    	//click on copy billing address radio button
    	q2.getCopyBillingAddRadioBtn().click();
    	Reporter.log("clicked on copy billing address radio button",true);
    	//click on selcet organization button to select organization
    	q2.getOrganizationSelectBtn().click();
    	Reporter.log("clicked on select organization",true);
    	String parentWindow=driver.getWindowHandle();
		Set<String> AllwindowHandles=driver.getWindowHandles();
		for(String window:AllwindowHandles)
		{
			if(!(parentWindow.equals(window)))
			{
				driver.switchTo().window(window);
				AddingOrganizationPage aop=new AddingOrganizationPage(driver);
				//click on one organization 
				aop.getOrgSelect().click();
				Reporter.log("organization selected",true);
				Alert a1=driver.switchTo().alert();
				a1.accept();
			}
		}
		driver.switchTo().window(parentWindow);
		//click on select product button
    	q2.getProductSelectBtn().click();
    	Reporter.log("clicked on select product",true);
    	String parentWindow1=driver.getWindowHandle();
		Set<String> AllwindowHandles1=driver.getWindowHandles();
		for(String window1:AllwindowHandles1)
		{
			if(!(parentWindow1.equals(window1)))
			{
				driver.switchTo().window(window1);
				AddingProductPage aop=new AddingProductPage(driver);
				//click on products to select
				aop.getProductSelect().click();
				Reporter.log("product selected",true);
			}
		}
		driver.switchTo().window(parentWindow1);
		String QtyData=f.getExceldata("Sheet1", 1, 7);
		//enter quantity into qty text field
		q2.getQtyTxtBox().sendKeys(QtyData);
		Reporter.log("entered qty",true);
		String PriceData=f.getExceldata("Sheet1", 1, 9);
		//enter price into price text field
		q2.getPriceTxtBox().sendKeys(PriceData);
		Reporter.log("entered price",true);
		//click on save button
		q2.getSaveBtn().click();
		Reporter.log("cliked on save button",true);
		
		//click on check box to delete qoute
		q.getSelectChkBoxToDelete().click();
		Reporter.log("clicked on check box",true);
		//click on delete button
    	q.getDeleteBtn().click();
    	Reporter.log("clicked on delete button",true);
    	Alert a1=driver.switchTo().alert();
		a1.accept();
	}
}
