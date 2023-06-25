@login
Feature: As a user i have be able to login so that i can see home screen

  @loginWithValidData
  Scenario: As a user i can login
    Given user on welcome screen page
    When user skip Welcome Screen and go to login page
    And user input valid email
    And user input valid password
    And user click masuk button
    Then user can login and go to home page

  @loginWithInvalidEmail
  Scenario: As a user i cant login because invalid email
    Given user on welcome screen page2
    When user skip Welcome Screen and go to login page2
    And user input invalid email2
    And user input valid password2
    And user cant click login, and get warning screen2
    Then user stay on login screen2

  @loginwithinvalidpassword
  Scenario: As a user i cant login because invalid password
    Given user on welcome screen page3
    When user skip Welcome Screen and go to login page3
    And user input valid email3
    And user input invalid password3
    And user cant click login, and get warning screen3
    Then user stay on login screen3

  @loginwithblankemail
  Scenario: As a user i cant login because input blank email
    Given user on welcome screen page4
    When user skip Welcome Screen and go to login page4
    And user input blank email4
    And user input valid password4
    And user cant click login, and get warning screen "Email tidak boleh kosong"
    Then user stay on login screen4

  @loginwithblankpassword
  Scenario: As a user i cant login because input blank password
    Given user on welcome screen page5
    When user skip Welcome Screen and go to login page5
    And user input valid email5
    And user input blank password5
    And user cant click login, and get warning screen "Tolong masukkan kata sandi"
    Then user stay on login screen5