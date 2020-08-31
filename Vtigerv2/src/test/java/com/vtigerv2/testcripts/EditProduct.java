package com.vtigerv2.testcripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.vtigerv2.generics.BaseClass;
import com.vtigerv2.pom.HomePage;
import com.vtigerv2.pom.ProductsInfoPage;
import com.vtigerv2.pom.ProductsPage;

public class EditProduct extends BaseClass
{
	@Test
	public void testEditProduct() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		HomePage h=new HomePage(driver);
		//click on product button
		h.getProductsBtn().click();
		Reporter.log("Product page displayed",true);
		
		ProductsPage p1=new ProductsPage(driver);
		//click on edit link
		p1.getEditLink().click();
		Reporter.log("clicked on edit link",true);
		
		ProductsInfoPage p2=new ProductsInfoPage(driver);
		String qtyData=f.getExceldata("Sheet1", 1, 7);
		//enter qty into qty text field
		p2.getQuantityTxtBox().sendKeys(qtyData);
		Reporter.log("entered qty",true);
		//click on save button
		p2.getSaveBtn().click();
		Reporter.log("clicked on save button",true);
	}
}
