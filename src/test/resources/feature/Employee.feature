@employee
Feature: Employee
  In order to manage employee records 
  As a admin 
  I want to add, edit, delete employee records

  Scenario Outline: Add Valid Employee
    Given I have browser with orange HRM application
    When I enter username as '<username>'
    And I enter password as '<password>'
    And I click on login
    And I click on PIM menu
    And I click on Add employee menu
    And I fill the employee details
      | firstname | middlename | lastname |
      | <fname>   | <mname>    | <lname>  |
    And I click on save
    Then I should get the profile name as '<expected_name>'

    Examples: 
      | username | password | fname | mname | lname | expected_name |
      | Admin    | admin123 | john  | m     | wick  | john wick     |
      #| Admin    | admin123 | peter | m     | wick  | peter wick    |
