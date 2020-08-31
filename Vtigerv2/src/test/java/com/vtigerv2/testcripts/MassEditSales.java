package com.vtigerv2.testcripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.vtigerv2.generics.BaseClass;
import com.vtigerv2.generics.FileLib;
import com.vtigerv2.pom.HomePage;
import com.vtigerv2.pom.MassEditPage;
import com.vtigerv2.pom.NewCustomViewPage;
import com.vtigerv2.pom.SalesOrderPage;
@Listeners(com.vtigerv2.generics.Listener.class)
public class MassEditSales extends BaseClass{
	@Test
	public void testMassEditSales() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {
		//Click on More Dropdown 
		HomePage h=new HomePage(driver);
	    Actions a=new Actions(driver);
	    a.moveToElement(h.getMorelink()).perform();
	    // Click on Sales Order.
	    h.getSalesorderlink().click();
	    //Click on Checkboxes of Multiple Sales Order 
	    SalesOrderPage s=new SalesOrderPage(driver);
	    int count=s.getCheckboxes().size();
	    for(int i=0;i<count;i++) {
	    	if(i<2) {
	    		s.getCheckboxes().get(i).click();
	    	}
	    }
	    // click on Mass Edit Button
	    s.getMasseditbtn().click();
	    FileLib f=new FileLib();
		   String subject = f.getExceldata("SalesOrder", 2, 0);
		   //Click on Subject text Field, 
	    MassEditPage me=new MassEditPage(driver);
	    me.getSubjectCheckbox().click();
	    //Enter a Subject Name
	    me.getSubjecttxtbox().sendKeys(subject);
	    //  Click on Save.
	    me.getSavebtn().click();
	    Reporter.log("Multiple sales orders are edited",true);
	}
}
