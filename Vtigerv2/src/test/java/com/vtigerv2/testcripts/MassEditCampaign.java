package com.vtigerv2.testcripts;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.vtigerv2.generics.BaseClass;
import com.vtigerv2.pom.CampaignMassEditPage;
import com.vtigerv2.pom.CampaignsPage;
import com.vtigerv2.pom.HomePage;

public class MassEditCampaign extends BaseClass {
	@Test
	public void testMassEditCampaign() throws InterruptedException, InvalidFormatException, IOException {
		//move to more dropdown
		HomePage h=new HomePage(driver);
		WebElement more = h.getMoredropdownlink();
		Actions a=new Actions(driver);
		a.moveToElement(more).perform();
		//click on Campaigns link
		h.getCampaignsLink().click();
		Thread.sleep(3000);
		CampaignsPage c=new CampaignsPage(driver);
		int count = c.getCAMcheckbox().size();
		for(int i=0;i<count;i++) {
			if(i<3) {
				c.getCAMcheckbox().get(i).click();
			}
		}
		c.getMassEditbtn().click();
		String data = f.getExceldata("Supriya", 1, 0);
		CampaignMassEditPage cm=new CampaignMassEditPage(driver);
		cm.getCampaigncheckbox().click();
		cm.getCampaignnametbx().sendKeys(data);
		cm.getSavebtn().click();
		Reporter.log("mass edit campaigns", true);
		
	}

}
