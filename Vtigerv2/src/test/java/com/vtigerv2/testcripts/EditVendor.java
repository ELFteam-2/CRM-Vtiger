package com.vtigerv2.testcripts;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.vtigerv2.generics.BaseClass;
import com.vtigerv2.pom.EditVendorInformationPage;
import com.vtigerv2.pom.HomePage;
import com.vtigerv2.pom.VendorsPage;

public class EditVendor extends BaseClass {
	@Test
	public void testEditVendor() throws InterruptedException, InvalidFormatException, IOException {
		//move to more dropdown
		HomePage h=new HomePage(driver);
		WebElement more = h.getMoredropdownlink();
		Actions a=new Actions(driver);
		Reporter.log("moved to more", true);
		a.moveToElement(more).perform();
		//click on Vendors Link
		Reporter.log("clicked on vendors link", true);
		h.getVendorsLink().click();
		Thread.sleep(3000);
		VendorsPage v=new VendorsPage(driver);
		Reporter.log("selected vendor", true);
		//click on Vendor edit link
		v.getVEN12editlink().click();
		Thread.sleep(3000);
		//read data from excel
		Reporter.log("fetched data", true);
		String email = f.getExceldata("Supriya", 1, 6);
		EditVendorInformationPage e=new EditVendorInformationPage(driver);
		//enter data into email textbox
		Reporter.log("entered data", true);
		e.getEmailtbx().sendKeys(email);
		//click on save button
		e.getSavebtn().click();
		 Reporter.log("editing Vendor", true);
	}

}
