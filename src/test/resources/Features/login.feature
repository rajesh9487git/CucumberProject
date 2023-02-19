Feature: login functonality test

Scenario Outline: Check login with valid credentials
  Given borwser is open
  And user is on login page
  When user enters valid "<username>" and "<password>"
  And clicks on login button
  Then user is navigated to the home page

  Examples:
  |username|password|
  |Raghav  |12345   |
#  |Ele     | 12345  |


