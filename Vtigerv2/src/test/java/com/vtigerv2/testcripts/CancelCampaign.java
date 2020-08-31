package com.vtigerv2.testcripts;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.vtigerv2.generics.BaseClass;
import com.vtigerv2.pom.CampaignsPage;
import com.vtigerv2.pom.CreatingNewCampaignPage;
import com.vtigerv2.pom.HomePage;

public class CancelCampaign extends BaseClass {
	@Test
	public void testCancelCampaign() throws InterruptedException, InvalidFormatException, IOException {
		Reporter.log("canceling creating campaign", true);
	HomePage h=new HomePage(driver);
	//move to more element
	Reporter.log("moved to more", true);
	WebElement more = h.getMoredropdownlink();
	Actions a=new Actions(driver);
	a.moveToElement(more).perform();
	//click on campaigns link
	Reporter.log("clicked on campaigns link", true);
	h.getCampaignsLink().click();
	//click on CreateCmpaignicon
	CampaignsPage c=new CampaignsPage(driver);
	Reporter.log("clicked on createCampaign icon", true);
	c.getCreatecampaignicon().click();
	//click on cancel
	CreatingNewCampaignPage c1=new CreatingNewCampaignPage(driver);
	 c1.getCancelbtn().click();
	


}
}
