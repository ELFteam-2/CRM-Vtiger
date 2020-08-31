package com.vtigerv2.testcripts;

import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import com.vtigerv2.generics.BaseClass;
import com.vtigerv2.pom.ContactPage;
import com.vtigerv2.pom.HomePage;

public class Deletecontact extends BaseClass
{
@Test
public void deleteContacttest() throws InterruptedException
{
	HomePage h = new HomePage(driver);
	h.getContactlink().click();
	ContactPage c = new ContactPage(driver);
	c.getCheckbox().click();
	c.getDelbtn().click();
	Thread.sleep(3000);
	Alert a = driver.switchTo().alert();
	a.accept();
}
}
