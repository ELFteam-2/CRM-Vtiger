package com.vtigerv2.testcripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.Alert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.vtigerv2.generics.BaseClass;
import com.vtigerv2.pom.HomePage;
import com.vtigerv2.pom.ProductsPage;

public class MultipleDeleteProducts extends BaseClass
{
	@Test
	public void testMultipleDeleteProduct() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		HomePage h=new HomePage(driver);
		//click on products button
		h.getProductsBtn().click();
		Reporter.log("products page displayed",true);
		
		ProductsPage p1=new ProductsPage(driver);
		//click on check box to select all
		p1.getSelectAllProductsChkbox().click();
		Reporter.log("clicked on check box",true);
		//click on delete button
		p1.getDeleteBtn().click();
		Reporter.log("clicked on delete button",true);
		Alert a=driver.switchTo().alert();
		a.accept();
	}
}
