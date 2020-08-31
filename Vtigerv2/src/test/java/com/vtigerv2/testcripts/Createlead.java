package com.vtigerv2.testcripts;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.vtigerv2.generics.BaseClass;
import com.vtigerv2.pom.HomePage;
import com.vtigerv2.pom.LeadPage;

public class Createlead  extends BaseClass

{
	@Test
	public void createLead()
	{
		HomePage h = new	HomePage(driver);
		h.getLeads().click();
		LeadPage l = new LeadPage(driver);
		l.getCreatelead().click();
		 WebElement drop = l.getFirstname();
		 Select s = new Select(drop);
		 s.selectByIndex(3);
		 l.getLastname().sendKeys("maryam");
		 l.getCompany().sendKeys("TaTa motors");
		 l.getSave().click();
	}

}
