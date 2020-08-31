package com.vtigerv2.testcripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.vtigerv2.generics.BaseClass;
import com.vtigerv2.pom.ExportOrgPage;
import com.vtigerv2.pom.HomePage;
import com.vtigerv2.pom.ProductsPage;

public class ExportProducts extends BaseClass
{
	@Test
	public void testExportProducts() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		HomePage h=new HomePage(driver);
		//click on product button
		h.getProductsBtn().click();
		Reporter.log("Product page displayed",true);
		
		ProductsPage p1=new ProductsPage(driver);
		//click on export product button
		p1.getExportProductsBtn().click();
		Reporter.log("clicked on export product button",true);
		ExportOrgPage e1=new ExportOrgPage(driver);
		//click on export product button
		e1.getExportProductsBtn().click();
		//click on cancel button
		e1.getCancelProductBtn().click();
		Reporter.log("clicked on cancel button",true);
	}
}
