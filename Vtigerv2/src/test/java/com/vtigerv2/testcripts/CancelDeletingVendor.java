package com.vtigerv2.testcripts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.vtigerv2.generics.BaseClass;
import com.vtigerv2.pom.HomePage;
import com.vtigerv2.pom.VendorsPage;

public class CancelDeletingVendor extends BaseClass {
	@Test
	public void testCancelDeleteingVendor() {
		Reporter.log("canceling deleting vendor", true);
		HomePage h=new HomePage(driver);
		WebElement more = h.getMoredropdownlink();
		Actions a=new Actions(driver);
		Reporter.log("moved to more", true);
		a.moveToElement(more).perform();
		h.getVendorsLink().click();
		VendorsPage v=new VendorsPage(driver);
		int count = v.getVENcheckbox().size();
		Reporter.log("clicked on checkbox and deleted", true);
		v.getVENcheckbox().get(count-1).click();
		v.getDeletebtn().click();
		Alert al = driver.switchTo().alert();
		al.dismiss();
	}

}
