package com.vtigerv2.testcripts;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.vtigerv2.generics.BaseClass;
import com.vtigerv2.pom.ContactPage;
import com.vtigerv2.pom.HomePage;

public class Duplicatecontact extends BaseClass

{
	@Test
	public void duplicatetest()
	{
		HomePage h = new HomePage(driver);
		h.getContactlink().click();
	ContactPage c = new	ContactPage(driver);
c.getDuplicateicon().click();
	WebElement list = c.getAvailablelist();
		Select s=new Select(list);
		s.selectByVisibleText("First Name");
		c.getRightbutton().click();
	c.getDuplicatebutton().click();
		
		
		
	}
	

}
