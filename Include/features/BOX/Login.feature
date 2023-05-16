Feature: Login feature

  Scenario Outline: Test Login with valid credentials
    Given User navigates to login page
    When User enters valid <username> and <password>
    And Click on the login button
    Then User is navigated to the home page

    Examples: 
      | username                | password                         |
      | qtester94+Bob@gmail.com | uE9pEieVNs289u45J+1qGHh+mnHPFkWy |

  Scenario Outline: Test Login with invalid username
    Given User navigates to login page
    When User enters invalid <iusername> username and valid <password>
    And Click on the login button
    Then The user is not logged in

    Examples: 
      | password                         | iusername                 |
      | uE9pEieVNs289u45J+1qGHh+mnHPFkWy | qtester94+Tedyb@gmail.com |

  Scenario Outline: Test Login with invalid password
    Given User navigates to login page
    When User enters invalid <ipassword> password and valid <username>
    And Click on the login button
    Then The user is not logged in

    Examples: 
      | username                | ipassword    |
      | qtester94+Bob@gmail.com | bxUBWd2ASFw= |
