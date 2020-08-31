package com.vtigerv2.testcripts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.vtigerv2.generics.BaseClass;
import com.vtigerv2.pom.HomePage;
import com.vtigerv2.pom.RecycleBinPage;

public class RestoreSevices extends BaseClass {
	@Test
	public void testRestoreServices() {
		Reporter.log("RestoreServices", true);
		HomePage h=new HomePage(driver);
		Actions a2=new Actions(driver);
		WebElement more1 = h.getMoredropdownlink();
		Reporter.log("move to more link", true);
		a2.moveToElement(more1).perform();
		Reporter.log("clicked on recyclebinn link", true);
		h.getRecycleBinLink().click();
		RecycleBinPage r=new RecycleBinPage(driver);
		Reporter.log("clicked on selectmodule dropdown", true);
		Select s1=new Select(r.getSelectmoduledropdown());
		Reporter.log("clicked on Services optionn", true);
		s1.selectByVisibleText("Services");
		int count1=r.getCurrentpagereq().size();
		Reporter.log("clicked onn Service checkbox", true);
		r.getCurrentpagereq().get(count1-1).click();
		Reporter.log("clicked on restore button", true);
		r.getRestorebtn().click();
		Reporter.log("handled alert", true);
		Alert alr=driver.switchTo().alert();
		alr.accept();
	}

}
