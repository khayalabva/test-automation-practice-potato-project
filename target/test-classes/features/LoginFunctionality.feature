@upgenix @smoke @login
Feature: Login functionality verification

  @UPGNX10-239
  #AC01
  Scenario Outline: Users can log in with valid credentials
    Given user in on sign in page
    When user enters username "<username>"
    And user enters password "<password>"
    And user clicks login button
    Then user should see a homepage

    Examples: valid username and valid password
      | username                 | password     |
      | salesmanager15@info.com  | salesmanager |
      | salesmanager103@info.com | salesmanager |
      | salesmanager75@info.com  | salesmanager |
      | posmanager10@info.com    | posmanager   |
      | posmanager59@info.com    | posmanager   |
      | posmanager145@info.com   | posmanager   |


  @UPGNX10-240
  #AC02
  Scenario Outline:  Users should see "Wrong login/password" message displayed for invalid credentials
    Given user in on sign in page
    When user enters username "<username>"
    And user enters password "<password>"
    And user clicks login button
    Then user should see WrongUsernameOrPassword message displayed

    Examples: invalid username, invalid password
      | username                 | password      |
      | ssalesmanager15@info.com | salesmanager1 |
      | psosmanager145@info.com  | posmanager4   |

    Examples: valid username, invalid password
      | username                 | password      |
      | salesmanager15@info.com  | salesmanager3 |
      | salesmanager103@info.com | posmanager7   |

    Examples: invalid username, valid password
      | username                 | password     |
      | salesmanager106@info.com | salesmanager |
      | posmanager160@info.com   | posmanager   |


 @UPGNX10-241
  #AC03
  Scenario: Users should see "Please fill out this field" message displayed if the password or username is empty
    Given user in on sign in page
    When user clicks login button
    Then user should see PleaseFillOutThisField message displayed


 @UPGNX10-242
  #AC04
  Scenario:  Users should see the password in bullet signs by default while typing (like ****)
    Given user in on sign in page
    When user enters password "salesmanager"
    Then user should see the the password in bullet signs by default


 @UPGNX10-244
  #AC05
  Scenario:  Users should be able to use the ‘Enter’ key of the keyboard correctly on the login page.
    Given user in on sign in page
    When user enters username "salesmanager15@info.com"
    And user enters password "salesmanager"
    And user pushes ENTER button on the keyboard
    Then user should see a homepage









