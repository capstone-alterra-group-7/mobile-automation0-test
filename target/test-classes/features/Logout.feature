@logout
Feature: As a user i have be able to login so that i can logout that account

  @logoutsuccess
  Scenario: As a user i can logout
    Given user on welcome screen page to try logout
    When user skip Welcome Screen and go to login page to try logout
    And user input valid email to try logout
    And user input valid password to try logout
    And user click masuk button to try logout
    Then user can login and direct home page to try logout
    And user click profil to try logout
    And user click keluar to try logout
    And user click ya untuk keluar to try logout
    Then user has logout and back to login screen to try logout

  @logoutfailbecauseclicktidak
  Scenario: As a user i can logout, but click "tidak" and back to profil page
    Given user on welcome screen page to try logout2
    When user skip Welcome Screen and go to login page to try logout2
    And user input valid email to try logout2
    And user input valid password to try logout2
    And user click masuk button to try logout2
    Then user can login and direct home page to try logout2
    And user click profil to try logout2
    And user click keluar to try logout2
    And user click tidak untuk keluar to try logout2
    Then user has not logout and back to profil page to try logout2

  @logoutfailbecauseclickback
  Scenario: As a user i can logout, but clickback and back to profil page
    Given user on welcome screen page to try logout3
    When user skip Welcome Screen and go to login page to try logout3
    And user input valid email to try logout3
    And user input valid password to try logout3
    And user click masuk button to try logout3
    Then user can login and direct home page to try logout3
    And user click profil to try logout3
    And user click keluar to try logout3
    And user click back to try logout3
    Then user has not logout and back to profil page to try logout3