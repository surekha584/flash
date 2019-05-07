package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition2 {
	@Given("^Open the Firefox and launch the application$")
	public void open_the_Firefox_and_launch_the_application() {
		System.out.println("This Step open the Firefox and launch the application.");
	}

	@When("^Enter the Username and Password$")
	public void enter_the_Username_and_Password() {
		System.out.println("This step enter the Username and Password on the login page.");
	}

	@Then("^Reset the credential$")
	public void Reset_the_credential()

	{
		System.out.println("This step click on the Reset button.");
	}

}
