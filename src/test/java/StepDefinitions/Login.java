package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
    @Given("I pretend to do something")
    public void i_pretend_to_do_something() {
        System.out.println("given");
    }
    @When("I pretend")
    public void i_pretend() {
        System.out.println("when");
    }
    @Then("Nothing happens")
    public void nothing_happens() {
        System.out.println("then");
    }

}
