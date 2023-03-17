Feature: Login functionality verification

  Given user in on sign in page

      #AC01
  Scenario: Users can log in with valid credentials
    When user enters valid username
    And user enters valid password
    And user clicks login button
    Then user should see a homepage


       #AC02
  Scenario:  Users should see "Wrong login/password" message displayed for invalid credentials (password and username)
    When user enters invalid username
    And user enters invalid password
    And clicks login button
    Then user should see "Wrong login/password" message displayed


      #AC02.1
  Scenario:  Users should see "Wrong login/password" message displayed for invalid credentials (only password)
    When user enters valid username
    And user enters invalid password
    And clicks login button
    Then user should see "Wrong login/password" message displayed


      #AC02.2
  Scenario:  Users should see "Wrong login/password" message displayed for invalid credentials (only username)
    When user enters invalid username
    And user enters valid password
    And clicks login button
    Then user should see "Wrong login/password" message displayed



      #AC03
  Scenario:  Users should see "Please fill out this field" message displayed if the password or username is empty
    When user clicks login button
    Then user should see "Please fill out this field" message displayed




