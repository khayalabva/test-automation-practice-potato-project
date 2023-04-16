@UPGNX10-211 @smoke @sales
Feature: Sales Functionality Verification

  #AC1
  @UPGNX10-354
  Scenario:  User can reach New Customer Form by clicking Sales --> Customers --> Create.
    Given user in on home page
    When user clicks Sales button
    And user clicks Customers button
    And user clicks Create button
    Then user reaches New Customer Form

  #AC2
  @UPGNX10-355
  Scenario: User sees an error message "The following fields are invalid:" displayed
  if customer name field is left blank.
    Given user in on home page
    When user clicks Sales button
    And user clicks Customers button
    And user clicks Create button
    Then user clicks Save button
    Then  user sees an error message displayed

  #AC3
  @UPGNX10-356
  Scenario: AC3- Verify that after creating a new customer, the page title includes the customer name.
