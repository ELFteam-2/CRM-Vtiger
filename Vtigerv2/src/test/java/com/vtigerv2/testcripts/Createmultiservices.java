package com.vtigerv2.testcripts;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.vtigerv2.generics.BaseClass;
import com.vtigerv2.pom.HomePage;
import com.vtigerv2.pom.ServicePage;

public class Createmultiservices extends BaseClass
{
@Test
public void createMultiservices()
{
	HomePage h = new HomePage(driver);
	Actions a = new Actions(driver);
	a.moveToElement(h.getMorelink()).perform();
	ServicePage s = new ServicePage(driver);
	s.getServices().click();
	s.getCreateserviceplus().click();
	s.getServicename().sendKeys("ziva");
	s.getSave().click();
	h.getHomebtn().click();
	a.moveToElement(h.getMorelink()).perform();
	ServicePage s2 = new ServicePage(driver);
	s2.getServices().click();
	s2.getCreateserviceplus().click();
	s2.getServicename().sendKeys("mg services");
	s2.getSave().click();
}
}
