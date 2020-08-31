package com.vtigerv2.testcripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.vtigerv2.generics.BaseClass;
import com.vtigerv2.pom.ContactPage;
import com.vtigerv2.pom.HomePage;

public class Createcontact extends BaseClass
{
@Test
public void createcontacttest() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
{
	 
	Reporter.log("create a contact");
	HomePage h = new HomePage(driver);
	//Actions a=new Actions(driver);
	h.getContactlink().click();
	//wait for 3 sec
	Thread.sleep(3000);
	
	 String firstname = f.getExceldata("contact",0,1);
	 String lastname = f.getExceldata("contact",1,1);
	 //create an object for contactpage pom class
	 ContactPage c=new  ContactPage(driver);
	 //create a contact
	 c.getCreatecontact().click();
	
	 c.getFname().sendKeys(firstname);
	 c.getLname().sendKeys(lastname);
	 c.getSavebtn().click();
	 
}
}
