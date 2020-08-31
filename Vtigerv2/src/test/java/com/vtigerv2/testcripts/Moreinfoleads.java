package com.vtigerv2.testcripts;

import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.vtigerv2.generics.BaseClass;
import com.vtigerv2.pom.HomePage;
import com.vtigerv2.pom.LeadPage;
import com.vtigerv2.pom.ServicePage;

public class Moreinfoleads extends BaseClass
{
	@Test
	public void leads() throws InterruptedException
	{ 
		Reporter.log("create a lead");
		//create object of HomePage pom class
		HomePage h = new	HomePage(driver);
		//clicks on leads link in homepage
		h.getLeads().click();
		//create a object of leadpage pom class
		LeadPage l = new LeadPage(driver);
		//click on createleadbutton
		l.getCreatelead().click();
		/**WebElement drop = l.getFirstname();
		Select s1 = new Select(drop);
		s1.selectByIndex(3);**/
		l.getLastname().sendKeys("zubair");
		l.getCompany().sendKeys("gnh solution");
		l.getSave().click();
		Thread.sleep(3000);
		h.getHomebtn().click();
		
		Reporter.log("selecting contact through more information");
        //to perform mousehover action using actions class
		Actions a = new Actions(driver);
		//mousehover to morelink
		a.moveToElement(h.getMorelink()).perform();
		//creating servicepage object
		ServicePage s = new ServicePage(driver);
		//click on services link
		s.getServices().click();
		//click on repairlink in service page
		s.getRepairlink().click();
		//mousehover to moreinformationlink
		a.moveToElement(s.getMoreinformation()).perform();
		//select Leads from dropdown;
		s.getLeaddrop().click();
		//clicks on selectlead button
		s.getSelectlead().click();
		//To handle parent window
		String parent = driver.getWindowHandle();
		//To handle child windows;
		Set<String> allwh = driver.getWindowHandles();
		for(String wh:allwh)
		{
			if(!(wh.equals(parent)))
			{
				driver.switchTo().window(wh);
				Thread.sleep(3000);
				s.getLeadname().click();
			}}
		for(String wh:allwh)
		{
			if((wh.equals(parent)))
			{
				driver.switchTo().window(wh);
			}
		}
	}
	
}
