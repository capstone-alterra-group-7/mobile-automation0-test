package starter.screen;

import io.appium.java_client.MobileBy;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import starter.pageobject.BasePageObject;

public class UbahKataSandi extends BasePageObject {
    private By ScreenPage() {
        return MobileBy.xpath("//android.widget.ImageView[@content-desc=\"Temukan Destinasi Anda\n" +
                "Selamat datang! Temukan destinasi impian Anda.Jelajahi dan temukan pengalamanperjalanan yang luar biasa\"]");
    }

    private By LewatiButton(){
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Lewati\"]");
    }

    private By menuProfile(){
        return MobileBy.xpath("//android.view.View[@content-desc=\"Profil\n" +
                "Tab 3 dari 3\"]");
    }

    private By menuUbahKataSandi(){
        return MobileBy.xpath("//android.view.View[@content-desc=\"Ubah Kata Sandi\n" +
                "Ubah kata sandi Anda\"]");
    }

    private By KataSandiLamaField() {
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]");
    }

    private By KataSandiBaruField() {
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]");
    }

    private By KonfirmasiField() {
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[3]");
    }

    private By buttonSelanjutnya() {
        return MobileBy.xpath("//android.view.View[@content-desc=\"Selanjutnya\"]");
    }
    private By snackbarSuccessChangePassword() {
        return MobileBy.xpath("//android.view.View[@content-desc=\"Kata sandi berhasil diperbarui.\"]");
    }
    private By LoginPage() {
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View");
    }

    private By emailField() {
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]");
    }

    private By passwordField() {
        return  MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]");
    }

    private By loginButton(){
        return MobileBy.xpath("(//android.view.View[@content-desc=\"Masuk\"])[2]");
    }

    private By HomePage(){
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View");
    }
    @Step
    public boolean userOnTheLoginPage() { return waitUntilVisible(LoginPage()).isDisplayed();
    }

    @Step
    public void userClickOnEmailField() { onClick(emailField());
    }

    @Step
    public void userInputOnEmailField(String email) { onType(emailField(), email);
    }
    @Step
    public void userClickOnPasswordField() { onClick(passwordField());
    }
    @Step
    public void userInputOnPasswordField(String password) { onType(passwordField(), password);
    }
    @Step
    public void userClickLoginButton() { onClick(loginButton());
    }
    @Step
    public boolean userSeeHomePage() { return waitUntilVisible(HomePage()).isDisplayed();
    }

    @Step
    public boolean welcomeScreenPage() { return waitUntilVisible(ScreenPage()).isDisplayed();
    }

    @Step
    public void skipWelcomeScreen() { onClick(LewatiButton());
    }

    @Step
    public void clickMenuProfile() { onClick(menuProfile());
    }

    @Step
    public void clickUbahKataSandi() { onClick(menuUbahKataSandi());
    }

    @Step
    public void inputKataSandiLama(String KataSandiLama) {
        onType(KataSandiLamaField(), KataSandiLama);
    }
    @Step
    public void inputKataSandiBaru(String KataSandiBaru) {
        onType(KataSandiBaruField(), KataSandiBaru);
    }
    @Step
    public void konfirmasiKataSandiBaru(String Konfirmasi) {
        onType(KonfirmasiField(), Konfirmasi);
    }
    @Step
    public void clickButtonSelanjutnya() {
        onClick(buttonSelanjutnya());
    }
    @Step
    public boolean SuccessChangePassword() {
        return waitUntilVisible(snackbarSuccessChangePassword()).isDisplayed();
    }
}
