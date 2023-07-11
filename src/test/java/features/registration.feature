Feature: Validate Registration Functionality

  @register
  Scenario Outline: Verify that user can register to Jumia.com successfully

      Given  User is navigated to Jumia website URL
      When   User shall close the POP-UP subscriber window
      When   User click on the Account dropdownList
      And    User click on Sign-In button
      Then   Welcome to Jumia context is displayed and user can enter a valid email
      When   User is entered a valid "<email>" and click on Continue button
      And    User is entered a valid "<password>",confirmPassword and click on Continue button
      And    Personal details context is displayed and user cam enter "<fName>","<lName>" , "<phoneNumber>" and click on continue button
      And    User can select a gender , "<birthdate>" and checked terms and conditions checkBox then click on continue button

      Examples:
      |        email        |   password         |    fName   |    lName         |    phoneNumber     | birthdate  |
      |testgdfxd@mailinator.com|   Abs125$GE        |    Ahmed   |    Hassan        |    1061398306     | 01/05/2005 |






