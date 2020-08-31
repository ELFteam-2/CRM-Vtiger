package com.vtigerv2.testcripts;

import org.testng.annotations.Test;

import com.vtigerv2.generics.BaseClass;
import com.vtigerv2.pom.HomePage;
import com.vtigerv2.pom.LeadPage;

public class EditLead extends BaseClass

 {
@Test
public void editLead()
{
	HomePage h = new HomePage(driver);
	h.getLeads().click();
	LeadPage l = new LeadPage(driver);
	
	l.getCheckbox().click();
	l.getEdit().click();
	l.getLastname().sendKeys("mishti");
	l.getSave().click();
}
}
