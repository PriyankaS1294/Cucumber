package com.adactin.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Final_Project.Base_Class;
import com.adactin.helper.File_Reader_Manager;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src//test//java//com//adactin/feature",
glue="com.adactin.stepdefinition",
monochrome=true,
dryRun=false,
strict=true,
tags=("~@regressionTest"),
plugin= {"html:Report/Html_Report",
		
		"pretty",
		
		"json:Reports/Cucumber.json",
		
		"com.cucumber.listener.ExtentCucumberFormatter:Report/ExtentReport.html"
		
}

)

public class Test_Runner {

	public static WebDriver driver;//---null
	
	@BeforeClass
	public static void set_Up() throws Throwable {
		
		String browser = File_Reader_Manager.getInstance().getInstanceCR().getBrowser();
		
		
		driver=Base_Class.browserLaunch(browser);
	}
	
	@AfterClass
	public static void tear_Down() {
		
		driver.close();

	}
}
