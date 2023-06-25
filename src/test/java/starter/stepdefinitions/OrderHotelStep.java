package starter.stepdefinitions;

import io.appium.java_client.android.nativekey.AndroidKey;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.screens.OrderHotelScreen;
import test.automation.driver.AndroidDriverPool;


public class OrderHotelStep {

    @Steps
    OrderHotelScreen orderHotelScreen;

    private AndroidDriverPool driver;
    @Given("user on welcome screen page OH")
    public void userOnLoginScreenPageOH5() {
        orderHotelScreen.validateWelcomeScreen();
    }
    @When("user skip Welcome Screen and go to login page OH")
    public void userSkipWelcomeScreenPageOH5() {
        orderHotelScreen.skipWelcomeScreen();
    }
    @And("user input valid email OH")
    public void userInputEmailOH5() {
        orderHotelScreen.clickEmailField();
        orderHotelScreen.inputEmail("newuser2@gmail.com");
    }

    @And("user input valid password OH")
    public void userInputPasswordOH5() {
        orderHotelScreen.clickPasswordField();
        orderHotelScreen.inputPassword("newuser2");

    }
    @And("user click masuk button OH")
    public void userClickMasukBTOH5() {
        orderHotelScreen.clickMasukBT();


    }

    @Then("user can login and go to home page OH")
    public void validateUserGoToHomePageOH5() {
        orderHotelScreen.validateHomePage();
    }
    @And("user click order hotel OH")
    public void userClickOrderHotelBTOH() {
        orderHotelScreen.clickHotelBT();
    }
    @And("user input pencarian pemesanan OH")
    public void userInputPencarianPemesananHotelOH() {
        orderHotelScreen.clickTanggalPemesananHBT();
        orderHotelScreen.clickTanggal29PemesananHBT();
        orderHotelScreen.clickTanggal30PemesananHBT();
        AndroidDriverPool.pressBack();
        orderHotelScreen.clickJumlahKamarPemesananHBT();
        AndroidDriverPool.pressKeyboardKey(AndroidKey.DIGIT_1);
        orderHotelScreen.clickDewasaPemesananHBT();
        AndroidDriverPool.pressKeyboardKey(AndroidKey.DIGIT_1);
        orderHotelScreen.clickCariPemesananHBT();




    }
    @And("user choose hotel and room OH")
    public void userChooseHotel() {
        orderHotelScreen.clickHotel1BT();
        orderHotelScreen.clickKamarBT();
        orderHotelScreen.clickPilihKamar1BT();

    }
    @And("user input detail pemesanan OH")
    public void userInputDetailPemesananPelangganHotel () {
        orderHotelScreen.clickDPelangganBT();
        orderHotelScreen.clickDPemesananBT();
        orderHotelScreen.clickNamaPemesananBT();
        orderHotelScreen.inputNamaPemesanan("newuser2");
        AndroidDriverPool.pressBack();
        orderHotelScreen.clickNoTelpPemesananBT();
        orderHotelScreen.inputNoTelpPemesanan("0895618458956");
        AndroidDriverPool.pressBack();
        orderHotelScreen.clickEmailField();
        orderHotelScreen.inputEmail("newuser2@gmail.com");
        AndroidDriverPool.pressBack();
        AndroidDriverPool.scrollDown();
        orderHotelScreen.clickTuanNyonyaBT();
        orderHotelScreen.clickTuanBT();
        orderHotelScreen.clickNoIdentitasBT();
        orderHotelScreen.inputNoIdentitas("1234567891011112");
        AndroidDriverPool.pressBack();
        orderHotelScreen.clickNamaPelangganBT();
        orderHotelScreen.inputNamaPelanggan("newuser2");
        AndroidDriverPool.pressBack();
        orderHotelScreen.clickPermintaanKhusus();
        orderHotelScreen.inputPermintaanKhusus("Tolong siapkan kamar saya dengan cepat, bersih, udara segar, dan rapi");
        AndroidDriverPool.pressBack();
        orderHotelScreen.clickKonfirmasiPemesanan();
        orderHotelScreen.clickYAKonfirmasiPemesanan();



    }
        @And("user choose voucher OH")
        public void userInputVoucherCode() {
            orderHotelScreen.clickVoucher();
            orderHotelScreen.inputVoucher("kelompok7");
            orderHotelScreen.TambahKanVoucher();
            AndroidDriverPool.pressBack();
        }
        @And("user choose payment hotel OH")
        public void userChoosePayment() {
            orderHotelScreen.clickVACC();
            orderHotelScreen.clickVACCTAP();
            orderHotelScreen.clickBCA();
            orderHotelScreen.clickLanjutBayarHotel();

        }
        @When("user pay the order hotel and get success message")
        public void userPayTheOrderAndGetSucces() {
            orderHotelScreen.BayarHotel();
            orderHotelScreen.validatePembayaranBerhasil();
        }
        @Then("user get the factur of they order")
        public void userGetTheFactur() {
            orderHotelScreen.validateFakturPembayaranBerhasil();
            orderHotelScreen.CekPesanan();
        }
//    @And("user input detail pemesanan OH")
//    public void userInputDetailPemesanan() {
//
//
//
//
//    }
//    @And("user input detail penumpang OH")
//    public void userInputDetailPenumpang() {
//
//
//    }
//    @And("user pilih kursi OH")
//    public void userChooseKursi() {
//
//
//    }
//    @And("user click konfirmasi dpka OH")
//    public void userCLickKonfirmasiDPKA() {
//
//    }
//    @And("user choose pembayaran OH")
//    public void userChoosePembayaranKA() {
//
//    }
//    @And("user Bayar order ka OH")
//    public void userCLickBayarKA() {
//
//    }
//    @And("user get the faktur of order ka OH")
//    public void userGetFacturOH() {
//
//    }
//    @Then("user can check they order and back to home page OH")
//    public void userSuccesOrderAndCheckTheyOrderKA() {
//
//    }
    }


    //////////////////////////////////////////////////////==FITUR 2==//////////////////////////////////////


//////////////////////////////////////////////////////==FITUR 3==//////////////////////////////////////

//////////////////////////////////////////////////////==FITUR 4==//////////////////////////////////////

    //////////////////////////////////////////////////////==FITUR 5==//////////////////////////////////////


