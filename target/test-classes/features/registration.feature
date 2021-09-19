Feature: Registration
  Scenario: Valid Registration
Given I navigate to BlueSkyCitadel link
    And I click on register link
    When I fill in the registration details
    Then I am registered