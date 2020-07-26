@addEmailToMessage
Feature: User should able to add a email to messages

  Scenario: User should be able to add users from selecting contact from E-mail user, Employees and Departments and Recent contact lists.

    Given user should able to log in the app and click to message module
    When user click the Add mentions icon
    And user should be select employees and department
    And user should click given email
    Then user see selected email on the To container