package com.vtigerv2.testcripts;

import java.io.File;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.vtigerv2.generics.BaseClass;
import com.vtigerv2.pom.ContactPage;
import com.vtigerv2.pom.HomePage;

public class Importcontact extends BaseClass
{
@Test
public void importcontacttest()
{
	HomePage h = new HomePage(driver);
	h.getContactlink().click();
	ContactPage c = new ContactPage(driver);
	c.getImportcontact().click();
	File f=new File("./src/test/resources/data/contact.csv");
	String p = f.getAbsolutePath();
	c.getChoosefile().sendKeys(p);
	c.getNextbtn().click();
	
	WebElement list = c.getDescriptiondropdown();
	Select s=new Select(list);
	s.selectByIndex(4);
	c.getImportbutton().click();
	c.getFinishbtn().click();
}
}
