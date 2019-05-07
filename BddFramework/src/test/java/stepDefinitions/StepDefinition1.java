package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition1 {
	WebDriver driver;

	@Given("^user is Login facebook Home Page$")
	public void user_is_login_facebook_home_page() {
		System.setProperty("webdriver.chrome.driver", "D:\\surekha\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
	}

	@When("^user enters username and password$")
	public void user_enters_username_and_password() {
		driver.findElement(By.id("email")).sendKeys("surekha.syamala@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("surekhaditya");
	}

	@Then("^user clickes on login button$")
	public void user_clickes_on_login_button() {
		driver.findElement(By.id("u_0_2")).click();

	}

}
