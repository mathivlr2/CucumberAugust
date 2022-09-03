package org.stepdefinition;

import org.junit.Assert;
import org.pagerepo.LoginRepo;

import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepdef {
	@Given("Open the Facebook and launch the application")
	public void open_the_Facebook_and_launch_the_application() {
		Hook.driver.get("https://www.facebook.com");
	}

	@When("Enter the Username as {string} and Password as {string}")
	public void enter_the_Username_and_Password(String username, String password) {
		LoginRepo l = new LoginRepo();
		Hook.type(username, l.getUsername());
		Hook.type(password, l.getPassword());
		Assert.assertTrue(true);
	}
	
	@When("Enter the Username and Password")
	public void sampleaugwhen() {
		LoginRepo l = new LoginRepo();
		Hook.type("John", l.getUsername());
		Hook.type("pwd", l.getPassword());
	}
	
	@And("supporting statement one")
	public void s1()
	{
		System.out.println("AND");
	}
	
	@But("supporting statement two")
	public void s2()
	{
		System.out.println("BUT");
	}

	@Then("Close the browser")
	public void close_the_browser() {
		System.out.println("Then statement");
	}
}
