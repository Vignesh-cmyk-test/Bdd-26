package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Parameterizelogin {
	
	static WebDriver driver;
	
	@Given("Open the browser")
	public void open_the_browser() {
	    // Write code here that turns the phrase above into concrete actions
		driver = new ChromeDriver();
		   driver.get("https://demoqa.com/login");
		   driver.manage().window().maximize();
	}

	@When("Enter the credentials {string} {string}")
	public void enter_the_credentials(String Uname, String password) {
	    // Write code here that turns the phrase above into concrete actions
		WebElement logbutton = driver.findElement(By.xpath("//button[text()='Login']"));
		 
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView(true)", logbutton);
		
	//Username
	  driver.findElement(By.xpath("//input[@placeholder='UserName']")).sendKeys(Uname);
	//Password
	  driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(password);
	}

	@When("click the login button")
	public void click_the_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		WebElement logbutton = driver.findElement(By.xpath("//button[text()='Login']"));
	    logbutton.click();
	}

	@Then("check the dashboard page")
	public void check_the_dashboard_page() {
	    // Write code here that turns the phrase above into concrete actions
		 boolean currenturl = driver.getCurrentUrl().contains("login");
		   
		  if(currenturl) {
			  System.out.println("Login failed");
		  }else {
			  System.out.println("Login Passed");
		  }
		}
	}


