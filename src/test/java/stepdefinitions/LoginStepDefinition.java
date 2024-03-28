package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition {
	
	WebDriver driver;
	
	@Before
	public void open() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	
	@Given("I visit the facebook website as a guest user")
	public void i_visit_the_facebook_website_as_a_guest_user() {
	    driver.get("http://www.facebook.com");
	}

	@When("I enter valid email  and password into the fields")
	public void i_enter_valid_email_and_password_into_the_fields() throws InterruptedException {
	  WebElement email= driver.findElement(By.id("email"));
	  WebElement  password=driver.findElement(By.id("pass"));
	       email.sendKeys("ravikumar.rajanala56@gmail.com");
	       password.sendKeys("chinnaritalli");
	       Thread.sleep(2000);
	}

	@When("click on Login button")
	public void click_on_login_button() {
		driver.findElement(By.name("login")).click();;
	   	}

	@Then("User should able to see the Facebook Homepage")
	public void user_should_able_to_see_the_facebook_homepage() throws InterruptedException {
		System.out.println("welcome to facebook");
	   
	}
	@After
	public void close() {
		//driver.close();
	}




}
