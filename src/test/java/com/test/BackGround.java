package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BackGround {

	WebDriver driver;
	@Given("user is on homepage page")
	public void user_is_on_login_page() {
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
	    
	}

	@When("Click on add to cart button of bag")
	public void click_on_add_to_cart_button_of_bag() {
	    driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
	}

	@Then("bag should move to cart page")
	public void bag_should_move_to_cart_page() {
	    driver.findElement(By.id("shopping_cart_container")).click();
	    driver.getPageSource().concat(" Backpack");
	    driver.quit();
	}

	@When("Click on add to cart button of tshirt")
	public void click_on_add_to_cart_button_of_tshirt() {
	    driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt")).click();
	}

	@Then("tshirt should move to cart page")
	public void tshirt_should_move_to_cart_page() {
	    driver.findElement(By.id("shopping_cart_container")).click();
	    driver.getPageSource().contains("Bolt T-Shirt");
	    driver.quit();
	}
	
	
}
