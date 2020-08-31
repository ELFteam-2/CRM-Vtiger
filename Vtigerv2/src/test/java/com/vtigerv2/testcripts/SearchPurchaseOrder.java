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
import com.vtigerv2.pom.PurchaseOrderPage;
@Listeners(com.vtigerv2.generics.Listener.class)
public class SearchPurchaseOrder extends BaseClass{
	@Test
	public void testSearchPurchaseOrder() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {
		//Click on More Dropdown 
		HomePage h=new HomePage(driver);
	    Actions a=new Actions(driver);
	    a.moveToElement(h.getMorelink()).perform();
	    //and Click on Purchase Order.
	    h.getPurchaseorderlink().click();
	    FileLib f=new FileLib();
		String purchaseNo = f.getExceldata("Search", 1, 1);
		//Click on 'Search For' Text Field And Enter the PurchaseOrder No.
	    PurchaseOrderPage p=new PurchaseOrderPage(driver);
	    p.getSearchtxtbox().sendKeys(purchaseNo);
	    //Click on 'In' DropDown and Select 'PurchaseOrder No'
	    Select s=new Select(p.getSearchindropdown());
	    s.selectByVisibleText("PurchaseOrder No");
	    // and Click on Search Now.
	    p.getSearchnowbtn().click();
	    Reporter.log("Purchase order is searched using purchase order number",true);
	}
}
