Feature: Upload File

  Scenario Outline: Upload File
    Given User navigates to login page
    When User enters valid <username> and <password>
    And Click on the login button
    And Click on the New button
    And Click File upload
    And Select valid file
    Then File is uploaded

    Examples: 
      | username                | password                         |
      | qtester94+Bob@gmail.com | uE9pEieVNs289u45J+1qGHh+mnHPFkWy |
