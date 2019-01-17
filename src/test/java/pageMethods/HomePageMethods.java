package pageMethods;

import net.thucydides.core.annotations.Step;
import pageObjects.HomePage;

/**
 * Created by Siva on 1/15/2019.
 */
public class HomePageMethods {

    private HomePage homePage;

    @Step
    public void launch(){
        homePage.open();
    }

    @Step
    public boolean isHomePageDisplayed(){
        return homePage.verifyHomePageIsLoaded();
    }

    @Step
    public void navigateToCreateAccountForm(){
        homePage.clickCreateAccountLink();
    }
}
