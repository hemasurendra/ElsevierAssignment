package pageMethods;


import Utils.GetTestProperties;
import helper.EmailHelper;
import net.thucydides.core.annotations.Step;
import pageObjects.CreateAccountPage;

/**
 * Created by Siva on 1/15/2019.
 */
public class CreateAccountPageMethods {

    private CreateAccountPage createAccountPage;

    private GetTestProperties getTestProperties = new GetTestProperties();

    @Step
    public boolean isCreateAccountPageDisplayed(){
        return createAccountPage.verifyCreateAccountPageIsLoaded();
    }

    @Step
    public void navigateToRegistrationForm(){
        EmailHelper emailHelper = new EmailHelper();
        String emailAddress = emailHelper.generateRandomEmail();
        createAccountPage.enterEmailAddress(emailAddress);
        createAccountPage.clickContinueButton();
    }

    @Step
    public boolean isRegistrationFormIsDisplayed(){
        return createAccountPage.verifyRegistrationFromIsDisplayed();
    }

    @Step
    public void createAccount(String givenName,String lastName){
        createAccountPage.enterFirstName(givenName);
        createAccountPage.enterLastName(lastName);
        createAccountPage.enterPassword(getTestProperties.getValue("password"));
        createAccountPage.clickRegisterButton();
    }

    @Step
    public boolean isRegistrationSuccessfulFormDisplayed(){
        return createAccountPage.verifyRegistrationSuccessfulFormIsDisplayed();
    }

}
