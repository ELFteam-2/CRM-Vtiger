package com.vtigerv2.testcripts;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.vtigerv2.generics.BaseClass;
import com.vtigerv2.pom.HomePage;

public class QuickCreateCampaign extends BaseClass{
	@Test
	public void testQuickCreateCampaign() throws InvalidFormatException, IOException, InterruptedException {
		Reporter.log("quick create campaign", true);
		HomePage h=new HomePage(driver);
		Reporter.log("clicked on quick create dropdown", true);
		Select s=new Select(h.getQuickdropdown());
		Reporter.log("selected new cmapign", true);
		s.selectByVisibleText("New Campaign");
		Reporter.log("feched data and entered into textbox", true);
		String data = f.getExceldata("Supriya", 1, 0);
		h.getVendortbx().sendKeys(data);
		h.getSavetbtn().click();
		Thread.sleep(2000);
		
	}

}
