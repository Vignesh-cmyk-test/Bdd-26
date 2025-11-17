package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Thanos {
	
	@Given("Thanos got to have infinity stones")
	public void thanos_got_to_have_infinity_stones() {
	    System.out.println("Thanos got to have infinity stones");
	}

	@When("Thanos snaps his finger")
	public void thanos_snaps_his_finger() {
	  System.out.println("Thanos snaps his finger");
	}

	@Then("Half of the living died.")
	public void half_of_the_living_died() {
	   System.out.println("Half of the living died");
	}

}
