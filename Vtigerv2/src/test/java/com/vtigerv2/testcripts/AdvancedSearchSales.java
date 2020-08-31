package com.vtigerv2.testcripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.Alert;
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
public class AdvancedSearchSales extends BaseClass {
	@Test
	public void testAdvancedSearchSales() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {
		Reporter.log("Click on More Dropdown",true); 
		HomePage h=new HomePage(driver);
	    Actions a=new Actions(driver);
	    a.moveToElement(h.getMorelink()).perform();
	    Reporter.log("Click on Sales Order",true); 
	    h.getSalesorderlink().click();
	    Reporter.log("Click on 'Go to Advanced Search' Button",true);
	    SalesOrderPage s=new SalesOrderPage(driver);
	    s.getAdvancedsearch().click();
	    Reporter.log("Select Subject from Dropdown",true);
	   s.getAdsearchsubject().click();
	   Reporter.log("select starts with from the next Dropdown",true);
	   Select se=new Select(s.getAdsearchdropdown2());
	   se.selectByVisibleText("starts with");
	   FileLib f=new FileLib();
	   String subject = f.getExceldata("Search", 2, 1);
	   Reporter.log("Enter the Subject name",true);
	   s.getAdsearchtextbox().sendKeys(subject);
	   Reporter.log("click on Search Now Button.",true);
	    s.getSearchnowbtn2().click();
	    Alert al = driver.switchTo().alert();
	    al.accept();
	    Reporter.log("sales order is searched through advanced search",true);
	}
}
