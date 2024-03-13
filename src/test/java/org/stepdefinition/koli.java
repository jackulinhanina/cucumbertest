package org.stepdefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class koli extends classbase {
	@Given("To launch the browser and window maximize")
	public void to_launch_the_browser_and_window_maximize() {
	   launchBrowser();
	   windowMaximize();
	}

	@When("To launch the url")
	public void to_launch_the_url() {
	    launchUrl("https://www.facebook.com/");
	}

	@When("Enter the firstname")
	public void enter_the_firstname() throws InterruptedException {
		Thread.sleep(3000);
		WebElement cr = driver.findElement(By.xpath("//a[text()='Create new account']"));
		cr.click();
		Thread.sleep(3000);
	    WebElement f = driver.findElement(By.name("firstname"));
	    f.sendKeys("elvina");
	}

	@When("Enter the surname")
	public void enter_the_surname(io.cucumber.datatable.DataTable d) {
		List<String> l2 = d.asList();
		WebElement l = driver.findElement(By.name("lastname"));
		passText(l2.get(3), l);
	}

	@When("Enter the mobile number or email address")
	public void enter_the_mobile_number_or_email_address(DataTable d) {
	    List<List<String>> l1 = d.asLists();
	    WebElement e = driver.findElement(By.name("reg_email__"));
	    passText(l1.get(1).get(1), e);
	}

	@When("Enter new password")
	public void enter_new_password() {
	    WebElement p = driver.findElement(By.id("password_step_input"));
	    p.sendKeys("hello");
	}

	@Then("close the browser")
	public void close_the_browser() {
	    closeEntireBrowser();
	}



}