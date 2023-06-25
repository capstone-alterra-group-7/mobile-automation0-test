package starter.screens;

import io.appium.java_client.AppiumBy;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import test.automation.pageobject.BasePageObject;

public class EditProfileScreen extends BasePageObject {

    private By WelcomeScreenDashboard() {
        return AppiumBy.xpath("//android.widget.ImageView[@content-desc=\"Temukan Destinasi Anda\n" +
                "Selamat datang! Temukan destinasi impian Anda.Jelajahi dan temukan pengalamanperjalanan yang luar biasa\"]");
    }

    private By lewatiWelcomeScreenBT() {
        return AppiumBy.xpath("//android.widget.Button[@content-desc=\"Lewati\"]");
    }

    private By LoginScreen() {
        return AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView");}

    private By EmailField () {
        return AppiumBy.xpath("(//android.view.View[@content-desc=\"Email\"]/following-sibling::android.widget.EditText)[1]");
    }

    private By PasswordField () {
        return AppiumBy.xpath("(//android.view.View[@content-desc=\"Kata Sandi\"]/following-sibling::android.widget.EditText)[1]");
    }
    private By MasukBT () {
        return AppiumBy.xpath(
                "(//android.view.View[@content-desc=\"Masuk\"])[2]");
    }
    private By HomePage () {
        return AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]");
    }
    private By WarningEmailBlankMessageLogin () {
        return AppiumBy.xpath("//android.view.View[@content-desc=\"Email tidak boleh kosong\"]");
    }
    private By WarningEmailInvalidFormatMessageLogin () {
        return AppiumBy.xpath("//android.view.View[@content-desc=\"Format Email tidak valid\"]");
    }
    private By WarningWrongEmailPasswordLogin () {
        return AppiumBy.xpath("//android.view.View[@content-desc=\"Email or password is wrong\"]");
    }
    private By WarningPasswordMessageLogin () {
        return AppiumBy.xpath("//android.view.View[@content-desc=\"Tolong masukkan kata sandi\"]");
    }
    /////////////////////////////////=============Edit Profile===============/////////////////////////////////////////////////////////
    private By ProfilBT () {
        return AppiumBy.xpath("//android.view.View[@content-desc=\"Profil\n" +
                "Tab 3 dari 3\"]");
    }
    private By ProfilPage () {
        return AppiumBy.xpath("//android.view.View[@content-desc=\"Profil\"]");
    }
    private By EditProfilBT () {
        return AppiumBy.xpath("//android.view.View[@content-desc=\"Ubah Profile\n" +
                "Ubah profile Anda\"]");
    }
    private By EditProfilPage () {
        return AppiumBy.xpath("//android.view.View[@content-desc=\"Ubah Profile\"]");
    }
    private By EditPotoProfilBT () {
        return AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]");
    }
    private By NamaLengkapField () {
        return AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[1]");
    }
    private By NomorTeleponField () {
        return AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[2]");
    }
    private By TanggalLahirField () {
        return AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[7]");
    }
    private By TanggalLahir1Field () {
        return AppiumBy.xpath("//android.view.View[@content-desc=\"Kamis, 1 Juni 2023\"]");
    }
    private By TanggalLahir30Field () {
        return AppiumBy.xpath("//android.view.View[@content-desc=\"Jumat, 30 Juni 2023\"]");
    }
    private By OkTanggalLahir1Field () {
        return AppiumBy.xpath("//android.widget.Button[@content-desc=\"OK\"]");
    }
    private By AlerTanggalLahir30Field () {
        return AppiumBy.xpath("//android.view.View[@content-desc=\"Birthday date cannot be in the future.\"]");
    }
    private By KewarganegaraanField () {
        return AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.Button");
    }
    private By SimpanEditProfileBT () {
        return AppiumBy.xpath("//android.view.View[@content-desc=\"Simpan\"]");
    }
    private By alertBirthdateFilled () {
        return AppiumBy.xpath("//android.view.View[@content-desc=\"Tanggal Lahir tidak boleh kosong\"]");
    }
    private By LogoutBT () {
        return AppiumBy.xpath("//android.view.View[@content-desc=\"Keluar\n" +
                "Keluar dari akun Anda\"]");
    }
    private By YaLogoutBT () {
        return AppiumBy.xpath("//android.view.View[@content-desc=\"Ya\"]");
    }
    private By TidakLogoutBT () {
        return AppiumBy.xpath("//android.view.View[@content-desc=\"Tidak\"]");
    }
    private By TutupYaTidakLogoutScreen () {
        return AppiumBy.xpath("//android.view.View[@content-desc=\"Tutup\"]");
    }


    //////////////////////////////////////////=============Function======================//////////////////////////////
    @Step
    public void validateWelcomeScreen () {
        waitUntilVisible(WelcomeScreenDashboard());
    }
    @Step
    public void skipWelcomeScreen(){onClick(lewatiWelcomeScreenBT());}
    @Step
    public void clickEmailField () {
        onClick(EmailField());
    }
    @Step
    public void inputEmail (String email){
        onType(EmailField(), email);
    }
    @Step
    public void clickPasswordField () {
        onClick(PasswordField());
    }
    @Step
    public void inputPassword (String password){
        onType(PasswordField(), password);
    }
    @Step
    public void clickMasukBT () {
        onClick(MasukBT());
    }
    @Step
    public void validateHomePage () {
        waitUntilVisible(HomePage());
    }
    @Step
    public void validateWarningEmailMessage() {
        waitUntilVisible(WarningEmailBlankMessageLogin());
    }
    @Step
    public void validateLoginScreen(){
        waitUntilVisible(LoginScreen());
    }
    @Step
    public void validateErrorWrongEmailPassword(){
        waitUntilVisible(WarningWrongEmailPasswordLogin());
    }
    @Step
    public void validateWarningPasswordMessage() {
        waitUntilVisible(WarningPasswordMessageLogin());
    }
    /////////////////////////////////////////////////////////=========LOGOUT FUNCTION==================////////////////
    @Step
    public void clickProfilBT () {
        onClick(ProfilBT());
    }
    @Step
    public void validateProfilePage () {
        waitUntilVisible(ProfilPage());
    }
    @Step
    public void clickLogoutBT () {
        onClick(LogoutBT());
    }
    @Step
    public void clickYaLogoutBT () {
        onClick(YaLogoutBT());
    }
    @Step
    public void clickTidakLogoutBT () {
        onClick(TidakLogoutBT());
    }
    @Step
    public void clickOnScreenToBackProfilPage () {
        onClick(TutupYaTidakLogoutScreen());
    }
    /////////////////////////////////////////////////////////=========EDIT PROFILE FUNCTION==================////////////////
    @Step
    public void clickEditProfilBT () {
        onClick(EditProfilBT());
    }
    @Step
    public void validateOnEditProfilePage(){
        waitUntilVisible(EditProfilPage());
    }
    @Step
    public void clickNamaLengkapField () {
        onClick(NamaLengkapField());
    }
    @Step
    public void inputNamaLengkap (String namalengkap){
        onType(NamaLengkapField(), namalengkap);
    }
    @Step
    public void clickTanggalLahirField (){
        onClick(TanggalLahirField());
    }
    @Step
    public void clickTanggalLahir1Field (){
        onClick(TanggalLahir1Field());
    }
    @Step
    public void clickOKTanggalLahirField (){
        onClick(OkTanggalLahir1Field());
    }
    @Step
    public void clickSimpanEditProfileBT (){
        onClick(SimpanEditProfileBT());
    }
    @Step
    public void validateEmaillFilled (){
        waitUntilVisible(alertBirthdateFilled());
    }
    @Step
    public void validateBirthday30 (){
        waitUntilVisible(AlerTanggalLahir30Field());
    }
    @Step
    public void clickTanggalLahir30Field (){
       onClick(TanggalLahir30Field());
    }
}

