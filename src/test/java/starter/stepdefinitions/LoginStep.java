package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.screens.LoginScreen;
import test.automation.driver.AndroidDriverPool;



public class LoginStep {

    @Steps
    LoginScreen login;
    private AndroidDriverPool driver;
    @Given("user on welcome screen page")
    public void userOnLoginScreenPage() {
        login.validateWelcomeScreen();
    }
    @When("user skip Welcome Screen and go to login page")
    public void userSkipWelcomeScreenPage() {
        login.skipWelcomeScreen();
    }
    @And("user input valid email")
    public void userInputEmail() {
        login.clickEmailField();
        login.inputEmail("newuser2@gmail.com");

    }

    @And("user input valid password")
    public void userInputPassword() {
        login.clickPasswordField();
        login.inputPassword("newuser2");
        AndroidDriverPool.pressBack();

    }
    @And("user click masuk button")
    public void userClickMasukBT() {
        login.clickMasukBT();
    }
    @Then("user can login and go to home page")
    public void validateUserGoToHomePage() {
        login.validateHomePage();
    }


    //////////////////////////////////////////////////////==FITUR 2==//////////////////////////////////////
    @Given("user on welcome screen page2")
    public void userOnLoginScreenPage2() {
        login.validateWelcomeScreen();
    }
    @When("user skip Welcome Screen and go to login page2")
    public void userSkipWelcomeScreenPage2() {
        login.skipWelcomeScreen();
    }
    @And("user input invalid email2")
    public void userInputInvalidEmail2() {
        login.clickEmailField();
        login.inputEmail("adminxx@gmail.com");

    }

    @And("user input valid password2")
    public void userInputPassword2() {
        login.clickPasswordField();
        login.inputPassword("newuser2");
        AndroidDriverPool.pressBack();

    }
    @And("user cant click login, and get warning screen2")
    public void userCantClickMasukAndGetWarningMessage2() {
        login.clickMasukBT();
        login.validateErrorWrongEmailPassword();

    }
    @Then("user stay on login screen2")
    public void validateUserStayOnLoginScreen2() {
        login.validateLoginScreen();
    }
//////////////////////////////////////////////////////==FITUR 3==//////////////////////////////////////
@Given("user on welcome screen page3")
public void userOnLoginScreenPage3() {
    login.validateWelcomeScreen();
}
    @When("user skip Welcome Screen and go to login page3")
    public void userSkipWelcomeScreenPage3() {
        login.skipWelcomeScreen();
    }
    @And("user input valid email3")
    public void userInputEmail3() {
        login.clickEmailField();
        login.inputEmail("newuser2@gmail.com");

    }

    @And("user input invalid password3")
    public void userInputInvalidPassword3() {
        login.clickPasswordField();
        login.inputPassword("newuser2xx");
        AndroidDriverPool.pressBack();

    }
    @And("user cant click login, and get warning screen3")
    public void userCantClickMasukAndGetWarningMessage3() {
        login.clickMasukBT();
        login.validateErrorWrongEmailPassword();
    }
    @Then("user stay on login screen3")
    public void validateUserStayOnLoginScreen3() {
        login.validateLoginScreen();
    }

//////////////////////////////////////////////////////==FITUR 4==//////////////////////////////////////
    @Given("user on welcome screen page4")
    public void userOnLoginScreenPage4() {
    login.validateWelcomeScreen();
}
    @When("user skip Welcome Screen and go to login page4")
    public void userSkipWelcomeScreenPage4() {
        login.skipWelcomeScreen();
    }
    @And("user input blank email4")
    public void userInputBlankEmail4() {
        login.clickEmailField();
        login.inputEmail("");

    }

    @And("user input valid password4")
    public void userInputPassword4() {
        login.clickPasswordField();
        login.inputPassword("newuser2");
        AndroidDriverPool.pressBack();

    }
    @And("user cant click login, and get warning screen \"Email tidak boleh kosong\"")
    public void userCantClickMasukAndGetWarningEmailMessage4() {
        login.clickMasukBT();
        login.validateWarningEmailMessage();

    }
    @Then("user stay on login screen4")
    public void validateUserStayOnLoginScreen4() {
        login.validateLoginScreen();
    }
    //////////////////////////////////////////////////////==FITUR 5==//////////////////////////////////////

    @Given("user on welcome screen page5")
    public void userOnLoginScreenPage5() {
        login.validateWelcomeScreen();
    }
    @When("user skip Welcome Screen and go to login page5")
    public void userSkipWelcomeScreenPage5() {
        login.skipWelcomeScreen();
    }
    @And("user input valid email5")
    public void userInputEmail5() {
        login.clickEmailField();
        login.inputEmail("newuser2@gmail.com");

    }

    @And("user input blank password5")
    public void userInputBlankPassword5() {
        login.clickPasswordField();
        login.inputPassword("");
        AndroidDriverPool.pressBack();

    }
    @And("user cant click login, and get warning screen \"Tolong masukkan kata sandi\"")
    public void userCantClickMasukAndGetWarningPasswordMessage5() {
        login.clickMasukBT();
        login.validateWarningPasswordMessage();
    }
    @Then("user stay on login screen5")
    public void validateUserStayOnLoginScreen5() {
        login.validateLoginScreen();
    }
}