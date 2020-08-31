package com.vtigerv2.testcripts;

import org.testng.annotations.Test;

import com.vtigerv2.generics.BaseClass;
import com.vtigerv2.pom.ContactPage;
import com.vtigerv2.pom.HomePage;

public class export  extends BaseClass
{
@Test
public void searchbuttontest()
{
	HomePage h = new HomePage(driver);
	h.getContactlink().click();
	ContactPage c = new ContactPage(driver);
	c.getExportbutton().click();
	c.getExportwithoutsearchrecords().click();
	c.getExportalldata().click();
	c.getExportbuttonicon().click();
	
}
}
