package com.vtigerv2.testcripts;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.vtigerv2.generics.BaseClass;
import com.vtigerv2.pom.HomePage;
import com.vtigerv2.pom.VendorCustomViewPage;
import com.vtigerv2.pom.VendorsPage;

public class CreateFilterForVendor extends BaseClass {
	@Test
	public void testCreateFilterForVendor() throws InvalidFormatException, IOException {
		//move to more dropdown
	HomePage h=new HomePage(driver);
	WebElement more = h.getMoredropdownlink();
	Actions a=new Actions(driver);
	a.moveToElement(more).perform();
	//click on Vendors link
	h.getVendorsLink().click();
	VendorsPage v=new VendorsPage(driver);
	v.getCreatefilterlink().click();
	//read data from excel
	String viewname = f.getExceldata("Supriya", 1, 3);
	VendorCustomViewPage vc=new VendorCustomViewPage(driver);
	//enetering data into viewname textbox
	vc.getViewnametbx().sendKeys(viewname);
	//check setasdefault checkbox
	vc.getSetasdefaultcheckbox().click();
	//click on save button
	vc.getSavebtn2().click();
	 Reporter.log("creating filter for Vendors", true);
	
}
}
