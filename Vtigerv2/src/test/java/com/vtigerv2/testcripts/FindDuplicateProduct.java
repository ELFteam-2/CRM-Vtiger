package com.vtigerv2.testcripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.vtigerv2.generics.BaseClass;
import com.vtigerv2.pom.HomePage;
import com.vtigerv2.pom.ProductsPage;

public class FindDuplicateProduct extends BaseClass
{
	@Test
	public void testDuplicateProduct() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		HomePage h=new HomePage(driver);
		//click on products button
		h.getProductsBtn().click();
		Reporter.log("Products page displayed",true);
		ProductsPage p1=new ProductsPage(driver);
		//click on find duplicates button
		p1.getFindDuplicatesBtn1().click();
		Reporter.log("clicked on find duplicates",true);
		WebElement DuplicateListBox=p1.getFindDuplicatesListBox();
		Select s=new Select(DuplicateListBox);
		s.selectByVisibleText("Product Name");
		//click on move button
		p1.getFindDuplicatesMoveBtn().click();
		Reporter.log("clicked on move button",true);
		//click on find duplicates button
		p1.getFindDuplicatesBtn2().click();
		Reporter.log("clicked on find duplicates",true);
	}
}
