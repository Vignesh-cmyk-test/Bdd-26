package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Launchabrowser {
	
	@Given("Try to launch the browser")
	public void try_to_launch_the_browser() {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("Try to launch browser");
	}

	@When("Browser to be launched")
	public void browser_to_be_launched() {
	    System.out.println("Browser to be launched");
	}

	@When("verify the browser launched.")
	public void verify_the_browser_launched() {
	  System.out.println("Verify the browser launched");
	}

	@Then("validate the launch page.")
	public void validate_the_launch_page() {
	   System.out.println("Validate the launch page");
	  }

    }
