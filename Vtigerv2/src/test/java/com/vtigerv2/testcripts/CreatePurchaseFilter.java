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
import com.vtigerv2.pom.PurchaseOrderPage;
@Listeners(com.vtigerv2.generics.Listener.class)
public class CreatePurchaseFilter extends BaseClass {
	@Test
	public void testCreatePurchaseFilter() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {
		 Reporter.log("Click on More Dropdown",true);
		HomePage h=new HomePage(driver);
	    Actions a=new Actions(driver);
	    a.moveToElement(h.getMorelink()).perform();
	    Reporter.log("Click on Purchase Order.",true);
	    h.getPurchaseorderlink().click();
	    Reporter.log("Click on Create filter.",true);
	    PurchaseOrderPage p=new PurchaseOrderPage(driver);
	    p.getCreateFilterLink().click();
	    FileLib f=new FileLib();
		String ViewName = f.getExceldata("Filter", 3, 0);
		Reporter.log("Enter Filter Details .",true);
	    NewCustomViewPage cv=new NewCustomViewPage(driver);
	    cv.getViewnametxtbox().sendKeys(ViewName);
	    Select s=new Select(cv.getSelectdurationdropdown());
	    s.selectByVisibleText("Last 30 Days");
	    Reporter.log("Click on Save Button.",true);
	    cv.getSavebtn().click();
	    Reporter.log("Purchase filter is created",true);
	}
}
