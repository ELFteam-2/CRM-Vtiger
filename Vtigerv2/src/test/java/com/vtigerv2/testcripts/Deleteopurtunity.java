package com.vtigerv2.testcripts;

import org.testng.annotations.Test;

import com.vtigerv2.generics.BaseClass;
import com.vtigerv2.pom.HomePage;
import com.vtigerv2.pom.OpertunityPage;

public class Deleteopurtunity extends BaseClass
{
@Test
public void deleteOpurtunity()
{
	HomePage h = new HomePage(driver);
	h.getCreateaoppurtunity().click();
	OpertunityPage o = new OpertunityPage(driver);
	o.getCheckbox().click();
	o.getDelete();
}
}
