package com.vtigerv2.testcripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.vtigerv2.generics.BaseClass;
import com.vtigerv2.pom.HomePage;
import com.vtigerv2.pom.MassEditProductsPage;
import com.vtigerv2.pom.ProductsPage;

public class MassEditProducts extends BaseClass
{
	@Test
	public void testMassEditProduct() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		HomePage h=new HomePage(driver);
		//click on product button
		h.getProductsBtn().click();
		Reporter.log("Products page displayed",true);
		
		ProductsPage p1=new ProductsPage(driver);
		//click on check box to select all
		p1.getSelectAllProductsChkbox().click();
		Reporter.log("clicked on check box",true);
		//click on mass edit button
		p1.getMassEditBtn().click();
		Reporter.log("clicked on mass edit",true);
		
		MassEditProductsPage m1=new MassEditProductsPage(driver);
		String WebsiteData=f.getExceldata("Sheet1", 1, 6);
		//enter the website into website name text box
		m1.getWebsiteTxtbox().sendKeys(WebsiteData);
		Reporter.log("entered website name",true);
		//click on save button
		m1.getSaveBtn().click();
		Reporter.log("clicked on save  utton",true);
	}
	
}
