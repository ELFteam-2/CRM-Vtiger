package com.vtigerv2.testcripts;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.vtigerv2.generics.BaseClass;
import com.vtigerv2.pom.CampaignsPage;
import com.vtigerv2.pom.HomePage;

public class LastViewedCampaign extends BaseClass {
	@Test
	public void testLastViewedCampaign() {
		//move to more dropdown
				HomePage h=new HomePage(driver);
				WebElement more = h.getMoredropdownlink();
				Actions a=new Actions(driver);
				Reporter.log("moved to more", true);
				a.moveToElement(more).perform();
				//click on Campaigns link
				Reporter.log("clicked on campaign link", true);
				h.getCampaignsLink().click();
				CampaignsPage c=new CampaignsPage(driver);
				//click on last viewed icon 
				Reporter.log("clicked on last viewed icon", true);
				c.getLastViewedIcon().click();

	}

}
