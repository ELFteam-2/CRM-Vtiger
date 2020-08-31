package com.vtigerv2.testcripts;

import java.io.IOException;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.vtigerv2.generics.BaseClass;
import com.vtigerv2.pom.HomePage;
import com.vtigerv2.pom.VendorsPage;

public class DeleteVendor extends BaseClass {
	@Test
	public void testDeleteVendor() throws InvalidFormatException, IOException {
		//move to more dropdown
		Reporter.log("deleting vendor", true);
		HomePage h=new HomePage(driver);
		Reporter.log("selecting new vendor option", true);
		Select s=new Select(h.getQuickdropdown());
		s.selectByVisibleText("New Vendor");
		Reporter.log("fetching data ", true);
		String data = f.getExceldata("Supriya", 1, 0);
		h.getVendortbx().sendKeys(data);
		h.getSavetbtn().click();
		Reporter.log("moved to more", true);
		WebElement more = h.getMoredropdownlink();
		Actions a=new Actions(driver);
		a.moveToElement(more).perform();
		//click on Vendors link
		h.getVendorsLink().click();
		Reporter.log("selecting vendor and deleted", true);
		VendorsPage v=new VendorsPage(driver);
		 int count = v.getVENcheckbox().size();
		 System.out.println(count);
		v.getVENcheckbox().get(count-1).click();
		v.getDeletebtn().click();
		Alert al=driver.switchTo().alert();
		al.accept();
	}
	

}
