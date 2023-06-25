package starter.stepdefinitions;

import io.appium.java_client.android.nativekey.AndroidKey;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.screens.EditProfileScreen;
import test.automation.driver.AndroidDriverPool;


public class EditProfileStep {

    @Steps
    EditProfileScreen editProfileScreen;
    private AndroidDriverPool driver;
    @Given("user on welcome screen page to try edit profile")
    public void userOnLoginScreenPage() {
        editProfileScreen.validateWelcomeScreen();
    }
    @When("user skip Welcome Screen and go to login page to try edit profile")
    public void userSkipWelcomeScreenPage() {
        editProfileScreen.skipWelcomeScreen();
    }
    @And("user input valid email to try edit profile")
    public void userInputEmail() {
        editProfileScreen.clickEmailField();
        editProfileScreen.inputEmail("newuser4@gmail.com");

    }

    @And("user input valid password to try edit profile")
    public void userInputPassword() {
        editProfileScreen.clickPasswordField();
        editProfileScreen.inputPassword("newuser4");
        AndroidDriverPool.pressBack();

    }
    @And("user click masuk button to try edit profile")
    public void userClickMasukBT() {
        editProfileScreen.clickMasukBT();
    }
    @Then("user can login and direct home page to try edit profile")
    public void validateUserGoToHomePage() {
        editProfileScreen.validateHomePage();
    }
    @And("user click profil to try edit profile")
    public void userClickProfilBT() {
        editProfileScreen.clickProfilBT();
        editProfileScreen.validateProfilePage();
    }
    @And("user click edit profile to try edit profile")
    public void userClickEditProfilBT() {
        editProfileScreen.clickEditProfilBT();
        editProfileScreen.validateOnEditProfilePage();
    }
    @And("user input new username to try edit profile")
    public void userClickNamaLengkapField() {
        editProfileScreen.clickNamaLengkapField();
        editProfileScreen.inputNamaLengkap("x1");
        AndroidDriverPool.pressBack();
    }
    @Then("user click save edit profile and get alert \"Tanggal Lahir tidak boleh kosong\" to fill the birthdate")
    public void userClickSimpanEditProfileBT() {
        editProfileScreen.clickSimpanEditProfileBT();
        editProfileScreen.validateEmaillFilled();
    }

    //////////////////////////////////////////////////////==FITUR 2==//////////////////////////////////////
    @Given("user on welcome screen page to try edit profile2")
    public void userOnLoginScreenPageEP2() {
        editProfileScreen.validateWelcomeScreen();
    }
    @When("user skip Welcome Screen and go to login page to try edit profile2")
    public void userSkipWelcomeScreenPageEP2() {
        editProfileScreen.skipWelcomeScreen();
    }
    @And("user input valid email to try edit profile2")
    public void userInputEmailEP2() {
        editProfileScreen.clickEmailField();
        editProfileScreen.inputEmail("newuser3@gmail.com");

    }

    @And("user input valid password to try edit profile2")
    public void userInputPasswordEP2() {
        editProfileScreen.clickPasswordField();
        editProfileScreen.inputPassword("newuser3");
        AndroidDriverPool.pressBack();

    }
    @And("user click masuk button to try edit profile2")
    public void userClickMasukBTEP2() {
        editProfileScreen.clickMasukBT();
    }
    @Then("user can login and direct home page to try edit profile2")
    public void validateUserGoToHomePageEP2() {
        editProfileScreen.validateHomePage();
    }
    @And("user click profil to try edit profile2")
    public void userClickProfilBTEP2() {
        editProfileScreen.clickProfilBT();
        editProfileScreen.validateProfilePage();
    }
    @And("user click edit profile to try edit profile2")
    public void userClickEditProfilBTEP2() {
        editProfileScreen.clickEditProfilBT();
        editProfileScreen.validateOnEditProfilePage();
    }
    @And("user input new username to try edit profile2")
    public void userClickNamaLengkapFieldEP2() {
        editProfileScreen.clickNamaLengkapField();
        editProfileScreen.inputNamaLengkap("x2");
        AndroidDriverPool.pressBack();
    }
    @And("user input new birthdate to try edit profile2")
    public void userClickBirthdateFieldEP2() {
        editProfileScreen.clickTanggalLahirField(); // masih belum fix!
        editProfileScreen.clickTanggalLahir1Field();
        editProfileScreen.clickOKTanggalLahirField();
    }
    @Then("user click save edit profile and back to profile screen to try edit profile2")
    public void userClickSimpanEditProfileBTEp2() {
        editProfileScreen.clickSimpanEditProfileBT();
        editProfileScreen.validateHomePage();
    }
//////////////////////////////////////////////////////==FITUR 3==//////////////////////////////////////
@Given("user on welcome screen page to try edit profile3")
public void userOnLoginScreenPageEP3() {
    editProfileScreen.validateWelcomeScreen();
}
    @When("user skip Welcome Screen and go to login page to try edit profile3")
    public void userSkipWelcomeScreenPageEP3() {
        editProfileScreen.skipWelcomeScreen();
    }
    @And("user input valid email to try edit profile3")
    public void userInputEmailEP3() {
        editProfileScreen.clickEmailField();
        editProfileScreen.inputEmail("newuser3@gmail.com");

    }

    @And("user input valid password to try edit profile3")
    public void userInputPasswordEP3() {
        editProfileScreen.clickPasswordField();
        editProfileScreen.inputPassword("newuser3");
        AndroidDriverPool.pressBack();


    }
    @And("user click masuk button to try edit profile3")

    public void userClickMasukBTEP3() {
        editProfileScreen.clickMasukBT();
    }
    @Then("user can login and direct home page to try edit profile3")
    public void validateUserGoToHomePageEP3() {
        editProfileScreen.validateHomePage();
    }
    @And("user click profil to try edit profile3")
    public void userClickProfilBTEP3() {
        editProfileScreen.clickProfilBT();
        editProfileScreen.validateProfilePage();
    }
    @And("user click edit profile to try edit profile3")
    public void userClickEditProfilBTEP3() {
        editProfileScreen.clickEditProfilBT();
        editProfileScreen.validateOnEditProfilePage();
    }
    @And("user input new birthdate is later than today to try edit profile3")
    public void userClickBirthdateFieldEP3() {
        editProfileScreen.clickTanggalLahirField(); // masih belum fix!
        editProfileScreen.clickTanggalLahir30Field();
        editProfileScreen.clickOKTanggalLahirField();
    }
    @Then("user cant click save edit profile and get alert to check the birthdate to try edit profile3")
    public void userCantClickSimpanEditProfileBTEp3() {
        editProfileScreen.validateBirthday30();
    }

//////////////////////////////////////////////////////==FITUR 4==//////////////////////////////////////

    //////////////////////////////////////////////////////==FITUR 5==//////////////////////////////////////


}