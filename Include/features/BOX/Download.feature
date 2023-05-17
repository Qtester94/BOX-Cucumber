Feature: Download feature

Scenario Outline: File preview window opens
    Given User navigates to login page
    When User enters valid <username> and <password>
    And Click on the login button
    And Click on the Get Started with Box PDF
    Then The file preview window open
  
    Examples: 
      | username                | password                         |
      | qtester94+Bob@gmail.com | uE9pEieVNs289u45J+1qGHh+mnHPFkWy |

     

  Scenario Outline: Download File from preview window
    Given User navigates to login page
    When User enters valid <username> and <password>
    And Click on the login button
    And Click on the Get Started with Box PDF
    And Click on the Download button
    Then The file is downloaded

    Examples: 
      | username                | password                         |
      | qtester94+Bob@gmail.com | uE9pEieVNs289u45J+1qGHh+mnHPFkWy |


  Scenario Outline: Close the file preview window
    Given User navigates to login page
    When User enters valid <username> and <password>
    And Click on the login button
    And Click on the Get Started with Box PDF
    And Click on the close Preview button
    Then User is navigated to the home page

    Examples: 
      | username                | password                         |
      | qtester94+Bob@gmail.com | uE9pEieVNs289u45J+1qGHh+mnHPFkWy |
      
      
      
  
      
      
