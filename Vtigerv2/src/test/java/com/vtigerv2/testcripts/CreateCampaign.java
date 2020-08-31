package com.vtigerv2.testcripts;


import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.vtigerv2.generics.BaseClass;
import com.vtigerv2.pom.CampaignsPage;
import com.vtigerv2.pom.CreatingNewCampaignPage;
import com.vtigerv2.pom.HomePage;
@Listeners(com.vtigerv2.generics.Listener.class)
public class CreateCampaign extends BaseClass {
	@Test
	public void testCreateCampaign() throws InvalidFormatException, IOException, InterruptedException {
		//move to more dropdown
		Reporter.log("creating campaign", true);
		HomePage h=new HomePage(driver);
		WebElement more = h.getMoredropdownlink();
		Actions a=new Actions(driver);
		Reporter.log("moved to more", true);
		a.moveToElement(more).perform();
		//click on campagins link
		h.getCampaignsLink().click();
		CampaignsPage c=new CampaignsPage(driver);
		//click on createcampaign icon
		c.getCreatecampaignicon().click();
		//read data from excel
		Reporter.log("fecthing data from excel", true);
		String cname = f.getExceldata("Supriya", 1, 0);
		String closedate = f.getExceldata("Supriya", 1, 1);
		Reporter.log("entering data into textbox", true);
		CreatingNewCampaignPage c1=new CreatingNewCampaignPage(driver);
		//enetring data in Campaignname textbox
		c1.getCampaignnametbx().sendKeys(cname);
		//entering data in Expectedclosedate textbox
		c1.getExpectedclosedatetbx().sendKeys(closedate);
		//click on save button
		c1.getSavebtn().click();
		 
	
	
		
		
		
		
	}
}
