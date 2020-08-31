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

public class SearchProduct extends BaseClass
{
	@Test
	public void testSearchProduct() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		HomePage h=new HomePage(driver);
		//click on product button
		h.getProductsBtn().click();
		Reporter.log("product page displayed",true);
		
		ProductsPage p1=new ProductsPage(driver);
		WebElement SelectListBox=p1.getSearchInDropDown();
		Select s1=new Select(SelectListBox);
		s1.selectByVisibleText("Product Name");
		String SearchData=f.getExceldata("Sheet1", 2, 4);
		//enter data into search text field
		p1.getSearchTxtBox().sendKeys(SearchData);
		Reporter.log("entered data",true);
		//click on search now button
		p1.getSearchNowBtn().click();
		Reporter.log("clicked on search now button",true);
		
	}
}
