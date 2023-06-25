package starter.screens;

import io.appium.java_client.AppiumBy;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import test.automation.pageobject.BasePageObject;

public class OrderKAScreen extends BasePageObject {

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
    //////////////////////////////////////////=============ORDER KA======================//////////////////////////////
    private By OrderKABT () {
        return AppiumBy.xpath("//android.view.View[@content-desc=\"Kereta Api\"]");
    }
    private By OrderKAPage () {
        return AppiumBy.xpath("//android.view.View[@content-desc=\"Asal\n" +
                "Tujuan\n" +
                "Tanggal Keberangkatan\n" +
                "Pulang Pergi?\n" +
                "Dewasa\n" +
                "Anak - Anak\n" +
                "Jenis Kereta Api\"]");
    }
    private By StasiunAsalOrderKAFieldBT () {
        return AppiumBy.xpath("//android.view.View[@content-desc=\"Asal\n" +
                "Tujuan\n" +
                "Tanggal Keberangkatan\n" +
                "Pulang Pergi?\n" +
                "Dewasa\n" +
                "Anak - Anak\n" +
                "Jenis Kereta Api\"]/android.view.View[1]");
    }
    private By StasiunAsalOrderKAField () {
        return AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.EditText");
    }
    private By AsalSOLOOrderKA () {
        return AppiumBy.xpath("//android.view.View[@content-desc=\"SOLO KOTA BARU\n" +
                "SOLO-123\n" +
                "SOLO\"]");
    }
    private By StasiunTujuanOrderKAFieldBT () {
        return AppiumBy.xpath("//android.view.View[@content-desc=\"Asal\n" +
                "Tujuan\n" +
                "Tanggal Keberangkatan\n" +
                "Pulang Pergi?\n" +
                "Dewasa\n" +
                "Anak - Anak\n" +
                "Jenis Kereta Api\"]/android.view.View[2]");
    }
    private By TujuanYOGYAKARTAOrderKA () {
        return AppiumBy.xpath("//android.view.View[@content-desc=\"YOGYAKARTA LEMPUYANGAN\n" +
                "YK-123\n" +
                "YOGYAKARTA\"]");
    }
    private By StasiunTujuanOrderKAField () {
        return AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.EditText");
    }
    private By TanggalKeberangkatanField () {
        return AppiumBy.xpath("//android.view.View[@content-desc=\"Asal\n" +
                "Tujuan\n" +
                "Tanggal Keberangkatan\n" +
                "Pulang Pergi?\n" +
                "Dewasa\n" +
                "Anak - Anak\n" +
                "Jenis Kereta Api\"]/android.view.View[3]");
    }
    private By Tanggal21BTKLNDR () {
        return AppiumBy.xpath("//android.view.View[@content-desc=\"Rabu, 21 Juni 2023\"]");
    }
    private By OKTanggalBT () {
        return AppiumBy.xpath("//android.widget.Button[@content-desc=\"OK\"]");
    }
    private By DewasaField () {
        return AppiumBy.xpath("//android.view.View[@content-desc=\"Asal\n" +
                "Tujuan\n" +
                "Tanggal Keberangkatan\n" +
                "Pulang Pergi?\n" +
                "Dewasa\n" +
                "Anak - Anak\n" +
                "Jenis Kereta Api\"]/android.widget.EditText[1]");
    }
    private By AnakAnakField () {
        return AppiumBy.xpath("//android.view.View[@content-desc=\"Asal\n" +
                "Tujuan\n" +
                "Tanggal Keberangkatan\n" +
                "Pulang Pergi?\n" +
                "Dewasa\n" +
                "Anak - Anak\n" +
                "Jenis Kereta Api\"]/android.widget.EditText[2]");
    }
    private By JenisKAField () {
        return AppiumBy.xpath("//android.view.View[@content-desc=\"Asal\n" +
                "Tujuan\n" +
                "Tanggal Keberangkatan\n" +
                "Pulang Pergi?\n" +
                "Dewasa\n" +
                "Anak - Anak\n" +
                "Jenis Kereta Api\"]/android.widget.Button[1]");
    }
    private By JenisKASEMUAField () {
        return AppiumBy.xpath("//android.view.View[@content-desc=\"Semua\"]");
    }
    private By CariOrderKABT () {
        return AppiumBy.xpath("//android.widget.Button[@content-desc=\"Cari\"]");
    }
    private By MatarmajaKABT () {
        return AppiumBy.xpath("//android.widget.ImageView[@content-desc=\"Matarmaja\n" +
                "Rp 14,-\n" +
                "Stasiun SOLO\n" +
                "Stasiun YOGYAKARTA\n" +
                "Ekonomi\n" +
                "Tersedia\n" +
                "07:10\n" +
                "08:23\n" +
                "21 Juni 2023\n" +
                "1 j 13 m\n" +
                "21 Juni 2023\"]");
    }
    private By DetailPemesananKABT () {
        return AppiumBy.xpath("//android.view.View[@content-desc=\"Detail Pemesanan \"]");
    }
    private By NamaLengkapDPemesananKAField() {
        return AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[13]/android.widget.EditText[1]");
    }
    private By NomorTeleponDPKAField () {
        return AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[13]/android.widget.EditText[2]");
    }
    private By EmailPemesananDPKAField () {
        return AppiumBy.xpath("(//android.view.View[@content-desc=\"Email\"]/following-sibling::android.widget.EditText)");
    }
    private By TambahkanSebagaiPenumpangBT () {
        return AppiumBy.xpath("//android.widget.Button[@content-desc=\"Tambahkan sebagai Penumpang\"]");
    }
    private By DetailPenumpangKABT () {
        return AppiumBy.xpath("//android.view.View[@content-desc=\"Detail Penumpang \"]");
    }

    private By TuanNyonyaDPKAField () {
        return AppiumBy.xpath("//android.widget.Button[@content-desc=\"Tn. / Ny.\"]");
    }
    private By TuanDPKA () {
        return AppiumBy.xpath("//android.view.View[@content-desc=\"Tuan\"]");
    }
    private By NyonyaDPKA () {
        return AppiumBy.xpath("//android.view.View[@content-desc=\"Nyonya\"]");
    }
    private By NomorIdentitasDPKAField () {
        return AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[3]/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]");
    }
    private By NamaLengkapDPenumpangKAField () {
        return AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[3]/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]");
    }
    private By PilihKursiDPKA () {
        return AppiumBy.xpath("//android.widget.Button[@content-desc=\"No.Kursi\"]");
    }
    private By PilihLokasiKursi1DPKA () {
        return AppiumBy.xpath("//android.view.View[@content-desc=\"Eko-1\n" +
                "Tab 1 dari 1\"]/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[8]/android.view.View/android.view.View[2]");
    }
    private By KonfirmasiPilihLokasiKursi1DPKA () {
        return AppiumBy.xpath("//android.widget.Button[@content-desc=\"Konfirmasi\"]");
    }
    private By KonfirmasiDPKA () {
        return AppiumBy.xpath("//android.widget.Button[@content-desc=\"Konfirmasi\"]");
    }
    private By AlertKonfirmasiDPKA () {
        return AppiumBy.xpath("private By KonfirmasiDPKA () {\n" +
                "        return AppiumBy.xpath(\"//android.widget.Button[@content-desc=\\\"Konfirmasi\\\"]\");\n" +
                "    }");
    }
    private By AlertKonfirmasiYADPKA () {
        return AppiumBy.xpath("//android.widget.Button[@content-desc=\"Ya\"]");
    }
    private By AlertKonfirmasiTidakDPKA () {
        return AppiumBy.xpath("//android.widget.Button[@content-desc=\"Tidak\"]");
    }
    private By PembayaranDPKAScreen () {
        return AppiumBy.xpath("//android.view.View[@content-desc=\"Pembayaran\"]");
    }
    private By PembayaranKartuDebitDPKA () {
        return AppiumBy.xpath("//android.widget.RadioButton[@content-desc=\"Kartu Kredit/Debit\"]");
    }
    private By PembayaranVirtualACCDPKA () {
        return AppiumBy.xpath("//android.widget.RadioButton[@content-desc=\"Virtual Account\"]");
    }
    private By PembayaranVABCADPKA () {
        return AppiumBy.xpath("//android.widget.ImageView[@content-desc=\"Bank Central Asia\"]");
    }
    private By PembayaranOVODPKA () {
        return AppiumBy.xpath("//android.widget.RadioButton[@content-desc=\"Ovo\"]");
    }
    private By PembayarangGOPAYDPKA () {
        return AppiumBy.xpath("//android.widget.RadioButton[@content-desc=\"Gopay\"]");
    }
    private By PembayaranMINIMARKETDPKA () {
        return AppiumBy.xpath("//android.widget.RadioButton[@content-desc=\"Minimarket\"]");
    }
    private By PembayaranBAYARDILOKETDPKA () {
        return AppiumBy.xpath("//android.widget.RadioButton[@content-desc=\"Bayar di Loket \"]");
    }
    private By LanjutBayarDPKABT () {
        return AppiumBy.xpath("//android.widget.Button[@content-desc=\"Order Ticket Now\"]");
    }
    private By BayarDPKABT () {
        return AppiumBy.xpath("//android.widget.Button[@content-desc=\"Bayar\"]");
    }
    private By ValidateBerhasiBayarDPKA () {
        return AppiumBy.xpath("//android.view.View[@content-desc=\"Pembayaran Berhasil!\"]");
    }
    private By ValidateFakturBerhasiBayarDPKA () {
        return AppiumBy.xpath("//android.view.View[@content-desc=\"Faktur\"]");
    }
    private By CekPesananBerhasilDPKABT () {
        return AppiumBy.xpath("//android.widget.Button[@content-desc=\"Cek Pesanan\"]");
    }
    private By ValidateAlertFillDetailPemesanan(){
        return AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[1]/android.widget.EditText");
    }
    private By ValidateAlertFillDetailPenumpang(){
        return AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[3]/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]");
    }
    private By ValidateAlertPilihKursi(){
        return AppiumBy.xpath("//android.view.View[@content-desc=\"Harap pilih seats keberangkatan anda!\"]");
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
    @Step
    public void clickOrderKABT () {
        onClick(OrderKABT());
    }
    @Step
    public void validateOrderKAPage () {
        waitUntilVisible(OrderKAPage());
    }
    @Step
    public void clickStasiunAsal1 () {
        onClick(StasiunAsalOrderKAFieldBT());
    }
    @Step
    public void clickStasiunAsal2 () {
        onClick(StasiunAsalOrderKAField());
    }
    @Step
    public void inputStasiunAsal (String stasiunasal) {
        onType(StasiunAsalOrderKAField(),stasiunasal);
    }
    @Step
    public void clickStasiunAsalSOLO() {
        onClick(AsalSOLOOrderKA());
    }
    @Step
    public void clickStasiunTujuan1 () {
        onClick(StasiunTujuanOrderKAFieldBT());
    }
    @Step
    public void clickStasiunTujuan2 () {
        onClick(StasiunTujuanOrderKAField());
    }
    @Step
    public void inputStasiunTujuan (String stasiuntujuan) {
        onType(StasiunTujuanOrderKAField(),stasiuntujuan);
    }
    @Step
    public void clickStasiunTujuanYOGYAKARTA() {
        onClick(TujuanYOGYAKARTAOrderKA());
    }
    @Step
    public void clickTanggalKeberangkatanField () {
        onClick((TanggalKeberangkatanField()));
    }
    @Step
    public void click21Tanggal () {
        onClick((Tanggal21BTKLNDR()));
    }
    @Step
    public void clickOKTanggal () {
        onClick((OKTanggalBT()));
    }
    @Step
    public void clickDewasaField () {
        onClick((DewasaField()));
    }
    @Step
    public void inputDewasa (String dewasa) {
        onType(DewasaField(), dewasa);
    }
    @Step
    public void clickAnakAnakField () {
        onClick(AnakAnakField());
    }
    @Step
    public void inputAnakAnak (String anakanak) {
        onType(AnakAnakField(),anakanak);
    }
    @Step
    public void clickJenisKA () {
        onClick((JenisKAField()));
    }
    @Step
    public void clickSemuaJenisKA () {
        onClick((JenisKASEMUAField()));
    }
    @Step
    public void clickCariJenisKA () {
        onClick((CariOrderKABT()));
    }
    @Step
    public void clickMatarmajaKA () {
        onClick((MatarmajaKABT()));
    }
    @Step
    public void clickDetailPemesananKA () {
        onClick((DetailPemesananKABT()));
    }
    @Step
    public void clickNamaLengkapDPemesananKAField () {
        onClick((NamaLengkapDPemesananKAField()));
    }
    @Step
    public void inputNamaLengkapDPemesanKA (String namalengkapdpemesananka) {
        onType(NamaLengkapDPemesananKAField(), namalengkapdpemesananka);
    }
    @Step
    public void clickNomorTeleponDPKAField () {
        onClick((NomorTeleponDPKAField()));
    }
    @Step
    public void inputNomorTeleponDPKA (String nomortelepondpka) {

        onType(NomorTeleponDPKAField(), nomortelepondpka);
        driver.getAndroidDriver().hideKeyboard();
    }
    @Step
    public void clickEmailDPKAField () {
        onClick((EmailPemesananDPKAField()));
    }
    @Step
    public void inputEmailDPKA (String emaildpka) {
        onType(EmailPemesananDPKAField(), emaildpka);
        driver.getAndroidDriver().hideKeyboard();
    }
    @Step
    public void clickTambahkanSebagaiPenumpangBT () {
        onClick((TambahkanSebagaiPenumpangBT()));
    }
    @Step
    public void clickDetailPenumpangBT () {
        onClick((DetailPenumpangKABT()));
    }
    @Step
    public void clickTuanNyonyaDPKAField () {
        onClick((TuanNyonyaDPKAField()));
    }
    @Step
    public void clickTuanDPKA () {
        onClick((TuanDPKA()));
    }
    @Step
    public void clickNyonyaDPKA () {
        onClick((NyonyaDPKA()));
    }
    @Step
    public void clickNomorIdentitas () {
        onClick((NomorIdentitasDPKAField()));
    }
    @Step
    public void inputNomorIdentitasDPKA (String nomoridentitasdpka) {
        onType(NomorIdentitasDPKAField(), nomoridentitasdpka);
        driver.getAndroidDriver().hideKeyboard();
    }
    @Step
    public void clickNamaLengkapDPenumpangKA () {
        onClick((NamaLengkapDPenumpangKAField()));
    }
    @Step
    public void inputNamaLengkaDPenumpangKA (String namalengkapdpenumpangka) {
        onType(NamaLengkapDPenumpangKAField(), namalengkapdpenumpangka);
    }
    @Step
    public void clickPilihKursiDPKA () {
        onClick((PilihKursiDPKA()));
    }
    @Step
    public void clickPilihKursi1DPKA () {
        onClick((PilihLokasiKursi1DPKA()));
    }
    @Step
    public void clickKonfirmasiPilihKursiDPKA () {
        onClick((KonfirmasiPilihLokasiKursi1DPKA()));
        driver.getAndroidDriver().hideKeyboard();
    }
    @Step
    public void clickKonfirmasiDPKA () {
        driver.getAndroidDriver().hideKeyboard();
        onClick((KonfirmasiDPKA()));
    }
    @Step
    public void clickKonfirmasiYADPKA () {
        onClick((AlertKonfirmasiYADPKA()));
    }
    @Step
    public void validateOnPembayaranScreenDPKA () {
        waitUntilVisible((PembayaranDPKAScreen()));
    }
    @Step
    public void clickVirtualACCDPKA () {
        onClick((PembayaranVirtualACCDPKA()));
    }
    @Step
    public void clickBCADPKA () {
        onClick((PembayaranVABCADPKA()));
    }
    @Step
    public void clickLanjutBayarDPKA () {
        onClick((LanjutBayarDPKABT()));
    }
    @Step
    public void clickBayarDPKA () {
        onClick((BayarDPKABT()));
    }
    @Step
    public void validateStatusPembayaranDPKA () {
        waitUntilVisible((ValidateBerhasiBayarDPKA()));
    }
    @Step
    public void validateFakturStatusPembayaranDPKA () {
        waitUntilVisible((ValidateFakturBerhasiBayarDPKA()));
    }
    @Step
    public void clickCekPesananDPKA () {
        onClick((CekPesananBerhasilDPKABT()));
    }
    @Step
    public void validateAlertFillDPemesananKA () {
        waitUntilVisible((ValidateAlertFillDetailPemesanan()));}
    @Step
    public void validateAlertFillDPenumpangKA () {
        waitUntilVisible((ValidateAlertFillDetailPenumpang()));}
    @Step
    public void validateAlertPilihKursiKA () {
        waitUntilVisible((ValidateAlertPilihKursi()));}
}

