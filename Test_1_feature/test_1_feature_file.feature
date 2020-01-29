Feature: Login Action

Scenario Outline: Successful Login with Valid Credentials
 Given  user is on Home Page
 When User Navigate to LogIn Page
 And User enters "<username>" and  "<password>"
Then  Message displayed Login Successful

Examples:
| username  |password  |
| lalitha   |password123|
| admin     |password456|