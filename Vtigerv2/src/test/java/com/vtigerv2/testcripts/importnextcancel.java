package com.vtigerv2.testcripts;

import java.io.File;

import org.testng.annotations.Test;

import com.vtigerv2.generics.BaseClass;
import com.vtigerv2.pom.HomePage;
import com.vtigerv2.pom.OpertunityPage;

public class importnextcancel extends BaseClass
{
@Test
public void importnextCancel()
{
	HomePage h = new HomePage(driver);
	h.getCreateaoppurtunity().click();
	OpertunityPage o = new OpertunityPage(driver);
	o.getImportopertunity().click();
	File f=new File("./src/test/resources/data/contact.csv");
	String path = f.getAbsolutePath();
	o.getImportfile().sendKeys(path);
	o.getImportcancel();
}
}
