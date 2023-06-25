package starter.stepdefinitions;

import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_scouse.An;
import net.thucydides.core.annotations.Steps;
import starter.screens.OrderKAScreen;
import test.automation.driver.AndroidDriverPool;


public class OrderKAStep {

    @Steps
    OrderKAScreen orderKAScreen;
    private AndroidDriverPool driver;
    @Given("user on welcome screen page OKA")
    public void userOnLoginScreenPage() {
        orderKAScreen.validateWelcomeScreen();
    }
    @When("user skip Welcome Screen and go to login page OKA")
    public void userSkipWelcomeScreenPage() {
        orderKAScreen.skipWelcomeScreen();
    }
    @And("user input valid email OKA")
    public void userInputEmail() {
        orderKAScreen.clickEmailField();
        orderKAScreen.inputEmail("newuser2@gmail.com");
    }

    @And("user input valid password OKA")
    public void userInputPassword() {
        orderKAScreen.clickPasswordField();
        orderKAScreen.inputPassword("newuser2");
        AndroidDriverPool.pressBack();

    }
    @And("user click masuk button OKA")
    public void userClickMasukBT() {
        orderKAScreen.clickMasukBT();
    }
    @Then("user can login and go to home page OKA")
    public void validateUserGoToHomePage() {
        orderKAScreen.validateHomePage();

    }
    @And("user click order ka OKA")
    public void userClickOrderKABT() {
        orderKAScreen.clickOrderKABT();
        orderKAScreen.validateOrderKAPage();
    }
    @And("user input stasiun asal OKA")
    public void userClickStasiunAsalBT() {
        orderKAScreen.clickStasiunAsal1();
        orderKAScreen.clickStasiunAsal2();
        AndroidDriverPool.delay(5000);
        orderKAScreen.inputStasiunAsal("so");
        AndroidDriverPool.delay(1000);
        orderKAScreen.inputStasiunAsal("lo");
        orderKAScreen.clickStasiunAsalSOLO();
        AndroidDriverPool.delay(3000);
    }
    @And("user input stasiun tujuan OKA")
    public void userClickStasiunTujuanBT() {
        orderKAScreen.clickStasiunTujuan1();
        orderKAScreen.clickStasiunTujuan2();
        orderKAScreen.inputStasiunTujuan("yogyakarta");
        orderKAScreen.clickStasiunTujuanYOGYAKARTA();
    }
    @And("user input tanggal keberangkatan OKA")
    public void userInputTanggalKeberangkatan () {
        orderKAScreen.clickTanggalKeberangkatanField();
        orderKAScreen.click21Tanggal();
        orderKAScreen.clickOKTanggal();
    }
    @And("user choose dewasa OKA")
    public void uerChooseDewasa() {
        orderKAScreen.clickDewasaField();
        orderKAScreen.inputDewasa("1");
        AndroidDriverPool.pressBack();
    }
    @And("user choose anak anak OKA")
    public void userChooseAnakanak() {
        orderKAScreen.clickAnakAnakField();
    }
    @And("user choose jenis ka and click cari ka OKA")
    public void userClickJenisKA() {
        orderKAScreen.clickJenisKA();
        orderKAScreen.clickSemuaJenisKA();
        orderKAScreen.clickCariJenisKA();
    }
    @When("user choose matarmajaKA and click matarmajaKA OKA")
    public void userClickKA() {
        orderKAScreen.clickMatarmajaKA();
    }
    @And("user input detail pemesanan OKA")
    public void userInputDetailPemesanan() {
        orderKAScreen.clickDetailPenumpangBT();
        orderKAScreen.clickDetailPemesananKA();
        orderKAScreen.clickNamaLengkapDPemesananKAField();
        orderKAScreen.inputNamaLengkapDPemesanKA("newuser2");
        orderKAScreen.clickNomorTeleponDPKAField();
        orderKAScreen.inputNomorTeleponDPKA("0895618458956");
//        AndroidDriverPool.pressBack();
        orderKAScreen.clickEmailDPKAField();
        orderKAScreen.inputEmailDPKA("newuser2@gmail.com");
        AndroidDriverPool.delay(5000);
//        AndroidDriverPool.pressBack();
        AndroidDriverPool.scrollDown();




    }
    @And("user input detail penumpang OKA")
    public void userInputDetailPenumpang() {
        orderKAScreen.clickTambahkanSebagaiPenumpangBT();
        orderKAScreen.clickTuanNyonyaDPKAField();
        orderKAScreen.clickTuanDPKA();
        orderKAScreen.clickNomorIdentitas();
        orderKAScreen.inputNomorIdentitasDPKA("69696969669");
//        AndroidDriverPool.pressBack();

    }
    @And("user pilih kursi OKA")
    public void userChooseKursi() {
        orderKAScreen.clickPilihKursiDPKA();
        orderKAScreen.clickPilihKursi1DPKA();
        orderKAScreen.clickKonfirmasiPilihKursiDPKA();
//        AndroidDriverPool.pressBack();
    }
    @And("user click konfirmasi dpka OKA")
    public void userCLickKonfirmasiDPKA() {
        orderKAScreen.clickKonfirmasiDPKA();
        orderKAScreen.clickKonfirmasiYADPKA();
    }
    @And("user choose pembayaran OKA")
    public void userChoosePembayaranKA() {
        orderKAScreen.clickVirtualACCDPKA();
        orderKAScreen.clickBCADPKA();
        AndroidDriverPool.scrollDown();
    }
    @And("user Bayar order ka OKA")
    public void userCLickBayarKA() {
        orderKAScreen.clickLanjutBayarDPKA();
        AndroidDriverPool.delay(5000);
        orderKAScreen.clickBayarDPKA();
    }
    @And("user get the faktur of order ka OKA")
    public void userGetFacturOKA() {
        orderKAScreen.validateStatusPembayaranDPKA();
        orderKAScreen.validateFakturStatusPembayaranDPKA();
    }
    @Then("user can check they order and back to home page OKA")
    public void userSuccesOrderAndCheckTheyOrderKA() {
        orderKAScreen.clickCekPesananDPKA();
        orderKAScreen.validateHomePage();
    }



    //////////////////////////////////////////////////////==FITUR 2==//////////////////////////////////////
    @Given("user on welcome screen page OKA2")
    public void userOnLoginScreenPage2() {
        orderKAScreen.validateWelcomeScreen();
    }
    @When("user skip Welcome Screen and go to login page OKA2")
    public void userSkipWelcomeScreenPage2() {
        orderKAScreen.skipWelcomeScreen();
    }
    @And("user input valid email OKA2")
    public void userInputEmail2() {
        orderKAScreen.clickEmailField();
        orderKAScreen.inputEmail("newuser2@gmail.com");
    }

    @And("user input valid password OKA2")
    public void userInputPassword2() {
        orderKAScreen.clickPasswordField();
        orderKAScreen.inputPassword("newuser2");
        AndroidDriverPool.pressBack();

    }
    @And("user click masuk button OKA2")
    public void userClickMasukBT2() {
        orderKAScreen.clickMasukBT();
    }
    @Then("user can login and go to home page OKA2")
    public void validateUserGoToHomePage2() {
        orderKAScreen.validateHomePage();

    }
    @And("user click order ka OKA2")
    public void userClickOrderKABT2() {
        orderKAScreen.clickOrderKABT();
        orderKAScreen.validateOrderKAPage();
    }
    @And("user input stasiun asal OKA2")
    public void userClickStasiunAsalBT2() {
            orderKAScreen.clickStasiunAsal1();
            orderKAScreen.clickStasiunAsal2();
            AndroidDriverPool.delay(5000);
            orderKAScreen.inputStasiunAsal("so");
            AndroidDriverPool.delay(1000);
            orderKAScreen.inputStasiunAsal("lo");
            orderKAScreen.clickStasiunAsalSOLO();
        AndroidDriverPool.delay(3000);
        }
    @And("user input stasiun tujuan OKA2")
    public void userClickStasiunTujuanBT2() {
        orderKAScreen.clickStasiunTujuan1();
        orderKAScreen.clickStasiunTujuan2();
        orderKAScreen.inputStasiunTujuan("yogyakarta");
        orderKAScreen.clickStasiunTujuanYOGYAKARTA();
    }
    @And("user input tanggal keberangkatan OKA2")
    public void userInputTanggalKeberangkatan2() {
        orderKAScreen.clickTanggalKeberangkatanField();
        orderKAScreen.click21Tanggal();
        orderKAScreen.clickOKTanggal();
    }
    @And("user choose dewasa OKA2")
    public void uerChooseDewasa2() {
        orderKAScreen.clickDewasaField();
        orderKAScreen.inputDewasa("1");
        AndroidDriverPool.pressBack();
    }
    @And("user choose anak anak OKA2")
    public void userChooseAnakanak2() {
        orderKAScreen.clickAnakAnakField();
    }
    @And("user choose jenis ka and click cari ka OKA2")
    public void userClickJenisKA2() {
        orderKAScreen.clickJenisKA();
        orderKAScreen.clickSemuaJenisKA();
        orderKAScreen.clickCariJenisKA();
    }
    @When("user choose matarmajaKA and click matarmajaKA OKA2")
    public void userClickKA2() {
        orderKAScreen.clickMatarmajaKA();
    }
    @And("user input detail pemesanan OKA2")
    public void userInputDetailPemesanan2() {
        orderKAScreen.clickDetailPenumpangBT();
        orderKAScreen.clickDetailPemesananKA();
        orderKAScreen.clickNamaLengkapDPemesananKAField();
        orderKAScreen.inputNamaLengkapDPemesanKA("newuser2");
        orderKAScreen.clickNomorTeleponDPKAField();
        orderKAScreen.inputNomorTeleponDPKA("0895618458956");
//        AndroidDriverPool.pressBack();
        orderKAScreen.clickEmailDPKAField();
        orderKAScreen.inputEmailDPKA("newuser2@gmail.com");
        AndroidDriverPool.delay(5000);
//        AndroidDriverPool.pressBack();
        AndroidDriverPool.scrollDown();



    }
    @And("user input detail penumpang OKA2")
    public void userInputDetailPenumpang2() {
        orderKAScreen.clickTambahkanSebagaiPenumpangBT();
        orderKAScreen.clickTuanNyonyaDPKAField();
        orderKAScreen.clickTuanDPKA();
        orderKAScreen.clickNomorIdentitas();
        orderKAScreen.inputNomorIdentitasDPKA("69696969669");
//        AndroidDriverPool.pressBack();
    }
    @And("user pilih kursi OKA2")
    public void userChooseKursi2() {
        orderKAScreen.clickPilihKursiDPKA();
        orderKAScreen.clickPilihKursi1DPKA();
        orderKAScreen.clickKonfirmasiPilihKursiDPKA();

    }
    @And("user click konfirmasi dpka OKA2")
    public void userCLickKonfirmasiDPKA2() {
        orderKAScreen.clickKonfirmasiDPKA();
        orderKAScreen.clickKonfirmasiYADPKA();
    }
    @And("user choose pembayaran OKA2")
    public void userChoosePembayaranKA2() {
        orderKAScreen.clickVirtualACCDPKA();
        orderKAScreen.clickBCADPKA();
        AndroidDriverPool.scrollDown();
    }
    @And("user is not pay the order")
    public void userCLickLanjutKA2() {
        orderKAScreen.clickLanjutBayarDPKA();
    }
    @Then("user stay on pembayaran screen")
    public void userStayOnPembayaranScreenOKA2() {
        orderKAScreen.validateOnPembayaranScreenDPKA();
    }

//////////////////////////////////////////////////////==FITUR 3==//////////////////////////////////////
@Given("user on welcome screen page OKA3")
public void userOnLoginScreenPage3() {
    orderKAScreen.validateWelcomeScreen();
}
    @When("user skip Welcome Screen and go to login page OKA3")
    public void userSkipWelcomeScreenPage3() {
        orderKAScreen.skipWelcomeScreen();
    }
    @And("user input valid email OKA3")
    public void userInputEmail3() {
        orderKAScreen.clickEmailField();
        orderKAScreen.inputEmail("newuser2@gmail.com");
    }

    @And("user input valid password OKA3")
    public void userInputPassword3() {
        orderKAScreen.clickPasswordField();
        orderKAScreen.inputPassword("newuser2");
        AndroidDriverPool.pressBack();

    }
    @And("user click masuk button OKA3")
    public void userClickMasukBT3() {
        orderKAScreen.clickMasukBT();
    }
    @Then("user can login and go to home page OKA3")
    public void validateUserGoToHomePage3() {
        orderKAScreen.validateHomePage();

    }
    @And("user click order ka OKA3")
    public void userClickOrderKABT3() {
        orderKAScreen.clickOrderKABT();
        orderKAScreen.validateOrderKAPage();
    }
    @And("user input stasiun asal OKA3")
    public void userClickStasiunAsalBT3() {
        orderKAScreen.clickStasiunAsal1();
        orderKAScreen.clickStasiunAsal2();
        AndroidDriverPool.delay(5000);
        orderKAScreen.inputStasiunAsal("so");
        AndroidDriverPool.delay(1000);
        orderKAScreen.inputStasiunAsal("lo");
        orderKAScreen.clickStasiunAsalSOLO();
        AndroidDriverPool.delay(3000);
    }
    @And("user input stasiun tujuan OKA3")
    public void userClickStasiunTujuanBT3() {
        orderKAScreen.clickStasiunTujuan1();
        orderKAScreen.clickStasiunTujuan2();
        orderKAScreen.inputStasiunTujuan("yogyakarta");
        orderKAScreen.clickStasiunTujuanYOGYAKARTA();
    }
    @And("user input tanggal keberangkatan OKA3")
    public void userInputTanggalKeberangkatan3() {
        orderKAScreen.clickTanggalKeberangkatanField();
        orderKAScreen.click21Tanggal();
        orderKAScreen.clickOKTanggal();
    }
    @And("user choose dewasa OKA3")
    public void uerChooseDewasa3() {
        orderKAScreen.clickDewasaField();
        orderKAScreen.inputDewasa("1");
        AndroidDriverPool.pressBack();
    }
    @And("user choose anak anak OKA3")
    public void userChooseAnakanak3() {
        orderKAScreen.clickAnakAnakField();
    }
    @And("user choose jenis ka and click cari ka OKA3")
    public void userClickJenisKA3() {
        orderKAScreen.clickJenisKA();
        orderKAScreen.clickSemuaJenisKA();
        orderKAScreen.clickCariJenisKA();
    }
    @When("user choose matarmajaKA and click matarmajaKA OKA3")
    public void userClickKA3() {
        orderKAScreen.clickMatarmajaKA();
    }
    @And("user input blank detail pemesanan OKA3")
    public void userInputBlankDetailPemesanan3() {
        orderKAScreen.clickDetailPenumpangBT();
        orderKAScreen.clickDetailPemesananKA();
        AndroidDriverPool.scrollDown();



    }
    @And("user input detail penumpang OKA3")
    public void userInputDetailPenumpang3() {
        orderKAScreen.clickTambahkanSebagaiPenumpangBT();
        orderKAScreen.clickTuanNyonyaDPKAField();
        orderKAScreen.clickTuanDPKA();
        orderKAScreen.clickNomorIdentitas();
        orderKAScreen.inputNomorIdentitasDPKA("69696969669");
//        AndroidDriverPool.pressBack();
    }
    @And("user pilih kursi OKA3")
    public void userChooseKursi3() {
        orderKAScreen.clickPilihKursiDPKA();
        orderKAScreen.clickPilihKursi1DPKA();
        orderKAScreen.clickKonfirmasiPilihKursiDPKA();
    }
    @And("user click konfirmasi dpka OKA3")
    public void userCLickKonfirmasiDPKA3() {
        orderKAScreen.clickKonfirmasiDPKA();

    }
    @Then("user cant pay and get alert to fill detail pemesanan OKA3")
    public void userGetAlertFillDetailPemesananKA3() {
        orderKAScreen.validateAlertFillDPemesananKA();
    }
//////////////////////////////////////////////////////==FITUR 4==//////////////////////////////////////
@Given("user on welcome screen page OKA4")
public void userOnLoginScreenPage4() {
    orderKAScreen.validateWelcomeScreen();
}
    @When("user skip Welcome Screen and go to login page OKA4")
    public void userSkipWelcomeScreenPage4() {
        orderKAScreen.skipWelcomeScreen();
    }
    @And("user input valid email OKA4")
    public void userInputEmail4() {
        orderKAScreen.clickEmailField();
        orderKAScreen.inputEmail("newuser2@gmail.com");
    }

    @And("user input valid password OKA4")
    public void userInputPassword4() {
        orderKAScreen.clickPasswordField();
        orderKAScreen.inputPassword("newuser2");
        AndroidDriverPool.pressBack();

    }
    @And("user click masuk button OKA4")
    public void userClickMasukBT4() {
        orderKAScreen.clickMasukBT();
    }
    @Then("user can login and go to home page OKA4")
    public void validateUserGoToHomePage4() {
        orderKAScreen.validateHomePage();

    }
    @And("user click order ka OKA4")
    public void userClickOrderKABT4() {
        orderKAScreen.clickOrderKABT();
        orderKAScreen.validateOrderKAPage();
    }
    @And("user input stasiun asal OKA4")
    public void userClickStasiunAsalBT4() {
        orderKAScreen.clickStasiunAsal1();
        orderKAScreen.clickStasiunAsal2();
        AndroidDriverPool.delay(5000);
        orderKAScreen.inputStasiunAsal("so");
        AndroidDriverPool.delay(1000);
        orderKAScreen.inputStasiunAsal("lo");
        orderKAScreen.clickStasiunAsalSOLO();
        AndroidDriverPool.delay(3000);
    }
    @And("user input stasiun tujuan OKA4")
    public void userClickStasiunTujuanBT4() {
        orderKAScreen.clickStasiunTujuan1();
        orderKAScreen.clickStasiunTujuan2();
        orderKAScreen.inputStasiunTujuan("yogyakarta");
        orderKAScreen.clickStasiunTujuanYOGYAKARTA();
    }
    @And("user input tanggal keberangkatan OKA4")
    public void userInputTanggalKeberangkatan4() {
        orderKAScreen.clickTanggalKeberangkatanField();
        orderKAScreen.click21Tanggal();
        orderKAScreen.clickOKTanggal();
    }
    @And("user choose dewasa OKA4")
    public void uerChooseDewasa4() {
        orderKAScreen.clickDewasaField();
        orderKAScreen.inputDewasa("1");
        AndroidDriverPool.pressBack();
    }
    @And("user choose anak anak OKA4")
    public void userChooseAnakanak4() {
        orderKAScreen.clickAnakAnakField();
    }
    @And("user choose jenis ka and click cari ka OKA4")
    public void userClickJenisKA4() {
        orderKAScreen.clickJenisKA();
        orderKAScreen.clickSemuaJenisKA();
        orderKAScreen.clickCariJenisKA();
    }
    @When("user choose matarmajaKA and click matarmajaKA OKA4")
    public void userClickKA4() {
        orderKAScreen.clickMatarmajaKA();
    }
    @And("user input detail pemesanan OKA4")
    public void userInputDetailPemesanan4() {
        orderKAScreen.clickDetailPenumpangBT();
        orderKAScreen.clickDetailPemesananKA();
        orderKAScreen.clickNamaLengkapDPemesananKAField();
        orderKAScreen.inputNamaLengkapDPemesanKA("newuser2");
        orderKAScreen.clickNomorTeleponDPKAField();
        orderKAScreen.inputNomorTeleponDPKA("0895618458956");
//        AndroidDriverPool.pressBack();
        orderKAScreen.clickEmailDPKAField();
        orderKAScreen.inputEmailDPKA("newuser2@gmail.com");
        AndroidDriverPool.delay(5000);
//        AndroidDriverPool.pressBack();
        AndroidDriverPool.scrollDown();



    }
    @And("user input blank detail penumpang OKA4")
    public void userInputBlankDetailPenumpang4() {
    }
    @And("user pilih kursi OKA4")
    public void userChooseKursi4() {
        orderKAScreen.clickPilihKursiDPKA();
        orderKAScreen.clickPilihKursi1DPKA();
        orderKAScreen.clickKonfirmasiPilihKursiDPKA();

    }
    @And("user click konfirmasi dpka OKA4")
    public void userCLickKonfirmasiDPKA4() {
        orderKAScreen.clickKonfirmasiDPKA();

    }
    @Then("user cant pay and get alert to fill detail penumpang OKA4")
    public void userGetAlertFillDetailPenumpangKA4() {
        orderKAScreen.validateAlertFillDPenumpangKA();
    }
    //////////////////////////////////////////////////////==FITUR 5==//////////////////////////////////////
    @Given("user on welcome screen page OKA5")
    public void userOnLoginScreenPage5() {
        orderKAScreen.validateWelcomeScreen();
    }
    @When("user skip Welcome Screen and go to login page OKA5")
    public void userSkipWelcomeScreenPage5() {
        orderKAScreen.skipWelcomeScreen();
    }
    @And("user input valid email OKA5")
    public void userInputEmail5() {
        orderKAScreen.clickEmailField();
        orderKAScreen.inputEmail("newuser2@gmail.com");
    }

    @And("user input valid password OKA5")
    public void userInputPassword5() {
        orderKAScreen.clickPasswordField();
        orderKAScreen.inputPassword("newuser2");
        AndroidDriverPool.pressBack();

    }
    @And("user click masuk button OKA5")
    public void userClickMasukBT5() {
        orderKAScreen.clickMasukBT();
    }
    @Then("user can login and go to home page OKA5")
    public void validateUserGoToHomePage5() {
        orderKAScreen.validateHomePage();

    }
    @And("user click order ka OKA5")
    public void userClickOrderKABT5() {
        orderKAScreen.clickOrderKABT();
        orderKAScreen.validateOrderKAPage();
    }
    @And("user input stasiun asal OKA5")
    public void userClickStasiunAsalBT5() {
        orderKAScreen.clickStasiunAsal1();
        orderKAScreen.clickStasiunAsal2();
        AndroidDriverPool.delay(5000);
        orderKAScreen.inputStasiunAsal("so");
        AndroidDriverPool.delay(1000);
        orderKAScreen.inputStasiunAsal("lo");
        orderKAScreen.clickStasiunAsalSOLO();
        AndroidDriverPool.delay(3000);
    }
    @And("user input stasiun tujuan OKA5")
    public void userClickStasiunTujuanBT5() {
        orderKAScreen.clickStasiunTujuan1();
        orderKAScreen.clickStasiunTujuan2();
        orderKAScreen.inputStasiunTujuan("yogyakarta");
        orderKAScreen.clickStasiunTujuanYOGYAKARTA();
    }
    @And("user input tanggal keberangkatan OKA5")
    public void userInputTanggalKeberangkatan5() {
        orderKAScreen.clickTanggalKeberangkatanField();
        orderKAScreen.click21Tanggal();
        orderKAScreen.clickOKTanggal();
    }
    @And("user choose dewasa OKA5")
    public void uerChooseDewasa5() {
        orderKAScreen.clickDewasaField();
        orderKAScreen.inputDewasa("1");
        AndroidDriverPool.pressBack();
    }
    @And("user choose anak anak OKA5")
    public void userChooseAnakanak5() {
        orderKAScreen.clickAnakAnakField();
    }
    @And("user choose jenis ka and click cari ka OKA5")
    public void userClickJenisKA5() {
        orderKAScreen.clickJenisKA();
        orderKAScreen.clickSemuaJenisKA();
        orderKAScreen.clickCariJenisKA();
    }
    @When("user choose matarmajaKA and click matarmajaKA OKA5")
    public void userClickKA5() {
        orderKAScreen.clickMatarmajaKA();
    }
    @And("user input detail pemesanan OKA5")
    public void userInputDetailPemesanan5() {
        orderKAScreen.clickDetailPenumpangBT();
        orderKAScreen.clickDetailPemesananKA();
        orderKAScreen.clickNamaLengkapDPemesananKAField();
        orderKAScreen.inputNamaLengkapDPemesanKA("newuser2");
        orderKAScreen.clickNomorTeleponDPKAField();
        orderKAScreen.inputNomorTeleponDPKA("0895618458956");
//        AndroidDriverPool.pressBack();
        orderKAScreen.clickEmailDPKAField();
        orderKAScreen.inputEmailDPKA("newuser2@gmail.com");
        AndroidDriverPool.delay(5000);
//        AndroidDriverPool.pressBack();
        AndroidDriverPool.scrollDown();



    }
    @And("user input detail penumpang OKA5")
    public void userInputDetailPenumpang5() {
        orderKAScreen.clickTambahkanSebagaiPenumpangBT();
        orderKAScreen.clickTuanNyonyaDPKAField();
        orderKAScreen.clickTuanDPKA();
        orderKAScreen.clickNomorIdentitas();
        orderKAScreen.inputNomorIdentitasDPKA("69696969669");
//        AndroidDriverPool.pressBack();
    }
    @And("user click konfirmasi dpka OKA5")
    public void userCLickKonfirmasiDPKA5() {
        orderKAScreen.clickKonfirmasiDPKA();

    }
    @Then("user cant pay and get alert to choose seat of OKA5")
    public void userGetAlertFillDetailPenumpangKA5() {
        orderKAScreen.validateAlertPilihKursiKA();
    }

}