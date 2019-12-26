Feature: Check authorization work on the website
  Valid data

  Scenario: : Login to the website ( test data: http://automationpractice.com/index.php );

    Given Open home page
    Given User navigates to login page
    Then User was redirected to login page

  Scenario: check authorization with empty fields
    When email and password are empty
    And clicks on enter button
    Then validation message appears An email address required

  Scenario: check authorization with invalid email
    When invalid email entered
    And clicks on enter button
    Then validation message appears Invalid email address


  Scenario: Email and password are empty
    Given Open homepage and loginpage
    When email and password are empty
    And clicks on enter button
    Then validation message appears An email address required

  Scenario: invalid email entered
    When invalid email entered
    And Сlick on Sign button
    Then validation message appears Invalid email address