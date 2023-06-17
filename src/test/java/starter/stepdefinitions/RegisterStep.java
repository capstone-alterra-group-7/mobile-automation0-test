package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.screen.RegisterScreen;
import test.automation.driver.AndroidDriverPool;


public class RegisterStep {

    @Steps
    RegisterScreen registerScreen;
    private AndroidDriverPool driver;

    @Given("user on welcome screen page to register")
    public void userOnLoginScreenPage() {
        registerScreen.validateWelcomeScreen();
    }

    @When("user skip Welcome Screen and direct login page to register")
    public void userSkipWelcomeScreenPage() {
        registerScreen.skipWelcomeScreen();
    }
    @And("user click register button")
    public void userClickRegisterButton() {
        registerScreen.clickRegisterBT();
    }
    @And("user on register screen page")
    public void userOnRegisterScreen() {
        registerScreen.validateRegisterScreen();
    }
    @And("user input username to register")
    public void userInputNamaLengkapRegister() {
        registerScreen.clickNamaLengkapField();
        registerScreen.inputNamaLengkapRegister();
    }
    @And("user input email to register")
    public void userInputEmailRegister() {
        registerScreen.clickEmailRegisterField();
        registerScreen.inputEmailRegister();
    }
    @And("user input notelp to register")
    public void userInputNomorTeleponRegister() {
        registerScreen.clickNomorTeleponField();
        registerScreen.inputNomorTeleponRegister();
        AndroidDriverPool.pressBack();
    }
    @And("user input password to register")
    public void userInputPasswordRegister() {
        registerScreen.clickPasswordRegisterField();
        registerScreen.inputPasswordRegister();
        AndroidDriverPool.pressBack();
    }
    @And("user input confirm password to register")
    public void userInputConfirmPasswordRegister() {
        registerScreen.clickConfirmPasswordRegister();
        registerScreen.inputConfirmPasswordRegister();
        AndroidDriverPool.pressBack();
    }
    @And("user click daftar button to register")
    public void userClickDaftarBT() {
        registerScreen.clickDaftarBT();
    }
    @And("user has succesfully registered and go back to login screen")
    public void userSuccesfullyRegister() {
        registerScreen.validateSuccesRegister();
        registerScreen.validateLoginScreen();
    }
    ///////////////////////////////////////////////////////=================FITUR 2===================//////////////////
    @Given("user on welcome screen page to register2")
    public void userOnLoginScreenPage2() {
        registerScreen.validateWelcomeScreen();
    }

    @When("user skip Welcome Screen and direct login page to register2")
    public void userSkipWelcomeScreenPage2() {
        registerScreen.skipWelcomeScreen();
    }
    @And("user click register button2")
    public void userClickRegisterButton2() {
        registerScreen.clickRegisterBT();
    }
    @And("user on register screen page2")
    public void userOnRegisterScreen2() {
        registerScreen.validateRegisterScreen();
    }
    @And("user input blank username to register2")
    public void userInputBlankNamaLengkapRegister2() {
        registerScreen.clickNamaLengkapField();
        registerScreen.inputBlankNamaLengkapRegister();
    }
    @And("user input email to register2")
    public void userInputEmailRegister2() {
        registerScreen.clickEmailRegisterField();
        registerScreen.inputEmailRegister();
    }
    @And("user input notelp to register2")
    public void userInputNomorTeleponRegister2() {
        registerScreen.clickNomorTeleponField();
        registerScreen.inputNomorTeleponRegister();
        AndroidDriverPool.pressBack();
    }
    @And("user input password to register2")
    public void userInputPasswordRegister2() {
        registerScreen.clickPasswordRegisterField();
        registerScreen.inputPasswordRegister();
        AndroidDriverPool.pressBack();
    }
    @And("user input confirm password to register2")
    public void userInputConfirmPasswordRegister2() {
        registerScreen.clickConfirmPasswordRegister();
        registerScreen.inputConfirmPasswordRegister();
        AndroidDriverPool.pressBack();
    }
    @And("user click daftar button to register2")
    public void userClickDaftarBT2() {
        registerScreen.clickDaftarBT();
    }
    @And("user has not succesfully registered and go back to register screen2")
    public void userCantSuccesfullyRegister2() {
        registerScreen.validateUsernameBlank();
        registerScreen.validateRegisterScreen();
    }
    ///////////////////////////////////////////////////////=================FITUR 3===================//////////////////
    @Given("user on welcome screen page to register3")
    public void userOnLoginScreenPage3() {
        registerScreen.validateWelcomeScreen();
    }

    @When("user skip Welcome Screen and direct login page to register3")
    public void userSkipWelcomeScreenPage3() {
        registerScreen.skipWelcomeScreen();
    }
    @And("user click register button3")
    public void userClickRegisterButton3() {
        registerScreen.clickRegisterBT();
    }
    @And("user on register screen page3")
    public void userOnRegisterScreen3() {
        registerScreen.validateRegisterScreen();
    }
    @And("user input username to register3")
    public void userInputNamaLengkapRegister3() {
        registerScreen.clickNamaLengkapField();
        registerScreen.inputNamaLengkapRegister();
    }
    @And("user input blank email to register3")
    public void userInputBlankEmailRegister3() {
        registerScreen.clickEmailRegisterField();
        registerScreen.inputBlankEmailRegister();
    }
    @And("user input notelp to register3")
    public void userInputNomorTeleponRegister3() {
        registerScreen.clickNomorTeleponField();
        registerScreen.inputNomorTeleponRegister();
        AndroidDriverPool.pressBack();
    }
    @And("user input password to register3")
    public void userInputPasswordRegister3() {
        registerScreen.clickPasswordRegisterField();
        registerScreen.inputPasswordRegister();
        AndroidDriverPool.pressBack();
    }
    @And("user input confirm password to register3")
    public void userInputConfirmPasswordRegister3() {
        registerScreen.clickConfirmPasswordRegister();
        registerScreen.inputConfirmPasswordRegister();
        AndroidDriverPool.pressBack();
    }
    @And("user click daftar button to register3")
    public void userClickDaftarBT3() {
        registerScreen.clickDaftarBT();
    }
    @And("user has not succesfully registered and go back to register screen3")
    public void userCantSuccesfullyRegister3() {
        registerScreen.validateEmailBlank();
        registerScreen.validateRegisterScreen();
    }
    ///////////////////////////////////////////////////////=================FITUR 4===================//////////////////
    @Given("user on welcome screen page to register4")
    public void userOnLoginScreenPage4() {
        registerScreen.validateWelcomeScreen();
    }

    @When("user skip Welcome Screen and direct login page to register4")
    public void userSkipWelcomeScreenPage4() {
        registerScreen.skipWelcomeScreen();
    }
    @And("user click register button4")
    public void userClickRegisterButton4() {
        registerScreen.clickRegisterBT();
    }
    @And("user on register screen page4")
    public void userOnRegisterScreen4() {
        registerScreen.validateRegisterScreen();
    }
    @And("user input username to register4")
    public void userInputNamaLengkapRegister4() {
        registerScreen.clickNamaLengkapField();
        registerScreen.inputNamaLengkapRegister();
    }
    @And("user input email to register4")
    public void userInputEmailRegister4() {
        registerScreen.clickEmailRegisterField();
        registerScreen.inputEmailRegister();
    }
    @And("user input blank notelp to register4")
    public void userInputBlankNomorTeleponRegister4() {
        registerScreen.clickNomorTeleponField();
        registerScreen.inputBlankNomorTeleponRegister();
        AndroidDriverPool.pressBack();
    }
    @And("user input password to register4")
    public void userInputPasswordRegister4() {
        registerScreen.clickPasswordRegisterField();
        registerScreen.inputPasswordRegister();
        AndroidDriverPool.pressBack();
    }
    @And("user input confirm password to register4")
    public void userInputConfirmPasswordRegister4() {
        registerScreen.clickConfirmPasswordRegister();
        registerScreen.inputConfirmPasswordRegister();
        AndroidDriverPool.pressBack();
    }
    @And("user click daftar button to register4")
    public void userClickDaftarBT4() {
        registerScreen.clickDaftarBT();
    }
    @And("user has not succesfully registered and go back to register screen4")
    public void userCantSuccesfullyRegister4() {
        registerScreen.validateNotelpBlank();
        registerScreen.validateRegisterScreen();
    }
    ///////////////////////////////////////////////////////=================FITUR 5===================//////////////////
    @Given("user on welcome screen page to register5")
    public void userOnLoginScreenPage5() {
        registerScreen.validateWelcomeScreen();
    }

    @When("user skip Welcome Screen and direct login page to register5")
    public void userSkipWelcomeScreenPage5() {
        registerScreen.skipWelcomeScreen();
    }
    @And("user click register button5")
    public void userClickRegisterButton5() {
        registerScreen.clickRegisterBT();
    }
    @And("user on register screen page5")
    public void userOnRegisterScreen5() {
        registerScreen.validateRegisterScreen();
    }
    @And("user input username to register5")
    public void userInputNamaLengkapRegister5() {
        registerScreen.clickNamaLengkapField();
        registerScreen.inputNamaLengkapRegister();
    }
    @And("user input email to register5")
    public void userInputEmailRegister5() {
        registerScreen.clickEmailRegisterField();
        registerScreen.inputEmailRegister();
    }
    @And("user input notelp to register5")
    public void userInputNomorTeleponRegister5() {
        registerScreen.clickNomorTeleponField();
        registerScreen.inputNomorTeleponRegister();
        AndroidDriverPool.pressBack();
    }
    @And("user input blank password to register5")
    public void userInputBlankPasswordRegister5() {
        registerScreen.clickPasswordRegisterField();
        registerScreen.inputBlankPasswordRegister();
        AndroidDriverPool.pressBack();
    }
    @And("user input confirm password to register5")
    public void userInputConfirmPasswordRegister5() {
        registerScreen.clickConfirmPasswordRegister();
        registerScreen.inputConfirmPasswordRegister();
        AndroidDriverPool.pressBack();
    }
    @And("user click daftar button to register5")
    public void userClickDaftarBT5() {
        registerScreen.clickDaftarBT();
    }
    @And("user has not succesfully registered and go back to register screen5")
    public void userCantSuccesfullyRegister5() {
        registerScreen.validatePasswordBlank();
        registerScreen.validateTidakSamaConfirmPasswordBlank();
        registerScreen.validateRegisterScreen();
    }
    ///////////////////////////////////////////////////////=================FITUR 5===================//////////////////
    @Given("user on welcome screen page to register6")
    public void userOnLoginScreenPage6() {
        registerScreen.validateWelcomeScreen();
    }

    @When("user skip Welcome Screen and direct login page to register6")
    public void userSkipWelcomeScreenPage6() {
        registerScreen.skipWelcomeScreen();
    }
    @And("user click register button6")
    public void userClickRegisterButton6() {
        registerScreen.clickRegisterBT();
    }
    @And("user on register screen page6")
    public void userOnRegisterScreen6() {
        registerScreen.validateRegisterScreen();
    }
    @And("user input username to register6")
    public void userInputNamaLengkapRegister6() {
        registerScreen.clickNamaLengkapField();
        registerScreen.inputNamaLengkapRegister();
    }
    @And("user input email to register6")
    public void userInputEmailRegister6() {
        registerScreen.clickEmailRegisterField();
        registerScreen.inputEmailRegister();
    }
    @And("user input notelp to register6")
    public void userInputNomorTeleponRegister6() {
        registerScreen.clickNomorTeleponField();
        registerScreen.inputNomorTeleponRegister();
        AndroidDriverPool.pressBack();
    }
    @And("user input password to register6")
    public void userInputPasswordRegister6() {
        registerScreen.clickPasswordRegisterField();
        registerScreen.inputPasswordRegister();
        AndroidDriverPool.pressBack();
    }
    @And("user input blank confirm password to register6")
    public void userInputBlankConfirmPasswordRegister6() {
        registerScreen.clickConfirmPasswordRegister();
        registerScreen.inputBlankConfirmPasswordRegister();
        AndroidDriverPool.pressBack();
    }
    @And("user click daftar button to register6")
    public void userClickDaftarBT6() {
        registerScreen.clickDaftarBT();
    }
    @And("user has not succesfully registered and go back to register screen6")
    public void userCantSuccesfullyRegister6() {
        registerScreen.validateConfirmPasswordBlank();
        registerScreen.validateRegisterScreen();
    }
}
