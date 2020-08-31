package com.vtigerv2.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChatPopPage 
{
	@FindBy(xpath="//input[@class='cinput']")
	private WebElement ChatTxtBox;
	
	@FindBy(xpath="//td[@class='csubmit']")
	private WebElement ChatSendBtn;
	
	public WebElement getChatTxtBox() {
		return ChatTxtBox;
	}

	public WebElement getChatSendBtn() {
		return ChatSendBtn;
	}
	public ChatPopPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);	
	}
}
