Feature: Navigate Action
 
Scenario: Navigate portal
	Given User is on Home Page
	When User Navigate to Companies Page
	And Navigate to Anthem Blue Cross Page
	Then Message displayed Navigation Successful