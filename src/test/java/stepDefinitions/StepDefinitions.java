package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import pageMethods.CreateAccountPageMethods;
import pageMethods.HomePageMethods;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by Siva on 1/15/2019.
 */
public class StepDefinitions {

    @Steps
    HomePageMethods homePageMethod;

    @Steps
    CreateAccountPageMethods createAccountPage;

    @Given("^I navigate to the initial state of application$")
    public void launchHomePage() {
      homePageMethod.launch();
      assertThat(homePageMethod.isHomePageDisplayed()).isTrue();
    }


    @When("^I attempt to (.*) using (.*) email$")
    public void verifyEmail(String functionalFlow, String emailType) {
        homePageMethod.navigateToCreateAccountForm();
        assertThat(createAccountPage.isCreateAccountPageDisplayed()).isTrue();
        createAccountPage.navigateToRegistrationForm();
        assertThat(createAccountPage.isRegistrationFormIsDisplayed()).isTrue();
    }

    @When("^Using my (.*) and (.*)$")
    public void createAccount(String givenName,String lastName) {
        createAccountPage.createAccount(givenName,lastName);
    }

    @Then("^My account (.*) created successfully$")
    public void verifyAccountCreation(String status) {
        if("is".equalsIgnoreCase(status)){
            assertThat(createAccountPage.isRegistrationSuccessfulFormDisplayed()).isTrue();
        }else{
            assertThat(createAccountPage.isRegistrationFormIsDisplayed()).isTrue();
        }
    }

}
