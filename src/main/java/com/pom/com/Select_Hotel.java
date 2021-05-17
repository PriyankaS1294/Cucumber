package com.pom.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_Hotel {

public static WebDriver driver;
	
	public Select_Hotel(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@type='radio']")
	private WebElement button;
	
	

	@FindBy(xpath="//input[@type='submit']")
	private WebElement ctn;
	
	public WebElement getButton() {
		return button;
	}

	public WebElement getCtn() {
		return ctn;
	}

	
	
	
	
}
