Feature: User should be able to login using correct credentials

  Scenario: Positive login scenario
    Given user is on the login page of Bluecrm app
    When user enters username "helpdesk2@cybertekschool.com"
    And user enters password "UserUser"
    And user hits to login button
    Then user should see url contains "bleucrm"