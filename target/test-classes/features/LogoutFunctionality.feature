@UPGNX10-211 @smoke @logout
  Feature: LogOut Functionality Verification

@UPGNX10-304
#AC1
  Scenario: User logs out and ends up in login page.
  Given user in on home page
  When user clicks to his username on the top right
  And user clicks logout button
  Then user ends up on the login page

@UPGNX10-305
#AC2
  Scenario: User cannot go to the home page by clicking the step back button after successfully logged out
  Given user in on home page
  When user clicks to his username on the top right
  And user clicks logout button
  And user ends up on the login page
  And user clicks back button
  Then user sees SessionExpired message displayed

@UPGNX10-306
#AC
  Scenario: User must be logged out if the user closes the open tab or tabs
  Given user in on home page
  When user closes the only open tab
  And user opens a new tab and goes to the homepage
  Then user ends up on the login page