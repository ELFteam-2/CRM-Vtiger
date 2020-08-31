package com.vtigerv2.testcripts;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.vtigerv2.generics.BaseClass;
import com.vtigerv2.pom.HomePage;
import com.vtigerv2.pom.VendorsPage;

public class LastViewedVendor extends BaseClass{
	@Test
	public void testLastViewedVendor() {
	//move to more dropdown
			HomePage h=new HomePage(driver);
			WebElement more = h.getMoredropdownlink();
			Actions a=new Actions(driver);
			a.moveToElement(more).perform();
			//click on Vendors link
			h.getVendorsLink().click();
			VendorsPage v=new VendorsPage(driver);
			v.getLastViewedicon().click();


}
}
