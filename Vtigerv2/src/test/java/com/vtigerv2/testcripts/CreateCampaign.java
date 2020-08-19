package com.vtigerv2.testcripts;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.vtigerv2.generics.BaseClass;
import com.vtigerv2.pom.HomePage;

@Listeners(com.vtigerv2.generics.Listener.class)
public class CreateCampaign extends BaseClass {
	@Test
	public void testCreateCampaign() {
		HomePage h=new HomePage(driver);
		
	}
	

}
