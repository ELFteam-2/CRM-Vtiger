package com.vtigerv2.testcripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.vtigerv2.generics.BaseClass;
import com.vtigerv2.pom.HomePage;
import com.vtigerv2.pom.NewCustomViewFilterPage;
import com.vtigerv2.pom.ProductsPage;

public class CreateFilterProducts extends BaseClass
{
	@Test
	public void testCreateFilterProduct() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		HomePage h=new HomePage(driver);
		//click on products button
		h.getProductsBtn().click();
		Reporter.log("Products Page displayed",true);
		
		ProductsPage p1=new ProductsPage(driver);
		//click on create filter link
		p1.getCreateFilterLink().click();
		Reporter.log("NewCustomView Page displayed",true);
		
		NewCustomViewFilterPage n=new NewCustomViewFilterPage(driver);
		String ViewNameData=f.getExceldata("Sheet1", 1, 3);
		//enter view name into view name text field
		n.getViewNameTxtbox().sendKeys(ViewNameData);
		Reporter.log("entered view name",true);
		//click on save button
		n.getSavebtn().click();
		Reporter.log("clicked on save button",true);
	}
}
