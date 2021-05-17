package com.adactin.helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.pom.com.Book_Hotel;
import com.pom.com.Booking_Confirmation;
import com.pom.com.Login;
import com.pom.com.Search_Hotel;
import com.pom.com.Select_Hotel;

public class Page_Object_Manager {

	
	public WebDriver driver; //---null
	private Login lp;
	
	private Search_Hotel search;
	
	private Select_Hotel select;
	
	private Book_Hotel book;
	
	private Booking_Confirmation cnfm;
	
	
	public Page_Object_Manager(WebDriver driver2) {
		
		this.driver= driver2;
		PageFactory.initElements(driver, this);
	}


	public Login getIntanceLogin() {
		
        lp=new Login(driver);
        return lp;
	}
	
	
	public Search_Hotel getInstanceSearch_Hotel() {
		
		search =new Search_Hotel(driver);
		return search;

	}
	
	public Select_Hotel getInstanceSelect_Hotel() {
		select = new Select_Hotel(driver);
		return select;

	}
	
	
	public Book_Hotel getInstanceBook_Hotel() {
		book = new Book_Hotel(driver);
		return book;

	}
	
	public Booking_Confirmation getInstanceBooking_Confirmation() {
		cnfm=new Booking_Confirmation(driver);
		return cnfm;

	}
	
	
	
}
