Feature: NextBase login steps
  Agile story: User should be able to login NextBase.

  Background: User is on the login page
    Given User is on the nextBase login page


  Scenario Outline: Users use credentials and login
    When user enter "<Username>" and "<password>"
    And user clicks to login button
    Then User should see dashboard

    Examples:
      | Username                       | password |
      | helpdesk35@cybertekschool.com  | UserUser |
      | helpdesk36@cybertekschool.com  | UserUser |
      | marketing35@cybertekschool.com | UserUser |
      | marketing36@cybertekschool.com | UserUser |
      | hr35@cybertekschool.com        | UserUser |
      | hr36@cybertekschool.com        | UserUser |

