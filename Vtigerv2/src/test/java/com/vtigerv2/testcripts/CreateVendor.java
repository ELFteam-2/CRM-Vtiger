package com.vtigerv2.testcripts;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.vtigerv2.generics.BaseClass;
import com.vtigerv2.pom.CreatingNewVendorPage;
import com.vtigerv2.pom.HomePage;
import com.vtigerv2.pom.VendorsPage;

public class CreateVendor extends BaseClass{
	@Test
	public void testCreateVendor() throws InterruptedException, InvalidFormatException, IOException {
		//move to more dropdown
		HomePage h=new HomePage(driver);
		WebElement more = h.getMoredropdownlink();
		Actions a=new Actions(driver);
		a.moveToElement(more).perform();
		//click on Vendors link
		h.getVendorsLink().click();
		Thread.sleep(3000);
		VendorsPage v=new VendorsPage(driver);
		//click on CreatVendor icon
		v.getCreatevendoricon().click();
		//read data from the excel
		String name = f.getExceldata("Supriya", 1, 0);
		CreatingNewVendorPage c=new CreatingNewVendorPage(driver);
		//enter data into Vendorname textbox
		c.getVendornamrtbx().sendKeys(name);
		//click on save button
		c.getSavetbn().click();
		Thread.sleep(2000);
		 Reporter.log("creating new Vendor", true);
	}
	

}
