package starter.screens;

import io.appium.java_client.AppiumBy;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import test.automation.pageobject.BasePageObject;

public class OrderHotelScreen extends BasePageObject {

    private By Kerangka() {
        return AppiumBy.xpath("/hierarchy/android.widget.FrameLayout");
    }

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

    //////////////////////////////////////////=============ORDER Hotel======================//////////////////////////////
    private By OrderHotelBT() {
        return AppiumBy.xpath("//android.view.View[@content-desc=\"Hotel\"]");
    }
    private By TanggalDHotelBT() {
        return AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[3]");
    }
    private By Tanggal29DHotelBT() {
        return AppiumBy.xpath("//android.view.View[@content-desc=\"Kamis, 29 Juni 2023\"]");
    }
    private By Tanggal30DHotelBT() {
        return AppiumBy.xpath("//android.view.View[@content-desc=\"Jumat, 30 Juni 2023\"]");
    }
    private By JumlahKamarDHotelBT() {
        return AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[1]");
    }
    private By DewasaDHotelBT() {
        return AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[2]");
    }
    private By AnakAnakDHotelBT() {
        return AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[3]");
    }
    private By CariDHotelBT() {
        return AppiumBy.xpath("//android.widget.Button[@content-desc=\"Cari\"]");
    }
    private By Hotel1BT() {
        return AppiumBy.xpath("//android.widget.ImageView[@content-desc=\"Tes FE\n" +
                "jl tembok ijo no 9\n" +
                " Rp443.321,00\"]");
    }
    private By Kamar1HotelBT() {
        return AppiumBy.xpath("//android.view.View[@content-desc=\"tes\n" +
                "Rp443.321,00/malam\n" +
                "4\n" +
                "1 Queen Bed\n" +
                "No Breakfast\n" +
                "Refundable\n" +
                "No Wifi\n" +
                "Dilarang Merokok\"]");
    }
    private By PilihKamarHotelBT() {
        return AppiumBy.xpath("//android.widget.Button[@content-desc=\"Pilih\"]");
    }
    private By DetailPelangganHotelBT() {
        return AppiumBy.xpath("//android.view.View[@content-desc=\"Detail Pelanggan\"]");
    }
    private By DetailPemesanHotelBT() {
        return AppiumBy.xpath("//android.view.View[@content-desc=\"Detail Pemesan\"]");
    }
    private By NamaPemesanHotelBT() {
        return AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[1]");
    }
    private By NomorTelpPemesanHotelBT() {
        return AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[2]");
    }
    private By EmailPemesanHotelBT() {
        return AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[3]");
    }
    private By TambahkanSebagaiTamuHotelBT() {
        return AppiumBy.xpath("//android.widget.Button[@content-desc=\"Tambahkan sebagai Tamu\"]");
    }
    private By PelangganTNNYHotelBT() {
        return AppiumBy.xpath("//android.view.View[@content-desc=\"Pelanggan 1\n" +
                "Nomor Identitas\n" +
                "Nama Lengkap\"]/android.widget.Button");
    }
    private By PelangganTuanHotelBT() {
        return AppiumBy.xpath("//android.view.View[@content-desc=\"Tuan\"]");
    }
    private By NoIdentitasHotelBT() {
        return AppiumBy.xpath("//android.view.View[@content-desc=\"Pelanggan 1\n" +
                "Nomor Identitas\n" +
                "Nama Lengkap\"]/android.widget.EditText[1]");
    }
    private By NamaLengkapPelangganHotelBT() {
        return AppiumBy.xpath("//android.view.View[@content-desc=\"Pelanggan 1\n" +
                "Nomor Identitas\n" +
                "Nama Lengkap\"]/android.widget.EditText[2]");
    }
    private By PermintaanKhususHotelBT() {
        return AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText");
    }
    private By KonfirmasiDetailPPotelBT() {
        return AppiumBy.xpath("//android.widget.Button[@content-desc=\"Konfirmasi\"]");
    }
    private By KonfirmasiYADetailPPotelBT() {
        return AppiumBy.xpath("//android.widget.Button[@content-desc=\"Ya\"]");
    }
    private By KonfirmasiTIDAKDetailPPotelBT() {
        return AppiumBy.xpath("//android.widget.Button[@content-desc=\"Tidak\"]");
    }
    private By VoucherHotelBT() {
        return AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText");
    } private By TambahkanVoucherotelBT() {
        return AppiumBy.xpath("//android.widget.Button[@content-desc=\"Tambahkan\"]");
    }
    private By VACCHotelBT() {
        return AppiumBy.xpath("//android.widget.ImageView[@content-desc=\"Virtual Account\"]");

    }
    private By VACCCLICKBT() {
        return AppiumBy.xpath("//android.widget.ImageView[@content-desc=\"Virtual Account\"]/android.widget.RadioButton");
    }
    private By BCABT() {
        return AppiumBy.xpath("//android.widget.ImageView[@content-desc=\"Bank Central Asia\"]");
    }
    private By LanjutBayarBT() {
        return AppiumBy.xpath("//android.widget.Button[@content-desc=\"Lanjut\"]");
    }
    private By BayarHotelBT() {
        return AppiumBy.xpath("//android.widget.Button[@content-desc=\"Bayar\"]");
    }
    private By PembayaranHotelBerhasil() {
        return AppiumBy.xpath("//android.view.View[@content-desc=\"Pembayaran Berhasil!\"]");
    }
    private By FakturPembayaranBerhasil() {
        return AppiumBy.xpath("//android.view.View[@content-desc=\"Faktur\"]");
    }
    private By CekPesananBerhasil() {
        return AppiumBy.xpath("//android.widget.Button[@content-desc=\"Cek Pesanan\"]");
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
        driver.getAndroidDriver().hideKeyboard();
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
    public void validateKerangka () {
        waitUntilVisible((Kerangka()));}

    //////////////////////////////////////////=============Function HOTEL======================//////////////////////////////
    @Step
    public void clickHotelBT () {
        onClick(OrderHotelBT());
    }
    @Step
    public void clickTanggal29PemesananHBT () {
        onClick(Tanggal29DHotelBT());
    }
    @Step
    public void clickTanggal30PemesananHBT () {
        onClick(Tanggal30DHotelBT());
    }
    @Step
    public void clickJumlahKamarPemesananHBT () {
        onClick(JumlahKamarDHotelBT());
    }
    @Step
    public void clickDewasaPemesananHBT () {
        onClick(DewasaDHotelBT());
    }
    @Step
    public void clickTanggalPemesananHBT () {
        onClick(TanggalDHotelBT());
    }
    @Step
    public void clickAnakAnakPemesananHBT () {
        onClick(AnakAnakDHotelBT());
    }
    @Step
    public void clickCariPemesananHBT () {
        onClick(CariDHotelBT());
    }
    @Step
    public void clickHotel1BT () {
        onClick(Hotel1BT());
    }
    @Step
    public void clickKamarBT () {
        onClick(Kamar1HotelBT());
    }
    @Step
    public void clickPilihKamar1BT () {
        onClick(PilihKamarHotelBT());
    }
    @Step
    public void clickDPelangganBT () {
        onClick(DetailPelangganHotelBT());
    }
    @Step
    public void clickDPemesananBT () {
        onClick(DetailPemesanHotelBT());
    }
    @Step
    public void clickNamaPemesananBT () {
        onClick(NamaPemesanHotelBT());
    }

    @Step
    public void inputNamaPemesanan (String namapemesan) {
        onType(NamaPemesanHotelBT(),namapemesan);
    }
    @Step
    public void clickNoTelpPemesananBT () {
        onClick(NomorTelpPemesanHotelBT());
    }

    @Step
    public void inputNoTelpPemesanan (String notelppemesan) {
        onType(NomorTelpPemesanHotelBT(), notelppemesan);
    }
    @Step
    public void clickTambahSebagaiTamu () {
        onClick(TambahkanSebagaiTamuHotelBT());
    }
    @Step
    public void clickTuanNyonyaBT () {
        onClick(PelangganTNNYHotelBT());
    }
    @Step
    public void clickTuanBT () {
        onClick(PelangganTuanHotelBT());
    }
    @Step
    public void clickNoIdentitasBT () {
        onClick(NoIdentitasHotelBT());
    }
    @Step
    public void inputNoIdentitas (String noidentitas) {
        onType(NoIdentitasHotelBT(), noidentitas);
    }
    @Step
    public void clickNamaPelangganBT () {
        onClick(NamaLengkapPelangganHotelBT());
    }
    @Step
    public void inputNamaPelanggan (String namapelanggan) {
        onType(NamaLengkapPelangganHotelBT(), namapelanggan);
    }
    @Step
    public void clickPermintaanKhusus () {
        onClick(PermintaanKhususHotelBT());
    }
    @Step
    public void inputPermintaanKhusus (String permintaankhusus) {
        onType(PermintaanKhususHotelBT(), permintaankhusus);
    }
    @Step
    public void clickKonfirmasiPemesanan () {
        onClick(KonfirmasiDetailPPotelBT());
    }
    @Step
    public void clickYAKonfirmasiPemesanan () {
        onClick(KonfirmasiYADetailPPotelBT());
    }
    @Step
    public void clickTIDAKKonfirmasiPemesanan () {
        onClick(KonfirmasiTIDAKDetailPPotelBT());
    }
    @Step
    public void clickVoucher () {
        onClick(VoucherHotelBT());
    }
    @Step
    public void inputVoucher (String voucher) {
        onType(VoucherHotelBT(), voucher);
    }
    @Step
    public void clickVACCTAP () {
        onClick(VACCCLICKBT());
    }
    @Step
    public void clickVACC () {
        onClick(VACCHotelBT());
    }
    @Step
    public void clickBCA () {
        onClick(BCABT());
    }
    @Step
    public void clickLanjutBayarHotel () {
        onClick(LanjutBayarBT());
    }
    @Step
    public void BayarHotel () {
        onClick(BayarHotelBT());
    }
    @Step
    public void CekPesanan () {
        onClick(CekPesananBerhasil());
    }
    @Step
    public void TambahKanVoucher () {
        onClick(TambahkanVoucherotelBT());
    }
    @Step
    public void validatePembayaranBerhasil () {
        waitUntilVisible(PembayaranHotelBerhasil());
    }
    @Step
    public void validateFakturPembayaranBerhasil () {
        waitUntilVisible(FakturPembayaranBerhasil());
    }
}

