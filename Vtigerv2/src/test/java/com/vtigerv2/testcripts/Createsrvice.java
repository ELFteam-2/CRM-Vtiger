package com.vtigerv2.testcripts;


import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.vtigerv2.generics.BaseClass;
import com.vtigerv2.pom.HomePage;
import com.vtigerv2.pom.ServicePage;

public class Createsrvice extends BaseClass

{
@Test
public void craeteService()
{
	
	HomePage h = new HomePage(driver);
	Actions a = new Actions(driver);
	a.moveToElement(h.getMorelink()).perform();
	ServicePage s = new ServicePage(driver);
	s.getServices().click();
	s.getCreateserviceplus().click();
	s.getServicename().sendKeys("ziva");
	s.getSave().click();
	
	
	
}}
