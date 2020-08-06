@login
Feature: Login
  Bitrix:  User should be able to login with valid credentials
  Background: User should be able on the login page
    Given User is on the login page

  Scenario: Login with valid credentials
    When User enters valid "helpdesk5@cybertekschool.com" and valid "UserUser"
    Then User should be able to see dashboard