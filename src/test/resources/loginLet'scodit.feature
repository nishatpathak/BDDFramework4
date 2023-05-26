@ntp2
Feature: login to my account:
  As a user
  I want to add login functionality
  So that customer can use it

  Scenario: Validating the correct credential let me login to my account.
    Given I an on homepage
    When I click on login btn on let's codeit home page
    And I enter valid username
    And I enter valid password
    And I click on login btn
    Then the text "My Courses"
