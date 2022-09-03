Feature: Second Feature

  Scenario Outline: FB login4
    Given Open the Facebook and launch the application
    When Enter the Username as "<arg1>" and Password as "<arg2>"
    Then Close the browser
    Examples:
    |arg1|arg2|
    |Syed|pwd|