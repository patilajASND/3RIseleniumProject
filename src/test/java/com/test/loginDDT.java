package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginDDT {
	WebDriver driver;
	
	@Given("user is on saucedemo page")
	public void user_is_on_saucedemo_page() {
	    driver =new ChromeDriver();
	    driver.get("https://www.saucedemo.com/");
	    driver.manage().window().maximize();
	   
	}

	@When("^user enters the (.*) and (.*)$")
	public void user_enters_the_username_and_password(String username,String password) {
	    driver.findElement(By.id("user-name")).sendKeys(username);
	    driver.findElement(By.id("password")).sendKeys(password);
	}

	@And("user clicks on login  button")
	public void user_clicks_on_login_button() {
	    driver.findElement(By.id("login-button")).click();
	}

	@Then("user should Navigate to homepage")
	public void user_should_navigate_to_homepage() {
	    System.out.println("user is in home page");
	}

}
