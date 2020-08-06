package com.web.bdd.stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefination {
	
 WebDriver driver=null;
	@Given("^User is on login page$")
	public void user_is_on_login_page() throws Throwable {
		 System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://thetestingworld.com/testings/");
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.findElement(By.xpath("//input[@id='tab2']/parent::li")).click();;
	}

	@When("^User enters username$")
	public void user_enters_username() throws Throwable {
	    driver.findElement(By.name("_txtUserName")).sendKeys("testing");
	}

	@When("^User enters password$")
	public void user_enters_password() throws Throwable {
		  driver.findElement(By.name("_txtPassword")).sendKeys("testing");
	  
	}

	@When("^User clicks on signin button$")
	public void user_clicks_on_signin_button() throws Throwable {
		driver.findElement(By.xpath("//input[@value='Login']")).click();
	}

	@Then("^User should be logged in$")
	public void user_should_be_logged_in() throws Throwable {
	    
	}

	@When("^User click on logout button$")
	public void user_click_on_logout_button() throws Throwable {
	 
	}

	@Then("^User should be logged out$")
	public void user_should_be_logged_out() throws Throwable {
	    
	}

	@Given("^User is on Registered page$")
	public void user_is_on_Registered_page() throws Throwable {
	    
	}

	@When("^User enters email address$")
	public void user_enters_email_address() throws Throwable {
	  
	}

	@When("^User enters confirm password$")
	public void user_enters_confirm_password() throws Throwable {
	   
	}

	@When("^User enters date of birth$")
	public void user_enters_date_of_birth() throws Throwable {
	    
	}

	@When("^User enters phone number$")
	public void user_enters_phone_number() throws Throwable {
	  
	}

	@When("^User enters address$")
	public void user_enters_address() throws Throwable {
	  
	}

	@When("^User click on home Address Page$")
	public void user_click_on_home_Address_Page() throws Throwable {

	}

	@When("^User select gender$")
	public void user_select_gender() throws Throwable {


	}

	@When("^User select Country$")
	public void user_select_Country() throws Throwable {
	  
	}

	@When("^User select State$")
	public void user_select_State() throws Throwable {


	}

	@When("^User select city$")
	public void user_select_city() throws Throwable {


	}

	@When("^User enters Zipcode$")
	public void user_enters_Zipcode() throws Throwable {


	}

	@When("^User click on agree checkbox$")
	public void user_click_on_agree_checkbox() throws Throwable {


	}

	@When("^User click on signup button$")
	public void user_click_on_signup_button() throws Throwable {


	}

	@Then("^User Account should be created$")
	public void user_Account_should_be_created() throws Throwable {


	}


}
