@orderka
Feature: As a user i have be able to order ka so that i can see my order

  @orderkavalid
  Scenario: As a user i order ka and see my order
    Given user on welcome screen page OKA
    When user skip Welcome Screen and go to login page OKA
    And user input valid email OKA
    And user input valid password OKA
    And user click masuk button OKA
    Then user can login and go to home page OKA
    And user click order ka OKA
    And user input stasiun asal OKA
    And user input stasiun tujuan OKA
    And user input tanggal keberangkatan OKA
    And user choose dewasa OKA
    And user choose anak anak OKA
    And user choose jenis ka and click cari ka OKA
    When user choose matarmajaKA and click matarmajaKA OKA
    And user input detail pemesanan OKA
    And user input detail penumpang OKA
    And user pilih kursi OKA
    And user click konfirmasi dpka OKA
    And user choose pembayaran OKA
    And user Bayar order ka OKA
    And user get the faktur of order ka OKA
    Then user can check they order and back to home page OKA

  @orderkawithoutpay
  Scenario: As a user i order ka but i am not pay it
    Given user on welcome screen page OKA2
    When user skip Welcome Screen and go to login page OKA2
    And user input valid email OKA2
    And user input valid password OKA2
    And user click masuk button OKA2
    Then user can login and go to home page OKA2
    And user click order ka OKA2
    And user input stasiun asal OKA2
    And user input stasiun tujuan OKA2
    And user input tanggal keberangkatan OKA2
    And user choose dewasa OKA2
    And user choose anak anak OKA2
    And user choose jenis ka and click cari ka OKA2
    When user choose matarmajaKA and click matarmajaKA OKA2
    And user input detail pemesanan OKA2
    And user input detail penumpang OKA2
    And user pilih kursi OKA2
    And user click konfirmasi dpka OKA2
    And user choose pembayaran OKA2
    And user is not pay the order
    Then user stay on pembayaran screen

  @orderkawithblankdetailpemesanan
  Scenario: As a user i order ka without detail pemesan data
    Given user on welcome screen page OKA3
    When user skip Welcome Screen and go to login page OKA3
    And user input valid email OKA3
    And user input valid password OKA3
    And user click masuk button OKA3
    Then user can login and go to home page OKA3
    And user click order ka OKA3
    And user input stasiun asal OKA3
    And user input stasiun tujuan OKA3
    And user input tanggal keberangkatan OKA3
    And user choose dewasa OKA3
    And user choose anak anak OKA3
    And user choose jenis ka and click cari ka OKA3
    When user choose matarmajaKA and click matarmajaKA OKA3
    And user input blank detail pemesanan OKA3
    And user input detail penumpang OKA3
    And user pilih kursi OKA3
    And user click konfirmasi dpka OKA3
    Then user cant pay and get alert to fill detail pemesanan OKA3

  @orderkawithblankdetailpenumpang
  Scenario: As a user i order ka without detail penumpang data
    Given user on welcome screen page OKA4
    When user skip Welcome Screen and go to login page OKA4
    And user input valid email OKA4
    And user input valid password OKA4
    And user click masuk button OKA4
    Then user can login and go to home page OKA4
    And user click order ka OKA4
    And user input stasiun asal OKA4
    And user input stasiun tujuan OKA4
    And user input tanggal keberangkatan OKA4
    And user choose dewasa OKA4
    And user choose anak anak OKA4
    And user choose jenis ka and click cari ka OKA4
    When user choose matarmajaKA and click matarmajaKA OKA4
    And user input detail pemesanan OKA4
    And user input blank detail penumpang OKA4
    And user pilih kursi OKA4
    And user click konfirmasi dpka OKA4
    Then user cant pay and get alert to fill detail penumpang OKA4

  @orderkawithblankkursi
  Scenario: As a user i order ka without choose seat
    Given user on welcome screen page OKA5
    When user skip Welcome Screen and go to login page OKA5
    And user input valid email OKA5
    And user input valid password OKA5
    And user click masuk button OKA5
    Then user can login and go to home page OKA5
    And user click order ka OKA5
    And user input stasiun asal OKA5
    And user input stasiun tujuan OKA5
    And user input tanggal keberangkatan OKA5
    And user choose dewasa OKA5
    And user choose anak anak OKA5
    And user choose jenis ka and click cari ka OKA5
    When user choose matarmajaKA and click matarmajaKA OKA5
    And user input detail pemesanan OKA5
    And user input detail penumpang OKA5
    And user click konfirmasi dpka OKA5
    Then user cant pay and get alert to choose seat of OKA5