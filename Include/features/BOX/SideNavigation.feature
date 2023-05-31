Feature: Side navigation option

  Scenario Outline: All navigation option is present
    Given User navigates to login page
    When User enters valid <username> and <password>
    And Click on the login button
    Then All navigation option is present

    Examples: 
      | username                | password                         |
      | qtester94+Bob@gmail.com | uE9pEieVNs289u45J+1qGHh+mnHPFkWy |

  Scenario Outline: Recents side navigation option can be clicked
    Given User navigates to login page
    When User enters valid <username> and <password>
    And Click on the login button
    And Click on the Recent side navigation option
    Then User is redirected to the Recent page

    Examples: 
      | username                | password                         |
      | qtester94+Bob@gmail.com | uE9pEieVNs289u45J+1qGHh+mnHPFkWy |

  Scenario Outline: Synced side navigation option can be clicked
    Given User navigates to login page
    When User enters valid <username> and <password>
    And Click on the login button
    And Click on the Synced side navigation option
    Then User is redirected to the Sync page

    Examples: 
      | username                | password                         |
      | qtester94+Bob@gmail.com | uE9pEieVNs289u45J+1qGHh+mnHPFkWy |

  Scenario Outline: Canvas side navigation option can be clicked
    Given User navigates to login page
    When User enters valid <username> and <password>
    And Click on the login button
    And Click on the Canvas side navigation option
    Then User is redirected to the Canvas page

    Examples: 
      | username                | password                         |
      | qtester94+Bob@gmail.com | uE9pEieVNs289u45J+1qGHh+mnHPFkWy |

  Scenario Outline: Notes side navigation option can be clicked
    Given User navigates to login page
    When User enters valid <username> and <password>
    And Click on the login button
    And Click on the Notes side navigation option
    Then User is redirected to the Notes page

    Examples: 
      | username                | password                         |
      | qtester94+Bob@gmail.com | uE9pEieVNs289u45J+1qGHh+mnHPFkWy |

  Scenario Outline: Sign side navigation option can be clicked
    Given User navigates to login page
    When User enters valid <username> and <password>
    And Click on the login button
    And Click on the Sign side navigation option
    Then User is redirected to the Sign page

    Examples: 
      | username                | password                         |
      | qtester94+Bob@gmail.com | uE9pEieVNs289u45J+1qGHh+mnHPFkWy |

  Scenario Outline: Apps side navigation option can be clicked
    Given User navigates to login page
    When User enters valid <username> and <password>
    And Click on the login button
    And Click on the Apps side navigation option
    Then User is redirected to the Apps page

    Examples: 
      | username                | password                         |
      | qtester94+Bob@gmail.com | uE9pEieVNs289u45J+1qGHh+mnHPFkWy |

  Scenario Outline: Bin side navigation option can be clicked
    Given User navigates to login page
    When User enters valid <username> and <password>
    And Click on the login button
    And Click on the Bin side navigation option
    Then User is redirected to the Bin page

    Examples: 
      | username                | password                         |
      | qtester94+Bob@gmail.com | uE9pEieVNs289u45J+1qGHh+mnHPFkWy |

  Scenario Outline: My collection side navigation option can be clicked
    Given User navigates to login page
    When User enters valid <username> and <password>
    And Click on the login button
    And Click on the My collection side navigation option
    Then User is redirected to the My collection page

    Examples: 
      | username                | password                         |
      | qtester94+Bob@gmail.com | uE9pEieVNs289u45J+1qGHh+mnHPFkWy |

  Scenario Outline: Favourites side navigation option can be clicked
    Given User navigates to login page
    When User enters valid <username> and <password>
    And Click on the login button
    And Click on the Favourites side navigation option
    Then User is redirected to the Favourites page

    Examples: 
      | username                | password                         |
      | qtester94+Bob@gmail.com | uE9pEieVNs289u45J+1qGHh+mnHPFkWy |

  Scenario Outline: All files side navigation option can be clicked
    Given User navigates to login page
    When User enters valid <username> and <password>
    And Click on the login button
    And Click on the All files side navigation option
    Then User is redirected to the All Files page

    Examples: 
      | username                | password                         |
      | qtester94+Bob@gmail.com | uE9pEieVNs289u45J+1qGHh+mnHPFkWy |
