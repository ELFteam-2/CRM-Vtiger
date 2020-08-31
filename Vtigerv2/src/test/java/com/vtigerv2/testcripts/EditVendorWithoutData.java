package com.vtigerv2.testcripts;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.vtigerv2.generics.BaseClass;
import com.vtigerv2.pom.EditVendorInformationPage;
import com.vtigerv2.pom.HomePage;
import com.vtigerv2.pom.VendorsPage;

public class EditVendorWithoutData extends BaseClass {
	@Test
	public void testEditVendorWithoutData() throws InterruptedException {
		//move to more dropdown
	HomePage h=new HomePage(driver);
	WebElement more = h.getMoredropdownlink();
	Actions a=new Actions(driver);
	a.moveToElement(more).perform();
	Reporter.log("moved to more", true);
	//click on Vendors link
	h.getVendorsLink().click();
	Thread.sleep(3000);
	VendorsPage v=new VendorsPage(driver);
	Reporter.log("clicked on edit link", true);
	//click on Vendor edit link
	v.getVEN12editlink().click();
	Thread.sleep(3000);
	EditVendorInformationPage e=new EditVendorInformationPage(driver);
	//click on save button
	e.getSavebtn().click();
	 Reporter.log("editing vendor with no data", true);
	driver.close();
	

}
}
