@orderhotel
Feature: As a user i have be able to order hotel so that i can see my order

  @orderhotelvalid
  Scenario: As a user i order hotel and see my order
    Given user on welcome screen page OH
    When user skip Welcome Screen and go to login page OH
    And user input valid email OH
    And user input valid password OH
    And user click masuk button OH
    Then user can login and go to home page OH
    And user click order hotel OH
    And user input pencarian pemesanan OH
    And user choose hotel and room OH
    And user input detail pemesanan OH
    And user choose voucher OH
    And user choose payment hotel OH
    When user pay the order hotel and get success message
    Then user get the factur of they order

