package com.vtigerv2.testcripts;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.vtigerv2.generics.BaseClass;
import com.vtigerv2.pom.CampaignsPage;
import com.vtigerv2.pom.HomePage;

public class DeleteCampaign extends BaseClass {
	@Test
	public void testDeleteCampaign() throws InterruptedException {
		 Reporter.log("delete campaign", true);
		//move to more dropdown
		HomePage h=new HomePage(driver);
		WebElement more = h.getMoredropdownlink();
		Actions a=new Actions(driver);
		a.moveToElement(more).perform();
		//click on Campaigns link
		h.getCampaignsLink().click();
		CampaignsPage c=new CampaignsPage(driver);
		//check Campaign checkbox
		 int count = c.getCAMcheckbox().size();
		for(int i=0;i<count;i++)
		{
			if(i==4) {
				//click on checkbox
				c.getCAMcheckbox().get(i).click();
				c.getDeletebtn().click();
				//handle the alert prompt
				
				Thread.sleep(3000);
			}
		}
		
		
	
	}

}
