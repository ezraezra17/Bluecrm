Feature:Company structure feature
  User Story: I should be able to use functions on Company Structure under Employee menu.


  Background:
    Given user is on the login page of Bluecrm app
    When user enters username "hr3@cybertekschool.com"
    And user enters password "UserUser"
    Then user hits to login button
#//div[@id='Single_T1qHzC_search']

  Scenario:All user types should be able to display company structure
    Given user should be displaying the employee link below the Activity Stream
    And user clicks on the employee tab below Activity stream
    Then user should be displaying the company structure

  Scenario:Hr user should be able to add a department from the company structure.
    Given user clicks on the employee tab below Activity stream
    When  user clicks on the "add department"
    And user should observe the "add department" title from the popped up table.


   #LUEC-185
  Scenario:Hr user should be able to add a parent department from the company structure.
    Given user clicks on the employee tab below Activity stream
    When user clicks on the "add department"
    And user selects a parent  department from the department dropdown.
    And user clicks add button
    Then user observe popped up error message

#LUEC-216


  Scenario:Hr user should be able to select a supervisor from "recent", "company" and "search"
    Given user clicks on the employee tab below Activity stream
    When user clicks on the "add department"
    And user clicks select from structure
    And  user should display the Search button and hits the search button
    And Type any random letter or word in to above input box to search for the supervisor
    Then user selects an option from the select list


  Scenario:Hr user should be able to select a supervisor from "recent", "company" and "search"
    Given user clicks on the employee tab below Activity stream
    When user clicks on the "add department"
    And user clicks select from structure
    And user should display the "recent" button
    Then user selects an option from the list


  Scenario:Hr user should be able to select a supervisor from "recent", "company" and "search"
    Given user clicks on the employee tab below Activity stream
    When user clicks on the "add department"
    And user clicks select from structure
    And user should display the company button and clicks the button
    Then user selects an option from the company list and display the option


  @wip
  Scenario:Hr user should be able to close add department pop-up at any time before sending.
    Given user clicks on the employee tab below Activity stream
    When user clicks on the "add department"
    And user hits the close button any time before sending


   # failed
  Scenario:Hr user should be able to close add department pop-up at any time before sending.
    Given user clicks on the employee tab below Activity stream
    When user clicks on the "add department"
    And user should be  filling each input box before sending it
    Then user hits the close button any time before sending



  Scenario:Hr user should be able to edit departments, add child departments, and delete departments after adding the department.
    Given user clicks on the employee tab below Activity stream
    When The "add child department" icon should be clickable and once clicked, it should bring out the "add department" input box on display.
    And Once Hr User clicks on the "Delete department" button, the user should display the pop-up message.
    Then Hr user should accepts the warning message and click "ok" and delete the added child department.









