package com.vtigerv2.testcripts;

import java.io.File;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.vtigerv2.generics.BaseClass;
import com.vtigerv2.pom.HomePage;
import com.vtigerv2.pom.OpertunityPage;

public class Exportopertunity  extends BaseClass {
	
@Test
public void exportOppertunity()
{
	HomePage h = new HomePage(driver);
	h.getCreateaoppurtunity().click();
	OpertunityPage o = new OpertunityPage(driver);
	o.getExportoppertunity().click();
	o.getWithoutsearch().click();
	o.getExportalldata().click();
	o.getExportoppertunitiesbtn().click();
	
	
	
	
}
}
