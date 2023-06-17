@register
Feature: As a user i have be able to create a new account so that i can login with a new account

  @registerwithvaliddata
  Scenario: As a user i can register a new account
    Given user on welcome screen page to register
    When user skip Welcome Screen and direct login page to register
    And user click register button
    Then user on register screen page
    And user input username to register
    And user input email to register
    And user input notelp to register
    And user input password to register
    And user input confirm password to register
    And user click daftar button to register
    Then user has succesfully registered and go back to login screen

  @registerwithblankusername
  Scenario: As a user i cant register a new account with blank username
    Given user on welcome screen page to register2
    When user skip Welcome Screen and direct login page to register2
    And user click register button2
    Then user on register screen page2
    And user input blank username to register2
    And user input email to register2
    And user input notelp to register2
    And user input password to register2
    And user input confirm password to register2
    And user click daftar button to register2
    Then user has not succesfully registered and go back to register screen2

  @registerwithblankemail
  Scenario: As a user i cant register a new account with blank email
    Given user on welcome screen page to register3
    When user skip Welcome Screen and direct login page to register3
    And user click register button3
    Then user on register screen page3
    And user input username to register3
    And user input blank email to register3
    And user input notelp to register3
    And user input password to register3
    And user input confirm password to register3
    And user click daftar button to register3
    Then user has not succesfully registered and go back to register screen3

  @registerwithblanknotelp
  Scenario: As a user i cant register a new account with blank notelp
    Given user on welcome screen page to register4
    When user skip Welcome Screen and direct login page to register4
    And user click register button4
    Then user on register screen page4
    And user input username to register4
    And user input email to register4
    And user input blank notelp to register4
    And user input password to register4
    And user input confirm password to register4
    And user click daftar button to register4
    Then user has not succesfully registered and go back to register screen4

  @registerwithblankpassword
  Scenario: As a user i cant register a new account with blank password
    Given user on welcome screen page to register5
    When user skip Welcome Screen and direct login page to register5
    And user click register button5
    Then user on register screen page5
    And user input username to register5
    And user input email to register5
    And user input notelp to register5
    And user input blank password to register5
    And user input confirm password to register5
    And user click daftar button to register5
    Then user has not succesfully registered and go back to register screen5

  @registerwithblankconfirmpassword
  Scenario: As a user i cant register a new account with blank confirm password
    Given user on welcome screen page to register6
    When user skip Welcome Screen and direct login page to register6
    And user click register button6
    Then user on register screen page6
    And user input username to register6
    And user input email to register6
    And user input notelp to register6
    And user input password to register6
    And user input blank confirm password to register6
    And user click daftar button to register6
    Then user has not succesfully registered and go back to register screen6