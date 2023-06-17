package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.screen.LogoutScreen;
import test.automation.driver.AndroidDriverPool;


public class LogoutStep {

    @Steps
    LogoutScreen logout;
    private AndroidDriverPool driver;
    @Given("user on welcome screen page to try logout")
    public void userOnLoginScreenPage() {
        logout.validateWelcomeScreen();
    }
    @When("user skip Welcome Screen and go to login page to try logout")
    public void userSkipWelcomeScreenPage() {
        logout.skipWelcomeScreen();
    }
    @And("user input valid email to try logout")
    public void userInputEmail() {
        logout.clickEmailField();
        logout.inputEmail("admin@gmail.com");

    }

    @And("user input valid password to try logout")
    public void userInputPassword() {
        logout.clickPasswordField();
        logout.inputPassword("qweqwe123");
        AndroidDriverPool.pressBack();

    }
    @And("user click masuk button to try logout")
    public void userClickMasukBT() {
        logout.clickMasukBT();
    }
    @Then("user can login and direct home page to try logout")
    public void validateUserGoToHomePage() {
        logout.validateHomePage();
    }
    @And("user click profil to try logout")
    public void userClickProfilBT() {
        logout.clickProfilBT();
    }
    @And("user click keluar to try logout")
    public void userClickKeluarBT() {
        logout.clickLogoutBT();
    }
    @And("user click ya untuk keluar to try logout")
    public void userClickYaLogoutBT() {
        logout.clickYaLogoutBT();
    }
    @Then("user has logout and back to login screen to try logout")
    public void userCanLogoutAndBackToLoginScreen() {
        logout.validateLoginScreen();
    }
/////////////////////////////////////////====FITUR 2====//////////////////////////////////////////////////
@Given("user on welcome screen page to try logout2")
public void userOnLoginScreenPage2() {
    logout.validateWelcomeScreen();
}
    @When("user skip Welcome Screen and go to login page to try logout2")
    public void userSkipWelcomeScreenPage2() {
        logout.skipWelcomeScreen();
    }
    @And("user input valid email to try logout2")
    public void userInputEmail2() {
        logout.clickEmailField();
        logout.inputEmail("admin@gmail.com");

    }

    @And("user input valid password to try logout2")
    public void userInputPassword2() {
        logout.clickPasswordField();
        logout.inputPassword("qweqwe123");
        AndroidDriverPool.pressBack();

    }
    @And("user click masuk button to try logout2")
    public void userClickMasukBT2() {
        logout.clickMasukBT();
    }
    @Then("user can login and direct home page to try logout2")
    public void validateUserGoToHomePage2() {
        logout.validateHomePage();
    }
    @And("user click profil to try logout2")
    public void userClickProfilBT2() {
        logout.clickProfilBT();
    }
    @And("user click keluar to try logout2")
    public void userClickKeluarBT2() {
        logout.clickLogoutBT();
    }
    @And("user click tidak untuk keluar to try logout2")
    public void userClickYaLogoutBT2() {
        logout.clickTidakLogoutBT();
    }
    @Then("user has not logout and back to profil page to try logout2")
    public void userCantLogoutAndBackToProfilPage2() {
        logout.validateProfilePage();
    }
    /////////////////////////////////////////====FITUR 3====//////////////////////////////////////////////////
    @Given("user on welcome screen page to try logout3")
    public void userOnLoginScreenPage3() {
        logout.validateWelcomeScreen();
    }
    @When("user skip Welcome Screen and go to login page to try logout3")
    public void userSkipWelcomeScreenPage3() {
        logout.skipWelcomeScreen();
    }
    @And("user input valid email to try logout3")
    public void userInputEmail3() {
        logout.clickEmailField();
        logout.inputEmail("admin@gmail.com");

    }

    @And("user input valid password to try logout3")
    public void userInputPassword3() {
        logout.clickPasswordField();
        logout.inputPassword("qweqwe123");
        AndroidDriverPool.pressBack();

    }
    @And("user click masuk button to try logout3")
    public void userClickMasukBT3() {
        logout.clickMasukBT();
    }
    @Then("user can login and direct home page to try logout3")
    public void validateUserGoToHomePage3() {
        logout.validateHomePage();
    }
    @And("user click profil to try logout3")
    public void userClickProfilBT3() {
        logout.clickProfilBT();
    }
    @And("user click keluar to try logout3")
    public void userClickKeluarBT3() {
        logout.clickLogoutBT();
    }
    @And("user click back to try logout3")
    public void userClickOutsideYaTidakLogoutBT3() {
        AndroidDriverPool.pressBack();
    }
    @Then("user has not logout and back to profil page to try logout3")
    public void userCantLogoutAndBackToProfilPage3() {
        logout.validateProfilePage();
    }
}