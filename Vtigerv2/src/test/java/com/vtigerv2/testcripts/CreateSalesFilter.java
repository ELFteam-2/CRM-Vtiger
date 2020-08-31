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
import com.vtigerv2.pom.NewCustomViewPage;
import com.vtigerv2.pom.SalesOrderPage;
@Listeners(com.vtigerv2.generics.Listener.class)
public class CreateSalesFilter extends BaseClass {
	@Test
	public void testCreateSalesFilter() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {
		Reporter.log("Click on More Dropdown",true);
		HomePage h=new HomePage(driver);
	    Actions a=new Actions(driver);
	    a.moveToElement(h.getMorelink()).perform();
	    Reporter.log("Click on Sales Order",true);
	    h.getSalesorderlink().click();
	    Reporter.log("Click on Create filter",true);
	    SalesOrderPage s=new SalesOrderPage(driver);
	    s.getCreateFilterLink().click();
	    FileLib f=new FileLib();
		String ViewName = f.getExceldata("Filter", 2, 0);
		Reporter.log("Enter Filter Details ",true);
	    NewCustomViewPage cv=new NewCustomViewPage(driver);
	    cv.getViewnametxtbox().sendKeys(ViewName);
	    Select se=new Select(cv.getSelectdurationdropdown());
	    se.selectByVisibleText("Last 30 Days");
	    Reporter.log("Click on Save Button",true);
	    cv.getSavebtn().click();
	    Reporter.log("Sales Filter is Created",true);
	    }
}
