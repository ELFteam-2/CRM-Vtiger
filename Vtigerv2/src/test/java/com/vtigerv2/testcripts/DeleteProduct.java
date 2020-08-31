package com.vtigerv2.testcripts;

import java.io.IOException;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.Alert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.vtigerv2.generics.BaseClass;
import com.vtigerv2.pom.AddingVendorPage;
import com.vtigerv2.pom.HomePage;
import com.vtigerv2.pom.ProductsInfoPage;
import com.vtigerv2.pom.ProductsPage;

public class DeleteProduct extends BaseClass
{
	@Test
	public void testDeleteProduct() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		HomePage h=new HomePage(driver);
		//click on products button
		h.getProductsBtn().click();
		Reporter.log("Products Page displayed",true);
		ProductsPage p1=new ProductsPage(driver);
		//click on create new products button
		p1.getCreateNewProductbtn().click();
		Reporter.log("clicked on create new products button",true);
		
		ProductsInfoPage p2=new ProductsInfoPage(driver);
		String ProductData=f.getExceldata("Sheet1", 3, 4);
		//enter product name into product name text field
		p2.getProductTxtbox().sendKeys(ProductData);
		Reporter.log("entered product name",true);
		//click on select vendor button
		p2.getVendorSelectBtn().click();
		Reporter.log("clicked on vendor button",true);
		String parentWindow=driver.getWindowHandle();
		Set<String> AllwindowHandles=driver.getWindowHandles();
		for(String window:AllwindowHandles)
		{
			if(!(parentWindow.equals(window)))
			{
				driver.switchTo().window(window);
				AddingVendorPage v=new AddingVendorPage(driver);
				//click on vendor name to select
				v.getVendorsNames().click();
				Reporter.log("vendor selected",true);
			}
		}
		driver.switchTo().window(parentWindow);
		//click on save button
		p2.getSaveBtn().click();
		Reporter.log("clicked on save button",true);
		
		//click on check box to delete product
		p1.getSelectProductsChkbox().click();
		Reporter.log("clicked on check box",true);
		//click on delete button
		p1.getDeleteBtn().click();
		Reporter.log("clicked on delete button",true);
		Alert a=driver.switchTo().alert();
		a.accept();
	}
}
