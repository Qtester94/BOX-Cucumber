Feature: Search feature

  Scenario Outline: Search for non-existing file
    Given User navigates to login page
    When User enters valid <username> and <password>
    And Click on the login button
    And Enter part of the non-existing file name
    Then There is no search result

    Examples: 
      | username                | password                         |
      | qtester94+Bob@gmail.com | uE9pEieVNs289u45J+1qGHh+mnHPFkWy |

  Scenario Outline: Search for existing file
    Given User navigates to login page
    When User enters valid <username> and <password>
    And Click on the login button
    And Enter part of the existing file name
    Then There is a search result

    Examples: 
      | username                | password                         |
      | qtester94+Bob@gmail.com | uE9pEieVNs289u45J+1qGHh+mnHPFkWy |
