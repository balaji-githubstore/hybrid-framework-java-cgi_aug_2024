@login
Feature: Login
  In order to maintain the employee records
  As an admin
  I would like to login into the portal

  Background: 
    Given I have browser with orange HRM application

  @valid @smoke
  Scenario: Valid Login
    When I enter username as 'Admin'
    And I enter password as 'admin123'
    And I click on login
    Then I should get access to portal with dashboard page header as 'Quick Launch'

  @invalid
  Scenario Outline: Invalid Login
    When I enter username as '<username>'
    And I enter password as '<password>'
    And I click on login
    Then I should not get access to portal with error '<expected_error>'

    Examples: 
      | username | password  | expected_error      |
      | peter    | peter123  | Invalid credentials |
      | kevin    | kevein123 | Invalid credentials |
