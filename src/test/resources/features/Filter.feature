@filter
Feature: Filter and Search
  Agile story:



  Scenario: As a user, I should be able to use "Filter
  and search" functionality on Active Stream.
    Given User is on the Bitrix landing page
    When User clicks on Filter module and enters hr35@cybertekschool.com
    And User enters Search
    Then User should see all posts by hr35@cybertekschool.com on the Activity Stream

