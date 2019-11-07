package stepDefination;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
//import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

//@RunWith(Cucumber.class)
public class stepDefination {

    @Given("^User is on Banking landing page$")
    public void user_is_on_Banking_landing_page() {
        System.out.println("User is on Banking landing page");
    }

    @When("^User Login into application with \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_Login_into_application_with_username_and_password(String arg1, String arg2) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("User Login into application with username: " + arg1 +"and password: " + arg2);
    }

    @Then("Home Page is populated")
    public void home_Page_is_populated() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("\"Home Page is populated\"");
    }

    @Then("Cards are displayed")
    public void cards_are_displayed() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Cards are displayed");
    }

}