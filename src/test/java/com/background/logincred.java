package com.background;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class logincred {
	WebDriver driver;
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
	    driver= new ChromeDriver();
	    driver.get("https://www.saucedemo.com/");
	    driver.manage().window().maximize();
	}

	@When("user enter valid username and password")
	public void user_enter_valid_username_and_password() {
	    driver.findElement(By.id("user-name")).sendKeys("standard_user");
	    driver.findElement(By.id("password")).sendKeys("secret_sauce");
	}
	@And("user click on login button")
	public void user_click_on_login_button() {
	   driver.findElement(By.id("login-button")).click();
	}

	@Then("user is on homepage")
	public void user_is_on_homepage() {
	driver.getPageSource().contains("products");
	driver.quit();
	}
	
	@When("user enter invalid username and password")
	public void user_enter_invalid_username_and_password() {
		 driver.findElement(By.id("user-name")).sendKeys("standard_user");
		    driver.findElement(By.id("password")).sendKeys("omkar");
	}
	@Then("Error message is dispayed")
	public void error_message_is_dispayed() {
		boolean error = driver.getPageSource().contains("Username and password do not match any user in this service");
		System.out.println(error);
		driver.quit();
	}

}
