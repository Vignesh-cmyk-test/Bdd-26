package stepdefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Datatable {
	
	static WebDriver driver;

	@Given("Datatable is open the browser")
	public void datatable_is_open_the_browser() {
		
		   driver = new ChromeDriver();
		   driver.get("https://demoqa.com/login");
		   driver.manage().window().maximize();
		   
		   WebElement logbutton = driver.findElement(By.xpath("//button[@type='button']"));
			 
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("arguments[0].scrollIntoView(true)", logbutton);
	}

	@When("Datatable is Enter the user credentials")
	public void datatable_is_enter_the_user_credentials(DataTable dataTable) {
		
		List<String> credent = dataTable.asList(String.class);
		
		String username = credent.get(0);
		String password = credent.get(1);
		
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);

	}

	@And("Datatable is verify into the browser launched")
	public void datatable_is_verify_into_the_browser_launched() {
		
		 WebElement logbutton = driver.findElement(By.xpath("//button[@type='button']"));
		    logbutton.click();
	}

	@Then("Datatable is Verify the loginpage.")
	public void datatable_is_verify_the_loginpage() {
		
		boolean currenturl = driver.getCurrentUrl().contains("register");
		   
		  if(currenturl) {
			  System.out.println("Login failed");
		  }else {
			  System.out.println("Login Passed");
		  }
		}
	}
	
	

