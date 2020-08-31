package com.vtigerv2.testcripts;

import java.io.File;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.vtigerv2.generics.BaseClass;
import com.vtigerv2.pom.HomePage;
import com.vtigerv2.pom.ServicePage;

public class Importservices  extends BaseClass
{
@Test
public void importServices()
{
	
	HomePage h = new HomePage(driver);
	Actions a = new Actions(driver);
	a.moveToElement(h.getMorelink()).perform();
	ServicePage s = new ServicePage(driver);
	s.getServices().click();
	s.getImportservices().click();
	File f=new File("./src/test/resources/data/contact.csv");
	String path = f.getAbsolutePath();
	s.getImportfile().sendKeys(path);
	s.getImportnxt().click();
	WebElement drop = s.getImportcrmfielddrop();
	Select s2 = new Select(drop);
	s2.selectByValue("servicename");
	s.getImportdefault().sendKeys("manasa");
	s.getImportbtn().click();
	s.getImportfinsh().click();

}
}
