Feature: As an user, i can see splashscreen so that i can see login page

  @UbahKataSandi
  Scenario: As an user, i want to input valid email and valid password so that i can success login
    Given user on welcome screen page
    When user skip Welcome Screen and go to login page
    And user on the login page
    And user click on email field
    And user input "newuser2@gmail.com" on email field
    And user click on password field
    And user input "newuser2" on password field
    And user click login button
    And user see home page
    And user click menu Profile
    And user click menu Ubah Kata Sandi
    And user input Kata Sandi Lama
    And user input Kata Sandi Baru
    And user input Konfirmasi Kata Sandi Baru
    And click button Selanjutnya
    Then user berhasil mengubah kata sandi
