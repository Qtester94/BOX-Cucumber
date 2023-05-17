Feature: Log out feature

Scenario Outline: Log out

 Given User navigates to login page
 When User enters valid <username> and <password>
    And Click on the login button
    And Click on the profile button
    And Click on the Log Out button
    Then The user is logged out
 
     Examples: 
      | username                | password                         |
      | qtester94+Bob@gmail.com | uE9pEieVNs289u45J+1qGHh+mnHPFkWy |