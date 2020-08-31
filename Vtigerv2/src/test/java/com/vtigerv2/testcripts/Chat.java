package com.vtigerv2.testcripts;

import java.io.IOException;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.vtigerv2.generics.BaseClass;
import com.vtigerv2.pom.ChatPopPage;
import com.vtigerv2.pom.HomePage;
import com.vtigerv2.pom.QuotesPage;

public class Chat extends BaseClass
{
	@Test
	public void testCreateQuote() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		HomePage h=new HomePage(driver);
		//move to more
		WebElement MoreOption=h.getMoreDropDown();
		Actions a=new Actions(driver);
    	a.moveToElement(MoreOption).perform();
    	//click on quotes link
    	h.getQuoteLink().click();
    	Reporter.log("Quotes Page displayed",true);
    	
    	QuotesPage q=new QuotesPage(driver);
    	//click on chat button
    	q.getChatBtn().click();
    	Reporter.log("Chat pop-up Page displayed",true);
    	
    	String parentWindow=driver.getWindowHandle();
		Set<String> AllwindowHandles=driver.getWindowHandles();
		for(String window:AllwindowHandles)
		{
			if(!(parentWindow.equals(window)))
			{
				driver.switchTo().window(window);
				ChatPopPage c=new ChatPopPage(driver);
				String ChatData=f.getExceldata("Sheet1", 1, 10);
				//enter message into chat text box
				c.getChatTxtBox().sendKeys(ChatData);
				Reporter.log("entered message",true);
				//click on send button
				c.getChatSendBtn().click();
				Reporter.log("clicked on send button",true);
			}
		}
		driver.switchTo().window(parentWindow);
	}
}
