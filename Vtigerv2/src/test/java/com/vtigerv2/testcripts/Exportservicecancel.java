package com.vtigerv2.testcripts;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.vtigerv2.generics.BaseClass;
import com.vtigerv2.pom.HomePage;
import com.vtigerv2.pom.ServicePage;

public class Exportservicecancel extends BaseClass
{
@Test
public void exportService()
{
	HomePage h = new HomePage(driver);
	Actions a = new Actions(driver);
	a.moveToElement(h.getMorelink()).perform();
	ServicePage s = new ServicePage(driver);
	s.getServices().click();
	s.getExportservices().click();
s.getExportwithoutsearchrecords().click();
s.getExportalldata().click();
s.getExportcancelbtn().click();
}
}
