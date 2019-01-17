Feature: Create account on the application

  This feature is to verify the possible flows of create account on the application

  @VerifyCreateAccountStatusUsingCreateFreeAccount @Automation
  Scenario Outline: Verify Create account status for user using Create Free account option from home page
    Given I navigate to the initial state of application
    When I attempt to create an Account using a valid email
    And  Using my <GivenName> and <LastName>
    Then My account <Status> created successfully
    Examples:
    | GivenName | LastName| Status|
    | TestUser  | TestName| is    |
    | Test123   | Test123 | is    |
    | Test@     | Tes,1   | is not|

  @VerifyCreateAccountUsingSignInOption @Manual
  Scenario: Verify Create account is possible using Sign in option
    Given I navigate to the initial state of application
    When I attempt to sign in using an unregistered email
    Then Registration form is displayed
    And Registration is successful when all the details are provided correctly


  @VerifyCreateAccountStatusUsingCreateAccountOptionFromHeaderBar @Manual
  Scenario Outline: Verify Create account status for user using Create account option from header bar
    Given I navigate to the initial state of application
    When I attempt to create an Account using a valid email
    And  Using my <GivenName> and <LastName>
    Then My account <Status> created successfully
    Examples:
      | GivenName | LastName| Status|
      | TestUser  | TestName| is    |
      | Test123   | Test123 | is    |
      | Test@     | Tes,1   | is not|

  @VerifyUserCannotRegisterWithAlreadyRegisteredEmailAddress @Manual
  Scenario: Verify Sign in option is displayed when you attempt create account with registered email
    Given I navigate to the initial state of application
    When I attempt to create an Account using already Registered email
    Then Sign-in form is displayed rather than registaration form

  @VerifyUserCan'tRegisterWithInvalidEmailAddress @Manual
  Scenario: Verify user can't register with an invalid email
    Given I navigate to the initial state of application
    When I attempt to create an Account using an invalid email
    Then Error message is Displayed under email text field
