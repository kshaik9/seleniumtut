Feature: Launch Google Page

  Scenario: Verify Google Page Successful Login
    Given browser is opened
    When "http://www.google.com" is accessed
    Then user see google home page