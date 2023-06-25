package starter.screens;

import io.appium.java_client.AppiumBy;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import test.automation.pageobject.BasePageObject;
import com.github.javafaker.Faker;

public class RegisterScreen extends BasePageObject {

    ////////////////////////////////////////======FAKERRRRRRRRRRRRRRRRRRRRRRRR================//////////////////////////
    public String createRandomNumber() {
        Faker faker = new Faker();
        return faker.phoneNumber().cellPhone();
    }

    public String createRandomName() {
        Faker faker = new Faker();
        return faker.name().firstName();
    }

    public String createRandomPassword() {
        Faker faker = new Faker();
        return faker.internet().password();
    }

    public String password = "newuser2";
    public String usernameblank = "";
    public String emailblank = "";
    public String passwordblank = "";
    public String notelpblank = "";
    public String name = createRandomName();
    public String phoneNumber = createRandomNumber();


    ////////////////////////////////////////======FAKERRRRRRRRRRRRRRRRRRRRRRRR================//////////////////////////
    private By WelcomeScreenDashboard() {
        return AppiumBy.xpath("//android.widget.ImageView[@content-desc=\"Temukan Destinasi Anda\n" +
                "Selamat datang! Temukan destinasi impian Anda.Jelajahi dan temukan pengalamanperjalanan yang luar biasa\"]");
    }

    private By lewatiWelcomeScreenBT() {
        return AppiumBy.xpath("//android.widget.Button[@content-desc=\"Lewati\"]");
    }

    private By LoginScreen() {
        return AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView");
    }

    private By EmailField() {
        return AppiumBy.xpath("(//android.view.View[@content-desc=\"Email\"]/following-sibling::android.widget.EditText)[1]");
    }

    private By RegisterBT() {
        return AppiumBy.xpath("//android.widget.Button[@content-desc=\"Daftar sekarang\"]");
    }

    private By RegisterScreen() {
        return AppiumBy.xpath("//android.widget.ImageView[@content-desc=\"Daftar\n" +
                "Nama Lengkap\n" +
                "Email\n" +
                "Nomor Telepon\n" +
                "Kata Sandi\n" +
                "Konfirmasi Kata Sandi\n" +
                "Kami akan melindungi data anda.\n" +
                "Sudah memiliki Akun?\"]/android.widget.EditText[1]");
    }

    private By NamaLengkapField() {
        return AppiumBy.xpath("//android.widget.ImageView[@content-desc=\"Daftar\n" +
                "Nama Lengkap\n" +
                "Email\n" +
                "Nomor Telepon\n" +
                "Kata Sandi\n" +
                "Konfirmasi Kata Sandi\n" +
                "Kami akan melindungi data anda.\n" +
                "Sudah memiliki Akun?\"]/android.widget.EditText[1]");
    }

    private By EmailRegisterField() {
        return AppiumBy.xpath("//android.widget.ImageView[@content-desc=\"Daftar\n" +
                "Nama Lengkap\n" +
                "Email\n" +
                "Nomor Telepon\n" +
                "Kata Sandi\n" +
                "Konfirmasi Kata Sandi\n" +
                "Kami akan melindungi data anda.\n" +
                "Sudah memiliki Akun?\"]/android.widget.EditText[2]");
    }

    private By NomorTeleponField() {
        return AppiumBy.xpath("//android.widget.ImageView[@content-desc=\"Daftar\n" +
                "Nama Lengkap\n" +
                "Email\n" +
                "Nomor Telepon\n" +
                "Kata Sandi\n" +
                "Konfirmasi Kata Sandi\n" +
                "Kami akan melindungi data anda.\n" +
                "Sudah memiliki Akun?\"]/android.widget.EditText[3]");
    }

    private By PasswordRegisterField() {
        return AppiumBy.xpath("//android.widget.ImageView[@content-desc=\"Daftar\n" +
                "Nama Lengkap\n" +
                "Email\n" +
                "Nomor Telepon\n" +
                "Kata Sandi\n" +
                "Konfirmasi Kata Sandi\n" +
                "Kami akan melindungi data anda.\n" +
                "Sudah memiliki Akun?\"]/android.widget.EditText[4]");
    }

    private By ConfirmPasswordRegisterField() {
        return AppiumBy.xpath("//android.widget.ImageView[@content-desc=\"Daftar\n" +
                "Nama Lengkap\n" +
                "Email\n" +
                "Nomor Telepon\n" +
                "Kata Sandi\n" +
                "Konfirmasi Kata Sandi\n" +
                "Kami akan melindungi data anda.\n" +
                "Sudah memiliki Akun?\"]/android.widget.EditText[5]");
    }

    private By PasswordField() {
        return AppiumBy.xpath("(//android.view.View[@content-desc=\"Kata Sandi\"]/following-sibling::android.widget.EditText)[1]");
    }

    private By MasukBT() {
        return AppiumBy.xpath(
                "(//android.view.View[@content-desc=\"Masuk\"])[2]");
    }

    private By HomePage() {
        return AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]");
    }

    private By WarningEmailBlankMessageLogin() {
        return AppiumBy.xpath("//android.view.View[@content-desc=\"Email tidak boleh kosong\"]");
    }

    private By WarningEmailInvalidFormatMessageLogin() {
        return AppiumBy.xpath("//android.view.View[@content-desc=\"Format Email tidak valid\"]");
    }

    private By WarningWrongEmailPasswordLogin() {
        return AppiumBy.xpath("//android.view.View[@content-desc=\"Email or password is wrong\"]");
    }

    private By WarningPasswordMessageLogin() {
        return AppiumBy.xpath("//android.view.View[@content-desc=\"Tolong masukkan kata sandi\"]");
    }

    private By ValidateSuccesRegister() {
        return AppiumBy.xpath("//android.view.View[@content-desc=\"Berhasil disimpan\"]");
    }

    private By DaftarBT() {
        return AppiumBy.xpath("//android.view.View[@content-desc=\"Daftar\"]");
    }

    private By ValidateUsernameBlank() {
        return AppiumBy.xpath("//android.view.View[@content-desc=\"Nama tidak boleh kosong\"]");
    }

    private By ValidateEmailBlank() {
        return AppiumBy.xpath("//android.view.View[@content-desc=\"Email tidak boleh kosong\"]");
    }

    private By ValidateNotelpBlank() {
        return AppiumBy.xpath("//android.view.View[@content-desc=\"Nomor Telepon tidak boleh kosong\"]");
    }

    private By ValidatePasswordBlank() {
        return AppiumBy.xpath("(//android.view.View[@content-desc=\"Kata Sandi tidak boleh kosong\"])[1]");
    }

    private By ValidateConfirmPasswordBlank() {
        return AppiumBy.xpath("(//android.view.View[@content-desc=\"Kata Sandi tidak boleh kosong\"])[2]");
    }
    private By ValidateTidakSamaConfirmPasswordBlank() {
        return AppiumBy.xpath("//android.view.View[@content-desc=\"Kata Sandi tidak sama\"]");
    }

    //////////////////////////////////////////=============Function======================//////////////////////////////
    @Step
    public void validateWelcomeScreen() {
        waitUntilVisible(WelcomeScreenDashboard());
    }

    @Step
    public void skipWelcomeScreen() {
        onClick(lewatiWelcomeScreenBT());
    }

    @Step
    public void clickEmailField() {
        onClick(EmailField());
    }

    @Step
    public void inputEmail(String email) {
        onType(EmailField(), email);
    }

    @Step
    public void clickPasswordField() {
        onClick(PasswordField());
    }

    @Step
    public void inputPassword(String password) {
        onType(PasswordField(), password);
    }

    @Step
    public void clickMasukBT() {
        onClick(MasukBT());
    }

    @Step
    public void validateHomePage() {
        waitUntilVisible(HomePage());
    }

    @Step
    public void validateWarningEmailMessage() {
        waitUntilVisible(WarningEmailBlankMessageLogin());
    }

    @Step
    public void validateLoginScreen() {
        waitUntilVisible(LoginScreen());
    }

    @Step
    public void validateErrorWrongEmailPassword() {
        waitUntilVisible(WarningWrongEmailPasswordLogin());
    }

    @Step
    public void validateWarningPasswordMessage() {
        waitUntilVisible(WarningPasswordMessageLogin());
    }

    @Step
    public void clickRegisterBT() {
        onClick(RegisterBT());
    }

    @Step
    public void validateRegisterScreen() {
        waitUntilVisible(RegisterScreen());
    }

    @Step
    public void clickNamaLengkapField() {
        onClick(NamaLengkapField());
    }

    @Step
    public void inputNamaLengkapRegister() {
        onType(NamaLengkapField(), createRandomName());
    }

    @Step
    public void inputBlankNamaLengkapRegister() {
        onType(NamaLengkapField(), usernameblank);
    }

    @Step
    public void clickEmailRegisterField() {
        onClick(EmailRegisterField());
    }

    @Step
    public void inputEmailRegister() {
        onType(EmailRegisterField(), createRandomName() + "@gmail.com");
    }
    @Step
    public void inputBlankEmailRegister() {
        onType(EmailRegisterField(), emailblank);
    }

    @Step
    public void clickNomorTeleponField() {
        onClick(NomorTeleponField());
    }

    @Step
    public void inputNomorTeleponRegister() {
        onType(NomorTeleponField(), "+628" + createRandomNumber());
    }
    @Step
    public void inputBlankNomorTeleponRegister() {
        onType(NomorTeleponField(), notelpblank);
    }

    @Step
    public void clickPasswordRegisterField() {
        onClick(PasswordRegisterField());
    }

    @Step
    public void inputPasswordRegister() {
        onType(PasswordRegisterField(), password);
    }
    @Step
    public void inputBlankPasswordRegister() {
        onType(PasswordRegisterField(), passwordblank);
    }

    @Step
    public void clickConfirmPasswordRegister() {
        onClick(ConfirmPasswordRegisterField());
    }

    @Step
    public void inputConfirmPasswordRegister() {
        onType(ConfirmPasswordRegisterField(), password);
    }
    @Step
    public void inputBlankConfirmPasswordRegister() {
        onType(ConfirmPasswordRegisterField(), passwordblank);
    }

    @Step
    public void validateSuccesRegister() {
        waitUntilVisible(ValidateSuccesRegister());
    }

    @Step
    public void clickDaftarBT() {
        onClick(DaftarBT());
    }
    @Step
    public void validateUsernameBlank() {
        waitUntilVisible(ValidateUsernameBlank());
    }

    @Step
    public void validateEmailBlank() {
        waitUntilVisible(ValidateEmailBlank());
    }
    @Step
    public void validateNotelpBlank() {
        waitUntilVisible(ValidateNotelpBlank());
    }
    @Step
    public void validatePasswordBlank() {
        waitUntilVisible(ValidatePasswordBlank());
    }
    @Step
    public void validateConfirmPasswordBlank() {
        isElementInvisible(ValidateConfirmPasswordBlank());
    }
    @Step
    public void validateTidakSamaConfirmPasswordBlank() {
        waitUntilVisible(ValidateTidakSamaConfirmPasswordBlank());
    }
}

