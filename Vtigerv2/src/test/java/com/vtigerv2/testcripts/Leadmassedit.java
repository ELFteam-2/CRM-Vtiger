package com.vtigerv2.testcripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.vtigerv2.generics.BaseClass;
import com.vtigerv2.pom.HomePage;
import com.vtigerv2.pom.LeadPage;


public class Leadmassedit  extends BaseClass
{
@Test
public void leadMassedit()
{
	Reporter.log("massedit lead");
	//create an object of homepage pom class
	HomePage h = new HomePage(driver);
	//clicks on lead majortab
	h.getLeads().click();
	//create an object of leadpage pom class
	LeadPage l = new LeadPage(driver);
	//clicks on lead checkbox;
	l.getLeadallcheckbox().click();
	//click on massedit button
	l.getMassedit().click();
	

}
}