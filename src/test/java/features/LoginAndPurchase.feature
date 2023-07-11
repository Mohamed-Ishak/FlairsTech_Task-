Feature: Login , Add items to cart and verify the calculated price

  @login
  Scenario Outline:

    Given  User is navigated to Jumia website URL
    When   User shall close the POP-UP subscriber window
    When   User click on the Account dropdownList
    And    User select My Account option
    When   User is entered a valid "<email>" and press on Continue button
    And    User is entered a valid "<password>"
    And    User press on Login button
    And    User hover on the hamburger menu then hover on Supermarket
    And    user checked that items are added successfully
    Then   User checked that the total price of items is calculated correctly




    Examples:

    |       email         |    password        |
    |testrc@mailinator.com|   Abs125$GE        |