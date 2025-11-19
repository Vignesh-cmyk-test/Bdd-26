package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Thanos2 {
	
	  // Positive Scenario
    @Given("Thanos got to have infinity stones new")
    public void thanosGotToHaveInfinityStonesNew() {
        System.out.println("Thanos has collected all the infinity stones.");
    }

    @When("Thanos snaps his finger new")
    public void thanosSnapsHisFingerNew() {
        System.out.println("Thanos snaps his fingers.");
    }

    @Then("Half of the living died new.")
    public void halfOfTheLivingDiedNew() {
        System.out.println("Half of the universe vanished.");
    }


    // Negative Scenario
    @Given("Thanos prevents enemies to have infinity stones new")
    public void thanosPreventsEnemiesToHaveInfinityStonesNew() {
        System.out.println("Thanos prevents the enemies from collecting the stones.");
    }

    @When("Thanos kills the enimies new")
    public void thanosKillsTheEnimiesNew() {
        System.out.println("Thanos defeats all the enemies.");
    }

    @Then("Full world is living peacefully new.")
    public void fullWorldIsLivingPeacefullyNew() {
        System.out.println("The world is at peace.");
    }


    // Neutral Scenario
    @Given("Thanos dont care about infinity stones new")
    public void thanosDontCareAboutInfinityStonesNew() {
        System.out.println("Thanos does not care about the infinity stones.");
    }

    @When("Thanos enjoys butter chicken new")
    public void thanosEnjoysButterChickenNew() {
        System.out.println("Thanos enjoys eating butter chicken.");
    }

    @Then("Every saturay thanos goes to party new.")
    public void everySaturayThanosGoesToPartyNew() {
        System.out.println("Every Saturday, Thanos goes to a party.");
    }

}
