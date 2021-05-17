package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.Final_Project.Base_Class;
import com.adactin.helper.File_Reader_Manager;
import com.adactin.helper.Page_Object_Manager;
import com.adactin.runner.Test_Runner;
import com.pom.com.Book_Hotel;

import com.pom.com.Booking_Confirmation;
import com.pom.com.Login;
import com.pom.com.Search_Hotel;
import com.pom.com.Select_Hotel;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_Definition extends Base_Class{

	public static WebDriver driver =Test_Runner.driver;
	
	public static Page_Object_Manager pom = new Page_Object_Manager(driver);
//	public static Login lp= new Login(driver) ;
//	public static Search_Hotel search= new Search_Hotel(driver) ;
//    public static Select_Hotel select= new Select_Hotel(driver) ;
//	public static Book_Hotel book= new Book_Hotel(driver) ;
//	public static Booking_Confirmation cnfm= new Booking_Confirmation(driver) ;
	
	
	@Given("^user Launch The Application$")
	public void user_Launch_The_Application() throws Throwable {
		String url = File_Reader_Manager.getInstance().getInstanceCR().getUrl();
		
		launchUrl(url);
	   //launchUrl("https://adactinhotelapp.com/index.php");
	}
	
	@When("^user Enter The \"([^\"]*)\" In Username Field$")
	public void user_Enter_The_In_Username_Field(String username) throws Throwable {
	  inputValue(pom.getIntanceLogin().getUsername(), username);
	}

	@When("^user Enter The \"([^\"]*)\" In Password Field$")
	public void user_Enter_The_In_Password_Field(String password) throws Throwable {
	   inputValue(pom.getIntanceLogin().getPassword(), password);
	}
	

//	@When("^user Enter The Username In Username Field$")
//	public void user_Enter_The_Username_In_Username_Field() throws Throwable {
//	    inputValue(pom.getIntanceLogin().getUsername(), "Priyanka12");
//	}
//
//	@When("^user Enter The Password In Password Field$")
//	public void user_Enter_The_Password_In_Password_Field() throws Throwable {
//	   inputValue(pom.getIntanceLogin().getPassword(), "Prinku@2020");
//	}

	@Then("^user Click On The Login Button And Navigates To Search_Hotel Page$")
	public void user_Click_On_The_Login_Button_And_Navigates_To_Search_Hotel_Page() throws Throwable {
	   clickOn(pom.getIntanceLogin().getLogin());
	   Thread.sleep(2000);
	}
   
	@When("^user Select The Location In Location Field$")
	public void user_Select_The_Location_In_Location_Field() throws Throwable {
	  
	dropDownValue(pom.getInstanceSearch_Hotel().getLocation(), "London");
	}

	@When("^user Select The Hotel In Hotels Field$")
	public void user_Select_The_Hotel_In_Hotels_Field() throws Throwable {
	  
	dropDownValue(pom.getInstanceSearch_Hotel().getHotels(), "Hotel Creek");
	}

	@When("^user Select The Room Type In Room Type Field$")
	public void user_Select_The_Room_Type_In_Room_Type_Field() throws Throwable {
	    dropDownValue(pom.getInstanceSearch_Hotel().getRoomtype(), "Double");
	}

	@When("^user Select The Number Of Rooms In Number Of Rooms Field$")
	public void user_Select_The_Number_Of_Rooms_In_Number_Of_Rooms_Field() throws Throwable {
	    dropDownIndex(pom.getInstanceSearch_Hotel().getRoomnos(),2);
	}

	@When("^user Enter The Check In Date In Check In Date Field$")
	public void user_Enter_The_Check_In_Date_In_Check_In_Date_Field() throws Throwable {
	   inputValue(pom.getInstanceSearch_Hotel().getIndate(), "12/05/2021");
	}

	@When("^user Enter The Check Out Date In Check Out Date Field$")
	public void user_Enter_The_Check_Out_Date_In_Check_Out_Date_Field() throws Throwable {
	    inputValue(pom.getInstanceSearch_Hotel().getOutdate(), "13/05/2021");
	}

	@When("^user Select The Adults Per Room In Adults Per Room Field$")
	public void user_Select_The_Adults_Per_Room_In_Adults_Per_Room_Field() throws Throwable {
		dropDownIndex(pom.getInstanceSearch_Hotel().getAdultroom(),1);
	}

	@When("^user Select The Children Per Room In Children Per Room$")
	public void user_Select_The_Children_Per_Room_In_Children_Per_Room() throws Throwable {
	    dropDownIndex(pom.getInstanceSearch_Hotel().getChildroom(), 0);
	}

	@Then("^user Click On Search Button And Navigates To Select_Hotel Page$")
	public void user_Click_On_Search_Button_And_Navigates_To_Select_Hotel_Page() throws Throwable {
	    clickOn(pom.getInstanceSearch_Hotel().getSubmit());
	    Thread.sleep(2000);
	}

	@When("^user Click On Select Button In Select Field$")
	public void user_Click_On_Select_Button_In_Select_Field() throws Throwable {
	    clickOn(pom.getInstanceSelect_Hotel().getButton());
	}

	@Then("^user Click On Continue Button And Navigates To Book_Hotel Page$")
	public void user_Click_On_Continue_Button_And_Navigates_To_Book_Hotel_Page() throws Throwable {
	    clickOn(pom.getInstanceSelect_Hotel().getCtn());
	    Thread.sleep(5000);
	}

	@When("^user Enter The First Name In First Name Field$")
	public void user_Enter_The_First_Name_In_First_Name_Field() throws Throwable {
	    inputValue(pom.getInstanceBook_Hotel().getfName(), "Priyanka");
	}

	@When("^user Enter The Last Name In Last Name Field$")
	public void user_Enter_The_Last_Name_In_Last_Name_Field() throws Throwable {
	    inputValue(pom.getInstanceBook_Hotel().getlName(), "S");
	}

	@When("^user Enter The Billing Address In Billing Address Field$")
	public void user_Enter_The_Billing_Address_In_Billing_Address_Field() throws Throwable {
	   inputValue(pom.getInstanceBook_Hotel().getAddress(), "32 Raja Street");
	}

	@When("^user Enter The Credit Card No In Credit Card No Field$")
	public void user_Enter_The_Credit_Card_No_In_Credit_Card_No_Field() throws Throwable {
	   inputValue(pom.getInstanceBook_Hotel().getCcnum(), "2345678901234567");
	}

	@When("^user Select The Credit Card Type In Credit Card Type Field$")
	public void user_Select_The_Credit_Card_Type_In_Credit_Card_Type_Field() throws Throwable {
	    dropDownValue(pom.getInstanceBook_Hotel().getCctype(), "VISA");
	}

	@When("^user Select The Month In Month Field$")
	public void user_Select_The_Month_In_Month_Field() throws Throwable {
	    dropDownIndex(pom.getInstanceBook_Hotel().getExpDate(),2);
	}

	@When("^user Select The Year In Year Field$")
	public void user_Select_The_Year_In_Year_Field() throws Throwable {
	   dropDownValue(pom.getInstanceBook_Hotel().getExpYear(), "2022");
	}

	@When("^user Enter The CVV Number In CVV Number Field$")
	public void user_Enter_The_CVV_Number_In_CVV_Number_Field() throws Throwable {
	    inputValue(pom.getInstanceBook_Hotel().getCvv(), "234");
	}

	@Then("^user Click On Book Now Button And Navigates To Booking_Confirmation Page$")
	public void user_Click_On_Book_Now_Button_And_Navigates_To_Booking_Confirmation_Page() throws Throwable {
		clickOn(pom.getInstanceBook_Hotel().getBook());
		 Thread.sleep(5000);
	}

	
    @Then("^user Click On Logout Button$")
	public void user_Click_On_Logout_Button() throws Throwable {
	    clickOn(pom.getInstanceBooking_Confirmation().getLogout());
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	













	
}
