package com.vtigerv2.testcripts;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.vtigerv2.generics.BaseClass;
import com.vtigerv2.pom.HomePage;

public class QuickCreateVendor extends BaseClass {
	@Test
	public void testQuickCreateVendor() throws InvalidFormatException, IOException, InterruptedException {
		Reporter.log("quick creating Vendor", true);
		HomePage h=new HomePage(driver);
		Reporter.log("clicked on Quickcreate dropdown", true);
		Select s=new Select(h.getQuickdropdown());
		Reporter.log("selected new vendor option", true);
		s.selectByVisibleText("New Vendor");
		Reporter.log("fetched data and entered into textbox", true);
		String data = f.getExceldata("Supriya", 1, 0);
		h.getVendortbx().sendKeys(data);
		h.getSavetbtn().click();
		Thread.sleep(2000);
		
	}

}
