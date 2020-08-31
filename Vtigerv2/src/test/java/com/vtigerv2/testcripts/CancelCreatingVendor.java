package com.vtigerv2.testcripts;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.vtigerv2.generics.BaseClass;
import com.vtigerv2.pom.CreatingNewVendorPage;
import com.vtigerv2.pom.HomePage;
import com.vtigerv2.pom.VendorsPage;

public class CancelCreatingVendor extends BaseClass {
	@Test
	public void testCancelCreatingVendor() {
		Reporter.log("canceling create vendor",true);
	HomePage h=new HomePage(driver);
	WebElement more = h.getMoredropdownlink();
	Actions a=new Actions(driver);
	//move to more link
	Reporter.log("moved to more", true);
	a.moveToElement(more).perform();
	//click on Vendors link
	h.getVendorsLink().click();
	VendorsPage v=new VendorsPage(driver);
	//click on Createvendoricon
	Reporter.log("clicked on CreateVendor icon", true);
	v.getCreatevendoricon().click();
	CreatingNewVendorPage c=new CreatingNewVendorPage(driver);
	//click on cancel
	c.getCancelbtn().click();
	

}
}
