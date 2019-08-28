Feature: Wikipedia search
  Scenario: Search wiki page for ALICE
    Given Keyword for search is "ALICE company"
    When User does search
    Then Wiki page "ALICE (company)" is on the first page