Feature: Title verifications
  As a user When  go to website of onpier do some verifications about Personal Data Step 2

  @wip
  Scenario: Title verification for Cydeo
    Given I am on onpier onboarding page
    When I click pramie beantragen
    And I upload PDF files to vorderseite and rückseite
    And I click weiter
    Then verify that I am in the personal information page

    @wip2
    Scenario: Vorname verification
      Given I am on onpier onboarding page
      When I click pramie beantragen
      And I upload PDF files to vorderseite and rückseite
      And I click weiter
      And I send digits for vorname
      And I complete all the next processes
      Then verify that I can not go to the next page and can not complete process

      @wip3
      Scenario: Vorname verification
        Given I am on onpier onboarding page
        When I click pramie beantragen
        And I upload PDF files to vorderseite and rückseite
        And I click weiter
        And I fill the all the ares up to card number
        And I enter a number for car which does not start with DE
        Then verify than I can not go on






















