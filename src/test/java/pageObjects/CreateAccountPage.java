package pageObjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

/**
 * Created by Siva on 1/15/2019.
 */
public class CreateAccountPage  extends PageObject {

    @FindBy(id="els-addDetails")
    WebElementFacade createPageLayout;

    @FindBy(id="email")
    WebElementFacade emailTextBox;

    @FindBy(id="els-continue")
    WebElementFacade contiunueButton;

    @FindBy(id="givenName")
    WebElementFacade givenTextBox;

    @FindBy(id="familyName")
    WebElementFacade lastNameTextBox;

    @FindBy(id="password")
    WebElementFacade passwordTextBox;

    @FindBy(css=".els-primaryBtn")
    WebElementFacade registerButton;

    @FindBy(id="register_continue")
    WebElementFacade registerSuccessfulForm;

    /**
     * This method is to check the status of page loading
     * @return
     */
    public boolean verifyCreateAccountPageIsLoaded(){
        return createPageLayout.waitUntilVisible().then().isEnabled();
    }

    /**
     * This method is to check the status of Form loading
     * @return
     */
    public boolean verifyRegistrationFromIsDisplayed(){
        return givenTextBox.waitUntilVisible().then().isDisplayed();
    }

    /**
     * This method is to check the status of Form loading
     * @return
     */
    public boolean verifyRegistrationSuccessfulFormIsDisplayed(){
        return registerSuccessfulForm.waitUntilVisible().then().isEnabled();
    }

    /**
     * This method enters text into email text field
     * @param emailAddress
     */
    public void enterEmailAddress(String emailAddress){
        emailTextBox.waitUntilVisible().then().sendKeys(emailAddress);
    }

    /**
     * This method enters text into first name field
     * @param firstName
     */
    public void enterFirstName(String firstName){
        givenTextBox.waitUntilVisible().then().sendKeys(firstName);
    }

    /**
     * This method is to enter text into last Name field
     * @param lastName
     */
    public void enterLastName(String lastName){
        lastNameTextBox.waitUntilVisible().then().sendKeys(lastName);
    }

    /**
     * This method enters text into password field
     * @param password
     */
    public void enterPassword(String password){
        passwordTextBox.waitUntilVisible().then().sendKeys(password);
    }

    /**
     * This method is to click on continue button
     */
    public void clickContinueButton(){
        contiunueButton.click();
    }

    /**
     * This method is to click on register button
     */
    public void clickRegisterButton(){
        registerButton.click();
    }

}
