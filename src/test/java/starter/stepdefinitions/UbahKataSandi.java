package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import test.automation.driver.AndroidDriverPool;

public class UbahKataSandi {

    @Steps
    starter.screen.UbahKataSandi loginScreen;
    private AndroidDriverPool driver;
    @And("user on the login page")
    public void userOnTheLoginPage() { loginScreen.userOnTheLoginPage();
    }

    @And("user click on email field")
    public void userClickOnEmailField() { loginScreen.userClickOnEmailField();
    }

    @And("user input {string} on email field")
    public void userInputOnEmailField(String email) { loginScreen.userInputOnEmailField(email);
    }

    @And("user click on password field")
    public void userClickOnPasswordField() { loginScreen.userClickOnPasswordField();
        AndroidDriverPool.pressBack();
    }

    @And("user input {string} on password field")
    public void userInputOnPasswordField(String password) { loginScreen.userInputOnPasswordField(password);
    }

    @And("user click login button")
    public void userClickLoginButton() { loginScreen.userClickLoginButton();
    }

    @Then("user see home page")
    public void userSeeHomePage() { loginScreen.userSeeHomePage();
    }

    @Given("user on welcome screen page")
    public void UsserOnWelcomeScreenPage() { loginScreen.welcomeScreenPage();
    }

    @When("user skip Welcome Screen and go to login page")
    public void userSkippWelcomeScreenAndGoToLoginPage() { loginScreen.skipWelcomeScreen();
    }

    @And("user click menu Profile")
    public void userClickMenuProfile() { loginScreen.clickMenuProfile();
    }

    @And("user click menu Ubah Kata Sandi")
    public void userClickMenuUbahKataSandi() { loginScreen.clickUbahKataSandi();
    }

    @And("user input Kata Sandi Lama")
    public void userInputKataSandiLama() { loginScreen.inputKataSandiLama("newuser2");
    }

    @And("user input Kata Sandi Baru")
    public void userInputKataSandiBaru() { loginScreen.inputKataSandiBaru("newuser3");
    }

    @And("user input Konfirmasi Kata Sandi Baru")
    public void userInputKonfirmasiKataSandiBaru() { loginScreen.konfirmasiKataSandiBaru("newuser3");
    }

    @And("click button Selanjutnya")
    public void clickButtonSelanjutnya() { loginScreen.clickButtonSelanjutnya();
    }

    @Then("user berhasil mengubah kata sandi")
    public void userBerhasilMengubahKataSandi() { loginScreen.SuccessChangePassword();
    }
}
