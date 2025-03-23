package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class demotest {
	
	WebDriver driver;
	@Given("user is on goggle page")
	public void user_is_on_goggle_page() {
		driver =new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
	    System.out.println("goggle web application");
	}

	@When("user enters item name in search textfeild")
	public void user_enters_item_name_in_textfeild() {
		driver.findElement(By.tagName("textarea")).sendKeys("Amazon");
	    System.out.println(" enter in the text feild ");
	}

	@And("user clicks on search button")
	public void user_clicks_on_search_button() {
		Actions action =new Actions(driver);
		action.keyDown(Keys.ENTER).perform();
	    System.out.println(" click on search button");
	}

	@Then("products details should display")
	public void products_details_should_display() {
		System.out.println("display the product details ");
		driver.getPageSource().contains("Amazon");
		
	}
	
	
}
