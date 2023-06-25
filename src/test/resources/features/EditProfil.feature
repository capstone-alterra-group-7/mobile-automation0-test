@editprofile
Feature: As a user i have be able to edit profile so that i can see the result

  @editusernameprofilefail
  Scenario: As a user i can edit username and get alert to fill the birthdate
    Given user on welcome screen page to try edit profile
    When user skip Welcome Screen and go to login page to try edit profile
    And user input valid email to try edit profile
    And user input valid password to try edit profile
    And user click masuk button to try edit profile
    Then user can login and direct home page to try edit profile
    And user click profil to try edit profile
    And user click edit profile to try edit profile
    And user input new username to try edit profile
    Then user click save edit profile and get alert "Tanggal Lahir tidak boleh kosong" to fill the birthdate

  @editusernameandbirthdateprofile
  Scenario: As a user i can edit birthdate
    Given user on welcome screen page to try edit profile2
    When user skip Welcome Screen and go to login page to try edit profile2
    And user input valid email to try edit profile2
    And user input valid password to try edit profile2
    And user click masuk button to try edit profile2
    Then user can login and direct home page to try edit profile2
    And user click profil to try edit profile2
    And user click edit profile to try edit profile2
    And user input new username to try edit profile2
    And user input new birthdate to try edit profile2
    Then user click save edit profile and back to profile screen to try edit profile2

  @editusernameandbirthdateprofile2
  Scenario: As a user i can edit birthdate is later than today
    Given user on welcome screen page to try edit profile3
    When user skip Welcome Screen and go to login page to try edit profile3
    And user input valid email to try edit profile3
    And user input valid password to try edit profile3
    And user click masuk button to try edit profile3
    Then user can login and direct home page to try edit profile3
    And user click profil to try edit profile3
    And user click edit profile to try edit profile3
    And user input new birthdate is later than today to try edit profile3
    Then user cant click save edit profile and get alert to check the birthdate to try edit profile3