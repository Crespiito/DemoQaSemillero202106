Feature: Mathematical operation in calculator
  As a user
  I Want to use a calculator to perform an operation
  And check the result

  Scenario: Calculating with basic arithmetic operations - Sum
    Given I have a calculator
    When I add 4 and 7
    Then the sum should be 11

  Scenario: Calculating with basic arithmetic operations - Subtract
    Given I have a calculator
    When I subtract 9 and 2
    Then the subtract should be 7

  Scenario: Calculating with basic arithmetic operations - Multiply
    Given I have a calculator
    When I multiply 11 and 4
    Then the multiply should be 44

  Scenario: Calculating with basic arithmetic operations - Divide
    Given I have a calculator
    When I divide 30 and 3
    Then the divide should be 10