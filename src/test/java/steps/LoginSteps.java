package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps{

    @Given("user is on login page")
    public void user_is_on_login_page() {
        System.out.println("hi");
    }
    @When("user enters valid username and password")
    public void user_enters_valid_username_and_password() {
        System.out.println("hi");
    }
    @When("clicks on login button")
    public void clicks_on_login_button() {
        System.out.println("hi");
    }
    @Then("user is navigated to the home page")
    public void user_is_navigated_to_the_home_page() {
        System.out.println("hi");
    }


}

