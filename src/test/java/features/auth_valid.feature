Feature: Check authorization work on the website
         Valid data

  Background: open home page
    Given Open home page

  Scenario: Login to the website ( test data: http://automationpractice.com/index.php );
    Given User navigates to login page
    Then User was redirected to login page
    When User enters username and password
    And clicks on enter button
    Then Success redirect to account page

