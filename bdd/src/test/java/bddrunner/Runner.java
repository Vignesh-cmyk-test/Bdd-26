package bddrunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features = "features/Thanosbg.feature", 
                             glue = {"stepdefinitions","hooks"},
                             dryRun = false,
                             monochrome = true,
                             tags = "@backtag",
                             plugin = { "pretty",
                            	        "html:target/cucumber-reports/html-report",
                            	        "json:target/cucumber-reports/cucumber.json"},
                             publish = true
                             
                             )

public class Runner {
	
  }
