package com.vtigerv2.testcripts;

import org.testng.annotations.Test;

import com.vtigerv2.generics.BaseClass;
import com.vtigerv2.pom.HomePage;
import com.vtigerv2.pom.LeadPage;

public class DeleteLead extends BaseClass

{
	@Test
	public void deleteLead()
	{
		HomePage h = new HomePage(driver);
		h.getLeads().click();
		LeadPage l = new LeadPage(driver);
		l.getLeadallcheckbox().click();
		l.getDeleteallbtn();

}
}