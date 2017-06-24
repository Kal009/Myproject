Feature: verify every button is working properly
  Scenario: verify the search button is working
  Given: I am on the home page
  When I go to search
  And send some value in there
  Then It should navigate to particular page.

