@product
Feature: As a user i have be able to login so that i can see home screen

  @seeallproduct
  Scenario: As a user i can login
    Given user go on home page
    When user can click account info
    When user can input valid email
    And user can input valid password
    And user can click login button
    Then user back to home page andd see all product

  @addcart
  Scenario: As a user i can login
    Given user go on home page
    When user can click account info
    When user can input valid email
    And user can input valid password
    And user can click login button
    Then user back to home page andd see all product
    Then user can choose the product and add to cart


#  @loginwithoutemail
#  Scenario: As a user i cant login because i input invalid email
#    Given user on home page1
#    When user click account info1
#    When user input invalid email1
#    And user input valid password1
#    And user click login button1
#    Then user cant login and see error message login1
#
#  @loginwithoutpassword
#  Scenario: As a user i cant login because i input invalid password
#    Given user on home page2
#    When user click account info2
#    When user input valid email2
#    And user input invalid password2
#    And user click login button2
#    Then user cant login and see error message login2
#
#  @loginwithoutemailandpassword
#  Scenario: As a user i cant login because i input invalid email and password
#    Given user on home page3
#    When user click account info3
#    When user input invalid email3
#    And user input invalid password3
#    And user click login button3
#    Then user cant login and see error message login3