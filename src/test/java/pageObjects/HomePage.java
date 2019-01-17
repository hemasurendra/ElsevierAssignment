package pageObjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

/**
 * Created by Siva on 1/15/2019.
 */
public class HomePage extends PageObject {

    @FindBy(css=".layout-container.page-homepage")
    WebElementFacade homePageLayout;

    @FindBy(css=".cta_first")
    WebElementFacade createAccountLink;

    /**
     * This method is to verify if Home Page is Loaded
     * @return
     */
    public boolean verifyHomePageIsLoaded(){
        return homePageLayout.waitUntilVisible().then().isEnabled();
    }

    /**
     * This method is to click on Create account button on Home page
     */
    public void clickCreateAccountLink(){
        createAccountLink.waitUntilVisible().then().click();
    }
}
