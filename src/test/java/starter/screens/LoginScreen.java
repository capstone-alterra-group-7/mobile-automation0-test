package starter.screens;

import com.github.javafaker.App;
import io.appium.java_client.AppiumBy;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.By;
import test.automation.pageobject.BasePageObject;

public class LoginScreen extends BasePageObject {

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
    //////////////////////////////////////////=============EDIT PROFILE======================//////////////////////////////



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
}

