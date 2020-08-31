package com.vtigerv2.testcripts;

import java.io.File;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.vtigerv2.generics.BaseClass;
import com.vtigerv2.pom.HomePage;
import com.vtigerv2.pom.LeadPage;

public class Importlead extends BaseClass
{
	@Test
	public void importLead()
	{
		HomePage h = new HomePage(driver);
	h.getLeads().click();
	LeadPage l = new LeadPage(driver);
	l.getImportlead().click();
	
	
	
	File f=new File("./src/test/resources/data/contact.csv");
	String path = f.getAbsolutePath();
	l.getImportfile().sendKeys(path);
	l.getImportnext().click();
WebElement list = l.getCrmfielddrop();
Select s = new Select(list);
s.selectByValue("lastname");
l.getDefaultvalue().sendKeys("sadiya");
s.selectByValue("company");
//l.getDefaultvalue().sendKeys("techmahindra");

//l.getFinalimport().click();
	
	
	
	
	
	



}
}