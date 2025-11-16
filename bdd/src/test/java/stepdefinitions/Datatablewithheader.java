package stepdefinitions;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Datatablewithheader {
	
	static WebDriver driver;
	
	@Given("Datatable is open the browser Header")
	public void datatable_is_open_the_browser_header() {
		
		   driver = new ChromeDriver();
		   driver.get("https://demoqa.com/login");
		   driver.manage().window().maximize();
		   
		   WebElement logbutton = driver.findElement(By.xpath("//button[@type='button']"));
			 
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("arguments[0].scrollIntoView(true)", logbutton);
	}

	@When("Datatable is Enter the user credentials Header")
	public void datatable_is_enter_the_user_credentials_header(io.cucumber.datatable.DataTable dataTable) {
	   
        List<Map<String, String>> credent = dataTable.asMaps(String.class, String.class);
		
		String username = credent.get(0).get("Username");
		String password = credent.get(0).get("Password");
		
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
	}

	@And("Datatable is verify into the browser launched Header")
	public void datatable_is_verify_into_the_browser_launched_header() {
		
		 WebElement logbutton = driver.findElement(By.xpath("//button[@type='button']"));
		 logbutton.click();
	}

	@Then("Datatable is Verify the loginpage Header.")
	public void datatable_is_verify_the_loginpage_header() {
	   
		boolean currenturl = driver.getCurrentUrl().contains("register");
		   
		  if(currenturl) {
			  System.out.println("Login failed");
		  }else {
			  System.out.println("Login Passed");
		  }
	}

}
