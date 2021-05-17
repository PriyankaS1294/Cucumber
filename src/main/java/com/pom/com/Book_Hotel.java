package com.pom.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_Hotel {
public static WebDriver driver;
	
	public Book_Hotel(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//input[@class='reg_input'])[1]")
	private WebElement fName;
	
	@FindBy(name="last_name")
	private WebElement lName;
	
	@FindBy(name="address")
	private WebElement address;
	
	@FindBy(name="cc_num")
	private WebElement ccnum;
	
	@FindBy(name="cc_type")
	private WebElement cctype;
	
	@FindBy(name="cc_exp_month")
	private WebElement expDate;
	
	@FindBy(name="cc_exp_year")
	private WebElement expYear;
	
	@FindBy(name="cc_cvv")
	private WebElement cvv;
	
	

	@FindBy(xpath="(//input[@type='button'])[1]")
	private WebElement book;
	
	public WebElement getfName() {
		return fName;
	}

	public WebElement getlName() {
		return lName;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCcnum() {
		return ccnum;
	}

	public WebElement getCctype() {
		return cctype;
	}

	public WebElement getExpDate() {
		return expDate;
	}

	public WebElement getExpYear() {
		return expYear;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getBook() {
		return book;
	}
	
}
