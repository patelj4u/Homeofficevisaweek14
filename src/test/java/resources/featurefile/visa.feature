Feature: Visa Check

  As a User I Want to check Different Country Visa Confimation Test

  Background:
    Given User on Home Page
    When I click Accecpt Cookies
    And I click start Button


  Scenario:User Should check Australian Coming To UK For Tourism
    And I select from dropdown Nationality as "Australia"
    And I click on continue button
    And I select reasonfortravel
    And I click on Continue button
    Then I Can see the result "You will not need a visa to come to the UK"

  Scenario:  User Should  Check a Chilean Coming To The UK For Work And Plans On Staying For Longer Than Six Months
    And I select from dropdown Nationality as "Chile"
    And I click on continue button
    And I select reason for travel for work
    And I click next stepbutton
    And I select length of stay
    And I cilck next step button
    And I select Type of job
    And I click Next step button
    Then I can see the Result "You need a visa to work in health and care" successfully


  Scenario:User Should Check Columbian National Coming To The UK To Join A Partner For A Long Stay
    And I select from dropdown Nationality as "Cambodia"
    And I click on continue button
    And I select from dropdown reason for stay with partner or family
    And I click next stepbutton
    And I select on YES FOR FAMILY VISA STATUS
    And I click Next step button
    Then I can see the result message "You’ll need a visa to join your family or partner in the UK"




