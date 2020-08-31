package com.vtigerv2.testcripts;

import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.vtigerv2.generics.BaseClass;
import com.vtigerv2.pom.HomePage;
import com.vtigerv2.pom.ServicePage;

public class Cancelservicemassedit extends BaseClass
{
	@Test
	public void massedit()
	{
		Reporter.log("cancel service massedit");
		HomePage h = new HomePage(driver);
		Actions a = new Actions(driver);
		a.moveToElement(h.getMorelink()).perform();
		ServicePage s = new ServicePage(driver);
		s.getServices().click();
		s.getCreateserviceplus().click();
		s.getServicename().sendKeys("honda service");
		s.getSave().click();
		h.getHomebtn().click();
		a.moveToElement(h.getMorelink()).perform();
		ServicePage s2 = new ServicePage(driver);
		s2.getServices().click();
		s2.getAllcheckbox().click();
		s.getMassedit().click();
		s.getServicename().sendKeys("spareparts");
		
		s.getCancel().click();
	}
	

}
