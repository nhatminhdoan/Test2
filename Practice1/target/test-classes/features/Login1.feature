Feature: Test login functionality

  Scenario Outline: Check login is successful with valid crendential
    Given browser is open
    And user is on login page
    When user enters <username> and <password>
    And user clicks on logins
    Then user is navigated to the home page

    Examples: 
      | username          | password |
      | doanquangnhatminh |    12345 |
      | bao               |    12345 |
