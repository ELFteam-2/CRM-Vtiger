package com.vtigerv2.testcripts;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.vtigerv2.generics.BaseClass;
import com.vtigerv2.pom.HomePage;
import com.vtigerv2.pom.ServicePage;

public class Servicemassedit extends BaseClass
{
@Test
public void serviceMassedit()
{
	HomePage h = new HomePage(driver);
	Actions a = new Actions(driver);
	a.moveToElement(h.getMorelink()).perform();
	ServicePage s = new ServicePage(driver);
	s.getServices().click();
	s.getAllcheckbox().click();
	s.getMassedit().click();
	s.getServicename().sendKeys("repair");
	
	s.getSave().click();
	
	
}
}
