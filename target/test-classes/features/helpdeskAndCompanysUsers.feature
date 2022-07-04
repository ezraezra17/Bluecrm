Feature:Company structure feature
  User Story: I should be able to use functions on Company Structure under Employee menu.


  Scenario: Helpdesk and marketing users can not change company structure.
    Given user is on the login page of Bluecrm app
    When user enters username "marketing1@cybertekschool.com"
    And user enters password "UserUser"
    And user hits to login button
    And user clicks on the employee tab below Activity stream
    Then user cannot observe "add department" feature on company structure.

  @wip
  Scenario: Helpdesk and marketing users can not change company structure.
    Given user is on the login page of Bluecrm app
    When user enters username "helpdesk2@cybertekschool.com "
    And user enters password "UserUser"
    And user hits to login button
    And user clicks on the employee tab below Activity stream
    Then user cannot observe "add department" feature on company structure.





