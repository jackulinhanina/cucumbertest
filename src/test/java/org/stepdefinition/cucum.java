package org.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class cucum extends classbase {
	@Given("To launch browserand maximise the window")
	public void to_launch_browserand_maximise_the_window() {
		launchBrowser();
		windowMaximize();

	}

	@When("To launch the url of flipkart application")
	public void to_launch_the_url_of_flipkart_application() {
		launchUrl("https://www.flipkart.com/");
	}

	@When("To pass the valid username in email field")
	public void to_pass_the_valid_username_in_email_field() {
		WebElement cl = driver.findElement(By.xpath("//span[contains(text(),'Login')]"));
		cl.click();
		WebElement lo = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		lo.sendKeys("elvina@gmail.com");

	}

	@Then("To close the entire browser")
	public void to_close_the_entire_browser() {
		closeEntireBrowser();

	}

	@Given("user has to launch the browser and maximise the window")
	public void user_has_to_launch_the_browser_and_maximise_the_window() {
		launchBrowser();
		windowMaximize();

	}

	@When("user has to hit the flipkart url")
	public void user_has_to_hit_the_facebook_url() {
		launchUrl("https://www.flipkart.com/");

	}

	@When("user has to pass the data{string} in email field")
	public void user_has_to_pass_the_data_in_email_field(String em) {
		WebElement cl1 = driver.findElement(By.xpath("//span[contains(text(),'Login')]"));
		cl1.click();
		WebElement lo = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		lo.sendKeys("elvinahanina@gmail.com");
		WebElement lo1 = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		lo1.sendKeys("hello@gmail.com");
		WebElement lo2 = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		lo2.sendKeys("rishiya@gmail.com");
		WebElement lo3 = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		lo3.sendKeys("hanina@gmail.com");
		WebElement lo4 = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		lo4.sendKeys("jackulin@gmail.com");
	}

	@Then("To close the browser")
	public void to_close_the_browser() {

	}

}
