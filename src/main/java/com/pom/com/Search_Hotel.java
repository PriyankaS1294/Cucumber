package com.pom.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Hotel {

public static WebDriver driver;
	
	public Search_Hotel(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//select[@class='search_combobox'])[1]")
	private WebElement location;
	
	@FindBy(name="hotels")
	private WebElement hotels;
	
	@FindBy(name="room_type")
	private WebElement roomtype;
	
	@FindBy(name="room_nos")
	private WebElement roomnos;
	
	@FindBy(name="datepick_in")
	private WebElement indate;
	
	@FindBy(name="datepick_out")
	private WebElement outdate;
	
	@FindBy(name="adult_room")
	private WebElement adultroom;
	
	@FindBy(name="child_room")
	private WebElement childroom;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement submit;
	
	

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getRoomnos() {
		return roomnos;
	}

	public WebElement getIndate() {
		return indate;
	}

	public WebElement getOutdate() {
		return outdate;
	}

	public WebElement getAdultroom() {
		return adultroom;
	}

	public WebElement getChildroom() {
		return childroom;
	}

	

	public WebElement getSubmit() {
		return submit;
	}
	
}
