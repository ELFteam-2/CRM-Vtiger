package com.vtigerv2.testcripts;

import org.testng.annotations.Test;

import com.vtigerv2.generics.BaseClass;
import com.vtigerv2.pom.HomePage;
import com.vtigerv2.pom.OpertunityPage;

public class Searchoppertunity extends BaseClass
{
	@Test
	public void searchOpertunity()
	{
HomePage h = new HomePage(driver);
h.getCreateaoppurtunity().click();
OpertunityPage o = new OpertunityPage(driver);
o.getSearchbtn().click();
	}
}



