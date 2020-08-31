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
import com.vtigerv2.pom.ProductsInfoPage;

public class QuickCreateProduct extends BaseClass
{
	@Test
	public void testQuickCreateProduct() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		HomePage h=new HomePage(driver);
		//select create product from the quick create list
		WebElement QuickCreateListBox=h.getQuickCreateListbox();
		Select s=new Select(QuickCreateListBox);
		s.selectByVisibleText("New Product");
		Reporter.log("selected create product",true);
		
		ProductsInfoPage p2=new ProductsInfoPage(driver);
		String ProductData=f.getExceldata("Sheet1", 2, 4);
		//enter product name into product name text field
		p2.getProductTxtbox().sendKeys(ProductData);
		Reporter.log("entered product name",true);
		//click on save button
		p2.getVendorSelectBtn().click();
		Reporter.log("clicked on save",true);
	}
}
