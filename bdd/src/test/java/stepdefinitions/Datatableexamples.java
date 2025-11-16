package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Datatableexamples {
	
	static WebDriver driver;
	
	@Given("Datatable is open the browser Headerexample")
	public void datatable_is_open_the_browser_headerexample() {
	    
		   driver = new ChromeDriver();
		   driver.get("https://demoqa.com/login");
		   driver.manage().window().maximize();
		   
		   WebElement logbutton = driver.findElement(By.xpath("//button[@type='button']"));
			 
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("arguments[0].scrollIntoView(true)", logbutton);
	}
	
	@When("Datatable is Enter the user credentials\"Test\" and {string} Headerexample")
	public void datatable_is_enter_the_user_credentials_test_and_headerexample(String username,String Password) {
	  
		driver.findElement(By.xpath("//input[@placeholder='UserName']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(Password);
	}

	@And("Datatable is verify into the browser launched Headerexample")
	public void datatable_is_verify_into_the_browser_launched_headerexample() {
		
		 WebElement logbutton = driver.findElement(By.xpath("//button[@type='button']"));
		 logbutton.click();
	}

	@Then("Datatable is Verify the loginpage Headerexample.")
	public void datatable_is_verify_the_loginpage_headerexample() {
	    
		boolean currenturl = driver.getCurrentUrl().contains("register");
		   
		  if(currenturl) {
			  System.out.println("Login failed");
		  }else {
			  System.out.println("Login Passed");
		  }
	}

}
