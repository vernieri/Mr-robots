Feature: Test Facebook smoke scenario
	
	Scenario: Test Login with valid credentials
	Given Open firefox and start application
	When I enter valid "email@email.com" and valiad "pass123"
	Then user should be able to login sucessfully 
	Then application should be closed
	
