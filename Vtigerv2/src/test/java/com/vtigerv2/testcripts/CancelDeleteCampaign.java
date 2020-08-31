package com.vtigerv2.testcripts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.vtigerv2.generics.BaseClass;
import com.vtigerv2.pom.CampaignsPage;
import com.vtigerv2.pom.HomePage;

public class CancelDeleteCampaign extends BaseClass {
	@Test
	public void testCancelDeleteCampaign() throws InterruptedException {
		 Reporter.log("deleting campaign", true);
		//move to more dropdown
		HomePage h=new HomePage(driver);
		WebElement more = h.getMoredropdownlink();
		Actions a=new Actions(driver);
		Reporter.log("moved to more", true);
		a.moveToElement(more).perform();
		//click on Campaigns link
		h.getCampaignsLink().click();
		Thread.sleep(3000);
		CampaignsPage c=new CampaignsPage(driver);
		//check Campaign checkbox
		Reporter.log("clicked on campaign checkbox and deleted", true);
		 int count = c.getCAMcheckbox().size();
		for(int i=0;i<count;i++)
		{
			if(i==4) {
				//click on 
				c.getCAMcheckbox().get(i).click();
				c.getDeletebtn().click();
				//handle the alert prompt
				Alert al=driver.switchTo().alert();
				al.dismiss();
				Thread.sleep(3000);
			}
		}

}
}
