package com.pom.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booking_Confirmation {

public static WebDriver driver;
	
	public Booking_Confirmation(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//input[@type='button'])[3]")
	private WebElement logout;

	public WebElement getLogout() {
		return logout;
	}

	
	


	
	
	
	
	
	
}
