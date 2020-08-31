package com.vtigerv2.testcripts;

import java.io.File;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.vtigerv2.generics.BaseClass;
import com.vtigerv2.pom.HomePage;
import com.vtigerv2.pom.OpertunityPage;

public class importoppertunity extends BaseClass
{
	@Test
	public void importOpertunity() throws InterruptedException

	{	

		HomePage h = new HomePage(driver);
		h.getCreateaoppurtunity().click();
		OpertunityPage o = new OpertunityPage(driver);
		o.getImportopertunity().click();
		File f=new File("./src/test/resources/data/contact.csv");
		String path = f.getAbsolutePath();
		o.getImportfile().sendKeys(path);
		o.getImportnextbtn().click();
		WebElement list = o.getCrmfield1();
		Select s=new Select(list);
		
		s.selectByValue("potentialname");
		o.getDefaultvalue().sendKeys("faisal");
		
		Thread.sleep(3000);
		
		
		//s.selectByValue("sales_stage");
		o.getCrmfieldimportbtn().click();
		Alert a = driver.switchTo().alert();
		a.accept();
		
	}
	

	
}
