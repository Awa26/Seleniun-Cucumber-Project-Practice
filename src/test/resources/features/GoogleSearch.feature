@smoke
Feature: Google search functionality
  Agile story: As a user, when i am on the Google search page I should be able to search anything ans see
  relevant results
  Background:  For all scenarios user is on the Google search page
    When user is on the google search page
@wip
  Scenario: Search page default title verification
    Then user should see title is Google

   # MAC --> command + option + L
    # WINDOWS --> control + option + L

  @google
  Scenario: Search result title verification
    When user searches for apple
    Then user should see apple in the title
    #And user sees 3 apples