@Regression  @User2
Feature: Testing search

  @Google
  Scenario Template: Google search
    When go to 'https://www.google.com' website
    Then Enter '<Products>' in search box


    Examples:
      | Products |
      | apple    |
      | macBook  |
      | iphone   |

  Scenario Template: Google search
    When go to 'https://www.amazon.com/' website
    And enter '<Products>' in the new Search box

    Examples:
      | Products |
      | apple    |
      | macBook  |
      | iphone   |
