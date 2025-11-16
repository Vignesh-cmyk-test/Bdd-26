package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class Logindemoqa {
	
	static WebDriver driver;
	
	@Given("Launch the browser")
	public void launch_the_browser() {
	   driver = new ChromeDriver();
	   driver.get("https://demoqa.com/login");
	   driver.manage().window().maximize();
	}

	@When("Enter the username and password")
	public void enter_the_username_and_password() {
		
		WebElement logbutton = driver.findElement(By.xpath("//button[@type='button']"));
		 
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView(true)", logbutton);
		
	//Username
	  driver.findElement(By.xpath("//input[@placeholder='UserName']")).sendKeys("Vignesh");
	//Password
	  driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Vignesh");
	}

	@When("click the submit button")
	public void click_the_submit_button() {
	    WebElement logbutton = driver.findElement(By.xpath("//button[@type='button']"));
	    logbutton.click();
	}

	@Then("Verify the dashboard page")
	public void verify_the_dashboard_page() {
	   boolean currenturl = driver.getCurrentUrl().contains("register");
	   
	  if(currenturl) {
		  System.out.println("Login failed");
	  }else {
		  System.out.println("Login Passed");
	  }
	}

}
