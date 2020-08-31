package com.vtigerv2.testcripts;

import java.io.IOException;

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

public class SearchForVendor extends BaseClass {
	@Test
	public void testSearchForVendor() throws InvalidFormatException, IOException {
		//move to more dropdown
		Reporter.log("search for vendor", true);
		HomePage h=new HomePage(driver);
		WebElement more = h.getMoredropdownlink();
		Actions a=new Actions(driver);
		Reporter.log("moved to more", true);
		a.moveToElement(more).perform();
		//click on Vendors link
		Reporter.log("clicked on vendors link", true);
		h.getVendorsLink().click();
		//read data from excel
		String venno = f.getExceldata("Supriya", 1, 7);
		VendorsPage v=new VendorsPage(driver);
		//select Vendor no option in In listbox
		Select s=new Select(v.getInlistbox());
		Reporter.log("select vendor no", true);
		s.selectByVisibleText("Vendor No");
		//enetr data into search for textbox
		v.getSearchfortbx().sendKeys(venno);
		//click on searchnow button
		
	}

}
