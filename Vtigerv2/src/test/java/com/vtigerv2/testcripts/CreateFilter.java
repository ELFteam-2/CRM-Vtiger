package com.vtigerv2.testcripts;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.vtigerv2.generics.BaseClass;
import com.vtigerv2.pom.CampaignsPage;
import com.vtigerv2.pom.HomePage;
import com.vtigerv2.pom.NewCustomViewPage;

public class CreateFilter extends BaseClass {
	@Test
	public void testCreateFilter() throws InvalidFormatException, IOException {
		//move to more dropdown
		HomePage h=new HomePage(driver);
		WebElement more = h.getMoredropdownlink();
		Actions a=new Actions(driver);
		a.moveToElement(more).perform();
		//click on Campaigns link
		h.getCampaignsLink().click();
		CampaignsPage c=new CampaignsPage(driver);
		//click on CreateFilter link
		c.getCreateFilterLink().click();
		//read the data from excel
		String name = f.getExceldata("Supriya", 1, 5);
		NewCustomViewPage n=new NewCustomViewPage(driver);
		//enetering data into viewname textbox
		n.getViewnametbx().sendKeys(name);
		//check Setas default checkbox
		n.getSetasdefaultcheckbox().click();
		//click on save button
		n.getSavebtn2().click();
		 Reporter.log("creating filter for campaigns", true);
		 
	}

}
