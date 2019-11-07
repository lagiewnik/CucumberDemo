Feature: Application login

  Scenario: Home page default login
    Given User is on Banking landing page
    When User Login into application with "john" and password "1234"
    Then Home Page is populated
    And Cards are displayed


  Scenario: Home page default login
    Given User is on Banking landing page
   When User Login into application with "mania" and password "dupa123"
    Then Home Page is populated
    And Cards are displayed