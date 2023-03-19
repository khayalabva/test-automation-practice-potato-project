
@upgenix @smoke @login
Feature: Login functionality verification




  #AC01
  Scenario Outline: Users can log in with valid credentials
    Given user in on sign in page
    When user enters valid username "<validUsername>"
    And user enters valid password "<validPassword>"
    And user clicks login button
    Then user should see a homepage

    Examples:
      | validUsername            | validPassword |
      | salesmanager15@info.com  | salesmanager  |
      | salesmanager103@info.com | salesmanager  |
      | salesmanager75@info.com  | salesmanager  |
      | posmanager10@info.com    | posmanager    |
      | posmanager59@info.com    | posmanager    |
      | posmanager145@info.com   | posmanager    |



  #AC02
  Scenario Template:  Users should see "Wrong login/password" message displayed for invalid credentials
    Given user in on sign in page
    When user enters invalid username "<invalidUsername>"
    And user enters invalid password "<invalidPassword>"
    And user clicks login button
    Then user should see WrongUsernameOrPassword message displayed

    Examples:
      | invalidUsername          | invalidPassword |
      | ssalesmanager15@info.com | salesmanager1   |
      | psosmanager145@info.com  | posmanager4     |

@wip
  #AC03
  Scenario: Users should see "Please fill out this field" message displayed if the password or username is empty
    Given user in on sign in page
    
    Then user should see PleaseFillOutThisField message displayed


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









