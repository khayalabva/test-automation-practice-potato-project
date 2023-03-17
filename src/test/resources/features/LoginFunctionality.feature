Feature: Login functionality verification

  Given user in on sign in page

  #AC01
  Scenario: Users can log in with valid credentials
    When user enters valid username
    And user enters valid password
    And user clicks login button
    Then user should see a homepage


  #AC02
  Scenario:  Users should see "Wrong login/password" message displayed for invalid credentials
    When user enters invalid username
    And user enters invalid password
    And clicks login button
    Then user should see "Wrong login/password" message displayed

    When user enters valid username
    And user enters invalid password
    And clicks login button
    Then user should see "Wrong login/password" message displayed


    When user enters invalid username
    And user enters valid password
    And clicks login button
    Then user should see "Wrong login/password" message displayed


  #AC03
  Scenario:  Users should see "Please fill out this field" message displayed if the password or username is empty
    When user clicks login button
    Then user should see "Please fill out this field" message displayed


  #AC04
  Scenario:  Users should see the password in bullet signs by default while typing (like ****)
    When user enters valid password
    Then user should see the the password in bullet signs by default


  #AC04
  Scenario:  Users should see the password in bullet signs by default while typing (like ****)
    When user enters valid password
    Then user should see the the password in bullet signs by default


  #AC05
  Scenario:  Users should be able to use the ‘Enter’ key of the keyboard correctly on the login page.
    When user enters valid username
    And user enters valid password
    And user pushes 'enter' button on the keyboard
    Then user should see a homepage









