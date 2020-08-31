package com.vtigerv2.testcripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.vtigerv2.generics.BaseClass;
import com.vtigerv2.generics.FileLib;
import com.vtigerv2.pom.HomePage;
import com.vtigerv2.pom.SalesOrderPage;
@Listeners(com.vtigerv2.generics.Listener.class)
public class SearchSalesUsingSubject extends BaseClass {
	@Test
	public void testSearchSalesUsingSubject() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {
		//Click on More Dropdown 
		HomePage h=new HomePage(driver);
	    Actions a=new Actions(driver);
	    a.moveToElement(h.getMorelink()).perform();
	    // Click on Sales Order.
	    h.getSalesorderlink().click();
	    FileLib f=new FileLib();
		String subject = f.getExceldata("Search", 4, 1);
		//Click on 'Search For' Text Field And Enter the Subject Name
	    SalesOrderPage s=new SalesOrderPage(driver);
	    s.getSearchtxtbox().sendKeys(subject);
	    //Click on 'In' DropDown and Select Subject.
	    Select se=new Select(s.getSearchindropdown());
	    se.selectByVisibleText("Subject");
	    //Click on Search Now
	    s.getSearchnowbtn().click();
	    Reporter.log("Sales order is searched using subject",true);
	}
}
